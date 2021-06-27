package untitled15;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;
public class Head extends JFrame
  {
 public static ArrayList addAlgoArray;
public static JMenuItem[] jmi=new JMenuItem[50];
static File[] listFile=new File[50];
public static ArrayList listFileName;
static String[] test01=new String[50];
static int jjj=0;
 private JMenuBar menuBar = new JMenuBar();
 private  JMenu menu = new JMenu(" File ");
 private   JMenuItem itemNew = new JMenuItem(" New ");
 private   JMenuItem itemOpen = new JMenuItem(" Open ");
 private   JMenuItem itemExit = new JMenuItem(" Exit ");
////////////////////////////////////////////////////////////////////////

 private static  JMenu menuAlgo = new JMenu(" Algorithm ");
 private JMenuItem itemDijk = new JMenuItem(" Dijkstra ");


 ///////////////////////////////////////////////////////////////////////
 private   JMenuItem itemDraw = new JMenuItem(" Draw ");
 private  JMenu menuGraph = new JMenu(" Graph ");
 private   JMenuItem itemDrawTest = new JMenuItem(" DrawByHand ");
 private   JMenuItem itemNewAlog = new JMenuItem(" New Alogrithm ");
/////////////////////////
 private static JDesktopPane jDesktopPane=new JDesktopPane();
 private File openFile;
 private static String ss="";
 private static File algoFile;
public Head()
{
super.setTitle("Routing Algorathim");


 menuBar.add(menu);
 menu.add(itemNew);
 menu.add(itemOpen);
 menu.add(itemExit);
 menuBar.add(menuAlgo);
 menuGraph.add(itemDraw);
 menuGraph.add(itemDrawTest);
 menuBar.add(menuGraph);
 try{
 algoFile= new File(untitled15.Head.class.getResource("images/AlgoList.txt").getFile());
 }catch(Exception ex){}
 addAlgoArray=new ArrayList();
listFileName=new ArrayList();
 //////////////////////////////
 menuAlgo.add(itemNewAlog);
 menuAlgo.add(itemDijk);

 ///////////////////////////////


 this.setJMenuBar(menuBar);

       this.getContentPane().add(jDesktopPane);
       this.setSize(800,600);
       this.setVisible(true);
       itemNew.addActionListener(new ActionListener()
       {
        public void actionPerformed(ActionEvent e)
        {
          itemNew_actionPerformed(e);
        }
    });


       itemDraw.addActionListener(new ActionListener()
       {
        public void actionPerformed(ActionEvent e)
        {
          itemDraw_actionPerformed(e);
        }
    });

       itemDrawTest.addActionListener(new ActionListener()
       {
        public void actionPerformed(ActionEvent e)
        {
          itemDrawTest_actionPerformed(e);
        }
    });

       itemNewAlog.addActionListener(new ActionListener()
       {
        public void actionPerformed(ActionEvent e)
        {
         itemNewAlgo(e);
        }
    });


       itemOpen.addActionListener(new ActionListener()
           {
            public void actionPerformed(ActionEvent e)
            {
              itemOpen_actionPerformed(e);
            }
        });




      itemExit.addActionListener(new ActionListener()
   {
     public void actionPerformed(ActionEvent e)
     {
       itemExit_actionPerformed(e);
     }
   });
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }

    itemDijk.addActionListener(new ActionListener()
      { public void actionPerformed(ActionEvent e)
    {
    itemDijk_actionPerformed(e);
}});

  addAlog (test01);

 }
////////////////////////////////
 //add algo to list
 public static void addAlog(String[] algorithm)
 {
     String allAlgo="";
 for(int i=0;i<algorithm.length;i++)
 {
 if(algorithm[i]!=null)
   allAlgo+=algorithm[i]+"\n";
}
 //////////////////
  //write to file



  try {

       BufferedWriter out = new BufferedWriter(new FileWriter(algoFile.getAbsolutePath(),true));
       out.write(allAlgo);
       out.close();

   } catch (IOException e) {
   }

  //////////////////
 //read file to add to list
   try {
        BufferedReader in = new BufferedReader(new FileReader(algoFile));
        String str;
        while ((str = in.readLine()) != null) {
            addAlgoArray.add(str);
//         System.out.println(str);

        }
        in.close();
    } catch (IOException e) {
    }

//nagaa
   for(int a=0;a<addAlgoArray.size();a++)
    for(int b=a;b<addAlgoArray.size();b++)
       if(addAlgoArray.get(a).equals(addAlgoArray.get(b)))
	    addAlgoArray.remove(b);




//add to the list and sure it is a class
for(int j=0;j<addAlgoArray.size();j++ )
{
   if ( (new File( ((addAlgoArray.get(j)).toString()).substring(0, ((addAlgoArray.get(j)).toString()).length() -4)+"class")).exists()) {
      listFile[j]=new File((addAlgoArray.get(j)).toString());
      listFileName.add(listFile[j].getName().substring(0,listFile[j].getName().length()-5));
  } else {
       // File does not exist
  }
}

System.out.print(listFileName);

for(int j=0;j<addAlgoArray.size();j++ )
jmi[j]=new JMenuItem((listFile[j].getName()).substring(0,(listFile[j].getName()).length()-5) );





for(int j=0;j<addAlgoArray.size();j++ )
 menuAlgo.add(jmi[j]);
/////////////////////////////////////////////////
for(;jjj<addAlgoArray.size();jjj++ )
 jmi[jjj].addActionListener(new ActionListener()
    {
     public void actionPerformed(ActionEvent e)
     {



      MyResult myResult =new MyResult("Prim");
      myResult.setSize(400,400);
      myResult.setVisible(true);
      myResult.setLocation(410,40);
      jDesktopPane.add(myResult);



     }
    });


 }

 ////////////////////////////////////////////////////
public static String filePath()
{
  return ss;
}

public static void  setfilePath(String dddd)
{
   ss=dddd;
}


public void itemNew_actionPerformed(ActionEvent e)
{
JFileChooser fc=new JFileChooser();
             fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
int result = fc.showSaveDialog(this);
if(result==JFileChooser.CANCEL_OPTION)
 { openFile=null;
   ss="";
 }
else
{
  openFile=fc.getSelectedFile();
ss= openFile.getAbsolutePath();
}



if(ss.equals(""))
   {

   if(ss.equals(null))
        {
  // itemNew_actionPerformed(e);
         }
   }
     else
     {



   try {

    File file = new File(ss);

    // Create file if it does not exist
    boolean success = file.createNewFile();
    if (success) {
        // File did not exist and was created
    } else {
        // File already exists
    }


    // Copies src file to dst file.
     // If the dst file does not exist, it is created


copy(new File(untitled15.Head.class.getResource("images/ahmad.schema").getFile()) ,new File(ss+".schema"));

myFrame2(ss);
       }
      catch (IOException ex) { ex.printStackTrace();  }

   }

}

////////////////////////////////////

public void itemExit_actionPerformed(ActionEvent e)
{

  System.exit(0);
}
  private void jbInit() throws Exception {
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }


public void myFrame2(String gg)
{
  Frame1 jInternalFrame =new Frame1(gg);
    jInternalFrame.setSize(400,500);
    jInternalFrame.setVisible(true);
    jDesktopPane.add(jInternalFrame);



}




public void  itemOpen_actionPerformed(ActionEvent e)
{
JFileChooser fc=new JFileChooser();
             fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
int result = fc.showOpenDialog(this);
if(result==JFileChooser.CANCEL_OPTION)
  openFile=null;
else
{
  openFile=fc.getSelectedFile();
  ss= openFile.getAbsolutePath();
  myFrame2(ss);


}
}


public void itemDijk_actionPerformed(ActionEvent e)
{

    MyResult myResult =new MyResult("Dijkstra");
    myResult.setSize(400,400);
    myResult.setVisible(true);
    myResult.setLocation(410,40);
    jDesktopPane.add(myResult);


}



public void itemDraw_actionPerformed(ActionEvent e)
  {

  MyGraph myGrahp =new MyGraph(ss);
  myGrahp.setSize(600,500);
  myGrahp.setVisible(true);
  myGrahp.setLocation(100,5);
  jDesktopPane.add(myGrahp);

  }


  public void itemNewAlgo(ActionEvent e)
    {

    JEditor NmyGrahp =new  JEditor();
            NmyGrahp.setClosable(true);

    jDesktopPane.add(NmyGrahp);

  }

  public void itemDrawTest_actionPerformed(ActionEvent e)
    {
/*
    JFileChooser fc=new JFileChooser();
                 fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
    int result = fc.showSaveDialog(this);
    if(result==JFileChooser.CANCEL_OPTION)
     { openFile=null;
       ss="";
     }f
    else
    {
      openFile=fc.getSelectedFile();
      ss= openFile.getAbsolutePath();
    }



    if(ss.equals(""))
       {

       if(ss.equals(null))
            {
      // itemNew_actionPerformed(e);
             }
       }
         else
         {



       try {

        File file = new File(ss);
        File file22 = new File(ss+".vertex");

        // Create file if it does not exist
        boolean success = file.createNewFile();
       boolean success22 = file22.createNewFile();
        if (success) {
            // File did not exist and was created
        } else {
            // File already exists
        }


        // Copies src file to dst file.
         // If the dst file does not exist, it is created


    copy(new File(untitled15.Head.class.getResource("ahmad.schema").getFile()) ,new File(ss+".schema"));

*/
    GraphByHand f = new GraphByHand("ss");
            f.setTitle("MyTestGraph");
            f.setClosable(true);
            f.setIconifiable(true);
            f.setResizable(true);
            f.setMaximizable(true);
            f.setSize(600,500);
            f.setVisible(true);
            f.setLocation(100,5);
            jDesktopPane.add(f);
/*
           }
          catch (IOException ex) { ex.printStackTrace();  }

     }

*/
  }



public void copy(File src, File dst)  {
  try
  {
      InputStream in = new FileInputStream(src);
      OutputStream out = new FileOutputStream(dst);

      // Transfer bytes from in to out
      byte[] buf = new byte[1024];
      int len;
      while ((len = in.read(buf)) > 0) {
          out.write(buf, 0, len);
      }
      in.close();
      out.close();

  }
  catch(Exception exxx){}
}


  }