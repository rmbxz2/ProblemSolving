package untitled15;
import java.io.*;
import java.util.*;

public class Analysis
{

        private  String u;
        private  ArrayList T = new ArrayList();
        private  final double infi = Double.MAX_VALUE;
        private  ArrayList V = new ArrayList();
        private  ArrayList VE = new ArrayList();
        private  double mAdj[][];
        private  double L[];
        private  double mymadj[][];
        private  String my2d[][];


  public Analysis(String ss)
  {
    analysisFile(ss);
  }

  public String[][] getMy2d()
  {
return my2d;
  }

  public double[][] getMAdj()
  {
   return mAdj;
  }

  public  ArrayList getV()
  {
   return   V ;
  }


  //---------------------------------------------------------------

    public  void analysisFile(String fname)  {

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

/*
for(int i=0;i<VE.size();i++)
   System.out.println(VE.get(i));
*/

parseE();

           }
  catch (Exception ex1){
 //System.out.println("Erorr int the Net");
 ex1.printStackTrace();
 } }




    //recebe string de arestas e seta matriz de adj
    private  void parseE() {

            //inicializa matriz de adjacencias com dimensao nxn
            mAdj = new double[V.size()][V.size()];

            //inicializa
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



    /////////////////////////////




        my2d = new String[V.size()*V.size()/2][2];



                for (int x=0; x < my2d.length; x++)
                        for (int y=0; y < my2d[0].length; y++)
                            my2d[x][y]="_";




                int mycounter=0;
                   for (int x=0; x < V.size(); x++)
                           for (int y=0; y < V.size(); y++)
                               if( mAdj[x][y] != infi )
                                   {

                    my2d[mycounter][0] = (V.get(x)).toString() ;
                    my2d[mycounter][1] = (V.get(y)).toString() ;
                    mycounter++;

                                }


    }

 //the end
}