package untitled15;
import java.io.*;
import java.util.*;

public class Dijkstra {

        private  String u;
        public  ArrayList T = new ArrayList();
        private  final double infi = Double.MAX_VALUE;
        private  ArrayList V = new ArrayList();
        private  ArrayList VE = new ArrayList();
        private  double mAdj[][];
        private  double L[];
        private  double mymadj[][];
        private  String my2d[][];
        private  String myshort[];


public Dijkstra(String fileName,String graphSource)
{
  readFile(fileName);
  run(graphSource,false);
}


        public  void readFile(String fname)  {

                        try{

       RandomAccessFile raf = new RandomAccessFile(fname+".vertex", "r");
       byte[] b = new byte[(int)raf.length()];
       raf.read(b);
       raf.close();
       String s = new String(b);

  for ( StringTokenizer st = new StringTokenizer(s);  st.hasMoreTokens() ; )
          V.add(st.nextToken());



        RandomAccessFile raf2 = new RandomAccessFile(fname, "r");
        byte[] b2 = new byte[(int)raf2.length()];
     raf2.read(b2);
           raf2.close();
    String s2 = new String(b2);

    for ( StringTokenizer st2 = new StringTokenizer(s2," \t\n\"");  st2.hasMoreTokens() ; )
              VE.add(st2.nextToken());





  parseE();

               }
      catch (Exception ex1){
     System.out.println("Erorr int the graph");
     ex1.printStackTrace();
     } }





        private  void parseE() {


                mAdj = new double[V.size()][V.size()];


                for (int x=0; x < V.size(); x++)
                        for (int y=0; y < V.size(); y++)
                                        mAdj[x][y] = infi;



                int r, c,i=0;
                 double p;

               do{

               r=V.indexOf((VE.get(i)).toString());
               c=V.indexOf((VE.get(++i)).toString());
               p=Double.parseDouble((VE.get(++i)).toString());
                   mAdj[r][c] = p;
                   ++i;
               }
               while(i<VE.size());


        }


        //---------------------------------------------------------------


       public  void printMAdj(){
                        for (int i=0; i < V.size(); i++) {
                                System.out.println('\n');
                                for (int j=0; j < V.size(); j++)
                                        if (mAdj[i][j] != infi)
                                                System.out.print(" " + mAdj[i][j]);
                                        else
                                                System.out.print(" " + "-");
                        }

                        System.out.print("\n");
        }


        //---------------------------------------------------------------


       public  boolean buildL() {

                try {

                int pos = V.indexOf(u);

                L = new double[V.size()];

                for (int i=0; i < V.size(); i++)
                                        L[i] = mAdj[pos][i];

                //L(u)
                L[pos] = 0;
                }
                catch (IndexOutOfBoundsException e) {
                        System.out.println("the source ( "+ u + " )is not exist ");
                        return false;
                }

                return true;

        }

        //---------------------------------------------------------------



        public  void printL() {
                System.out.print("\n");
                for (int i=0; i < V.size(); i++) {
                        if (L[i] != infi)
                                System.out.print(" " + L[i]);
                        else
                                System.out.print(" -");
                }
        }


        public String  printL2() {
         String coll="";
             //   System.out.print("\n");
                        for (int i=0; i < V.size(); i++)
                                if (L[i] != infi)
                                        coll+=("L(" + V.get(i) + ")=" + L[i]+"\n");
                                else
                                        coll+=("L(" + V.get(i) + ")=infi"+"\n");
                                return coll;
        }

        //---------------------------------------------------------------

        //execute dijkstra
        public  void run(String vInicial, boolean debug) {



                u = vInicial;


                if (!buildL()) return;

                T.add(u);

                if (debug)
                        for (int k=0; k < V.size(); k++)
                                System.out.print(" " + V.get(k));


                while (!T.containsAll(V)) {
                        if (debug) printL();
                        String vLinha = findMinL();

                        T.add(vLinha);

                        updateL(vLinha);
                }

                if (debug)
                        System.out.println("\nfim");
                else
                        printL2();


        }

        //---------------------------------------------------------------

        public  void printV() {
                System.out.print("\n");
                for (int k=0; k < V.size(); k++)
                        System.out.print(" " + V.get(k));

        }

        public  void printT() {
                System.out.print("\n");
                for (int k=0; k < T.size(); k++)
                        System.out.print(" " + T.get(k));
        }


        //---------------------------------------------------------------

        public  void updateL(String vLinha) {

                int i;

                ArrayList V2 = new ArrayList(V);


                for (i=0; i < T.size(); i++)
                        V2.remove(V2.indexOf(T.get(i)));


                for (i=0; i < V2.size(); i++) {
                        String vaux = (String)V2.get(i);
                        double w = L[V.indexOf(vLinha)] + mAdj[V.indexOf(vLinha)][V.indexOf(vaux)];

                        if  (w < L[V.indexOf(vaux)])
                                L[V.indexOf(vaux)] = w;
                }

        }



        //---------------------------------------------------------------

        public  String findMinL() {

                int i;
                //V2 = V
                ArrayList V2 = new ArrayList(V);


                for (i=0; i < T.size(); i++)
                        V2.remove(V2.indexOf(T.get(i)));


                double pmin = infi;
                String v = "";


                for (i=0; i < V2.size(); i++) {

                        String vaux = (String)V2.get(i);

                        if (L[V.indexOf(vaux)] <= pmin) {
                                v = vaux;
                                pmin = L[V.indexOf(vaux)];
                        }

                }


                return v;
        }



public  String shortPath()
{
                mymadj = new double[V.size()][V.size()];

                //clone
                for (int x=0; x < V.size(); x++)
                        for (int y=0; y < V.size(); y++)
                                mymadj[x][y]=mAdj[x][y] ;


                for (int x=0; x < V.size(); x++)
                        for (int y=0; y < V.size(); y++)
                            if( mymadj[x][y] != Math.abs (L[y]-L[x]) )
                               mymadj[x][y]=infi;


        my2d = new String[V.size()*V.size()/2][2];



                for (int x=0; x < my2d.length; x++)
                        for (int y=0; y < my2d[0].length; y++)
                            my2d[x][y]="";



         int mycounter=0;
                for (int x=0; x < V.size(); x++)
                        for (int y=0; y < V.size(); y++)
                            if( mymadj[x][y] != infi )
                                {

                 my2d[mycounter][0] = (V.get(x)).toString() ;
                 my2d[mycounter][1] = (V.get(y)).toString() ;
                 mycounter++;

                                }


     myshort =new String[V.size()*4];
     for(int i=0;i<myshort.length;i++)
         myshort[i]=" ";



             for(int y=0; y<my2d.length; y++)
               if((my2d[y][0]).equals(((T.get(0)))))
                {
                myshort[y] =my2d[y][0] ;
                myshort[y] +=" "+my2d[y][1];

                       }



           for(int x=1;x<T.size();x++)
             for(int y=0; y<my2d.length; y++)
             {
               if((my2d[y][1]).equals(((T.get(x)))))
                {
            for( int n=0 ; n < myshort.length ;n++)
              if(((myshort[n].substring(myshort[n].lastIndexOf(" ")))).equals((" "+(my2d[y][0]))))
              {

                for( int m=0 ; m < myshort.length ;m++)
                   if((myshort[m]).equals(" "))
                   {
                          myshort[m]=myshort[n];
                          myshort[m]+=" "+T.get(x);
                          break;

                   }
               }

               }
         }

                   String sShortpath="";
               for(int i=0;i<myshort.length;i++ )
                   sShortpath+= myshort[i] +"\n" ;
return sShortpath;




        }
public  void printLT()
{
        System.out.print("\n T[] = ");
    for (int i=0; i < T.size(); i++)
    System.out.print("  "+(T.get(i)).toString()+" ");

       System.out.print("\n\n");

    System.out.print(" L[] = ");
         for (int j=0; j < L.length ; j++)
          System.out.print(" "+L[j]);
           System.out.print("\n");


        }


}
