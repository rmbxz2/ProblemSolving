package untitled15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.borland.jbcl.layout.*;
import java.io.*;
import java.util.*;



public class GraphByHand extends JInternalFrame
{
  public static String[] cutMove;
   public static String[] cutMove2;
  public static int[] intCutMove;
   public static int[] intCutMove2;
    private Dijkstra dk;
     private Prim dk2;
  ArrayList indexMove;
  ArrayList indexMove2;
  private JPanel contentPane;
  private JMenuBar jMenuBar1 = new JMenuBar();
  private JMenu jMenuFile = new JMenu();
  private JMenuItem jMenuFileExit = new JMenuItem();
  private JToolBar jToolBar = new JToolBar();
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  private ImageIcon image1;
  private ImageIcon image2;
  private ImageIcon image3;
  private JLabel statusBar = new JLabel();
  private BorderLayout borderLayout1 = new BorderLayout();
  private JPanel jPanel1 = new JPanel();
  private JPanel jPanel2 = new JPanel();
  private JScrollPane jScrollPane1 = new JScrollPane();
  private PanelByHand jPanel3 ;
  private PaneLayout paneLayout1 = new PaneLayout();
  private PaneLayout paneLayout2 = new PaneLayout();
  private JLabel jLabel1 = new JLabel();
  private JMenu jMenu1 = new JMenu();

  private JRadioButtonMenuItem jRadioButtonMenuItem1 = new JRadioButtonMenuItem();
  private JRadioButtonMenuItem jRadioButtonMenuItem2 = new JRadioButtonMenuItem();
  private JMenu jMenu2 = new JMenu();
  private JRadioButtonMenuItem jRadioButtonMenuItem3 = new JRadioButtonMenuItem();
  private JRadioButtonMenuItem jRadioButtonMenuItem4 = new JRadioButtonMenuItem();
  private JPanel jPanel4 = new JPanel();
  private JPanel jPanel5 = new JPanel();
  private JLabel jLabel2 = new JLabel();

  private JRadioButtonMenuItem jRadioButtonMenuItem5 = new JRadioButtonMenuItem();
  private JRadioButtonMenuItem jRadioButtonMenuItem6 = new JRadioButtonMenuItem();
  private JMenu jMenu3 = new JMenu();
  private JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem();
  private JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem();
  private JMenuItem jMenuItem1 = new JMenuItem();


//Construct the frame
  public GraphByHand(String mm)
  {


    jPanel3 = new PanelByHand(mm);
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    try
    {
      jbInit();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
  //Component initialization
  private void jbInit() throws Exception
  {



    image1 = new ImageIcon(untitled15.GraphByHand.class.getResource("openFile.gif"));
    image2 = new ImageIcon(untitled15.GraphByHand.class.getResource("closeFile.gif"));
    image3 = new ImageIcon(untitled15.GraphByHand.class.getResource("help.gif"));
    //setIconImage(Toolkit.getDefaultToolkit().createImage(GraphByHand.class.getResource("[Your Icon]")));
    contentPane = (JPanel) this.getContentPane();
    contentPane.setLayout(borderLayout1);
    this.setSize(new Dimension(746, 503));
    this.setTitle("Graph");
    statusBar.setText(" ");
    jMenuFile.setText("File");
    jMenuFileExit.setText("Exit");
    jMenuFileExit.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jMenuFileExit_actionPerformed(e);
      }
    });
    jButton1.setIcon(image1);
    jButton1.setToolTipText("Open File");
    jButton2.setIcon(image2);
    jButton2.setToolTipText("Close File");
    jButton3.setIcon(image3);
    jButton3.setToolTipText("Help");
    jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    jPanel1.setPreferredSize(new Dimension(200, 200));
    jPanel1.setLayout(paneLayout1);
    jPanel3.setLayout(paneLayout2);
    jLabel1.setText("jLabel1");
    jMenu1.setText("ADD");
    jMenu1.addActionListener(new GraphByHand_jMenu1_actionAdapter(this));
    jRadioButtonMenuItem1.setText("Vertex");
    jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jRadioButtonMenuItem1_actionPerformed(e);
      }
    });
    jRadioButtonMenuItem2.setText("Edge");
    jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jRadioButtonMenuItem2_actionPerformed(e);
      }
    });
    jMenu2.setText("Change");
    jRadioButtonMenuItem3.setText("Vertex");
    jRadioButtonMenuItem3.addActionListener(new GraphByHand_jRadioButtonMenuItem3_actionAdapter(this));
    jRadioButtonMenuItem4.setText("Edge");
    jRadioButtonMenuItem4.addActionListener(new GraphByHand_jRadioButtonMenuItem4_actionAdapter(this));
    jLabel2.setText("jLabel2");
    jRadioButtonMenuItem5.setText("Direcit");
    jRadioButtonMenuItem5.setSelected(true);
    jRadioButtonMenuItem5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jRadioButtonMenuItem5_actionPerformed(e);
      }
    });
    jRadioButtonMenuItem6.setText("Indirect");
    jRadioButtonMenuItem6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jRadioButtonMenuItem6_actionPerformed(e);
      }
    });
    jMenu3.setText("Del");
    jCheckBoxMenuItem1.setText("Edge");
    jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jCheckBoxMenuItem1_actionPerformed(e);
      }
    });
    jCheckBoxMenuItem2.setText("Vertex");
    jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jCheckBoxMenuItem2_actionPerformed(e);
      }
    });
    jMenuItem1.setText("Save");
    jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jMenuItem1_actionPerformed(e);
      }
    });
    jLabel3.setText("jLabel3");
    jComboBox3.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jComboBox3_itemStateChanged(e);
      }
    });
    jLabel4.setText("Label");
    jComboBox2.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jComboBox2_itemStateChanged(e);
      }
    });


    jButton4.setBackground(Color.yellow);
    jButton4.setText("Value");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton4_actionPerformed(e);
      }
    });
    jComboBox4.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jComboBox4_itemStateChanged(e);
      }
    });
    jComboBox1.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        jComboBox1_itemStateChanged(e);
      }
    });
    jComboBox1.setToolTipText("Algorithms");
    jComboBox2.setToolTipText("From Index");
    jComboBox3.setToolTipText("To Index");
    jToolBar.add(jButton1);
    jToolBar.add(jButton2);
    jToolBar.add(jButton3);
    jMenuFile.add(jMenuItem1);
    jMenuFile.addSeparator();
    jMenuFile.add(jMenuFileExit);
    jMenuBar1.add(jMenuFile);
    jMenuBar1.add(jMenu1);
    jMenuBar1.add(jMenu2);
    jMenuBar1.add(jMenu3);
    this.setJMenuBar(jMenuBar1);
    contentPane.add(jToolBar, BorderLayout.NORTH);
    contentPane.add(statusBar, BorderLayout.WEST);
    contentPane.add(jPanel1, BorderLayout.CENTER);
    jPanel1.add(jScrollPane1,        new PaneConstraints("jScrollPane1", "jScrollPane1", PaneConstraints.ROOT, 0.5f));
    jPanel1.add(jPanel4,       new PaneConstraints("jPanel4", "jScrollPane1", PaneConstraints.BOTTOM, 0.10468322f));
    jPanel4.add(jComboBox1, null);
    jPanel4.add(jButton4, null);

    jPanel4.add(jComboBox2, null);
    jPanel4.add(jComboBox3, null);
    jPanel4.add(jLabel4, null);
    jPanel4.add(jComboBox4, null);
    jScrollPane1.getViewport().add(jPanel3, null);
    contentPane.add(jPanel2, BorderLayout.EAST);
    jMenu1.add(jRadioButtonMenuItem1);
    jMenu1.add(jRadioButtonMenuItem2);
    jMenu1.addSeparator();
    jMenu1.add(jRadioButtonMenuItem5);
    jMenu1.add(jRadioButtonMenuItem6);
    jMenu2.add(jRadioButtonMenuItem3);
    jMenu2.add(jRadioButtonMenuItem4);
    jMenu3.add(jCheckBoxMenuItem2);
    jMenu3.add(jCheckBoxMenuItem1);


  }
  //File | Exit action performed
  public void jMenuFileExit_actionPerformed(ActionEvent e)
  {
    System.exit(0);
  }
  //Help | About action performed
  public void jMenuHelpAbout_actionPerformed(ActionEvent e)
  {
    GraphByHand_AboutBox dlg = new GraphByHand_AboutBox();
    Dimension dlgSize = dlg.getPreferredSize();
    Dimension frmSize = getSize();
    Point loc = getLocation();
    dlg.setLocation((frmSize.width - dlgSize.width) / 2 + loc.x, (frmSize.height - dlgSize.height) / 2 + loc.y);
    dlg.setModal(true);
    dlg.pack();
    dlg.show();
  }
  //Overridden so we can exit when window is closed
  protected void processWindowEvent(WindowEvent e)
  {

    if (e.getID() == WindowEvent.WINDOW_CLOSING)
    {
      jMenuFileExit_actionPerformed(null);
    }
  }

//del vertex
//add vertex-------------------------------------
  void jRadioButtonMenuItem1_actionPerformed(ActionEvent e)
  {
if(jRadioButtonMenuItem1.isSelected())
{

  PanelByHand.isVertex=true;
  PanelByHand.isEdge=false;
   PanelByHand.isChangedEdge=false;
    PanelByHand.isChangedVertex=false;
  jRadioButtonMenuItem2.setSelected(false);
  jRadioButtonMenuItem3.setSelected(false);
  jRadioButtonMenuItem4.setSelected(false);
}


  }
// add edge
  void jRadioButtonMenuItem2_actionPerformed(ActionEvent e)
  {
    if(jRadioButtonMenuItem2.isSelected())
   {

      PanelByHand.isEdge=true;
        PanelByHand.isVertex=false;
        PanelByHand.isChangedEdge=false;
    PanelByHand.isChangedVertex=false;
   jRadioButtonMenuItem1.setSelected(false);
   jRadioButtonMenuItem3.setSelected(false);
   jRadioButtonMenuItem4.setSelected(false);

     }

  }
//
  void jMenu1_actionPerformed(ActionEvent e) {

  }
//change the edge
  void jRadioButtonMenuItem4_actionPerformed(ActionEvent e) {
if(jRadioButtonMenuItem4.isSelected())
{

        PanelByHand.isEdge=false;
        PanelByHand.isVertex=false;
        PanelByHand.isChangedEdge=true;
        PanelByHand.isChangedVertex=false;
        jRadioButtonMenuItem1.setSelected(false);
        jRadioButtonMenuItem3.setSelected(false);
        jRadioButtonMenuItem2.setSelected(false);



}
  }

  void jRadioButtonMenuItem3_actionPerformed(ActionEvent e) {
    if(jRadioButtonMenuItem3.isSelected())
{
        PanelByHand.isEdge=false;
        PanelByHand.isVertex=false;
        PanelByHand.isChangedEdge=false;
        PanelByHand.isChangedVertex=true;
        jRadioButtonMenuItem1.setSelected(false);
        jRadioButtonMenuItem2.setSelected(false);
        jRadioButtonMenuItem4.setSelected(false);




}
  }


  void jRadioButtonMenuItem5_actionPerformed(ActionEvent e) {

    if(jRadioButtonMenuItem5.isSelected())
{
       PanelByHand.isDirect=true;
       PanelByHand.isUnDirect=false;
       jRadioButtonMenuItem6.setSelected(false);

}

  }

  void jRadioButtonMenuItem6_actionPerformed(ActionEvent e) {
    if(jRadioButtonMenuItem6.isSelected())
{
       PanelByHand.isUnDirect=true;
       PanelByHand.isDirect=false;
       jRadioButtonMenuItem5.setSelected(false);

}
  }
//  del vertex
  void jCheckBoxMenuItem2_actionPerformed(ActionEvent e) {

    if(jCheckBoxMenuItem2.isSelected())
{
    PanelByHand.isEdge=false;
    PanelByHand.isVertex=false;
    PanelByHand.isChangedEdge=false;
    PanelByHand.isChangedVertex=false;
    PanelByHand.isDelVertex=true;
    PanelByHand.isDelEdge=false;
    jRadioButtonMenuItem1.setSelected(false);
    jRadioButtonMenuItem2.setSelected(false);
    jRadioButtonMenuItem4.setSelected(false);
    jRadioButtonMenuItem3.setSelected(false);
    jCheckBoxMenuItem1.setSelected(false);
}


  }

  void jCheckBoxMenuItem1_actionPerformed(ActionEvent e) {

    if(jCheckBoxMenuItem1.isSelected())
{
    PanelByHand.isEdge=false;
    PanelByHand.isVertex=false;
    PanelByHand.isChangedEdge=false;
    PanelByHand.isChangedVertex=false;
    PanelByHand.isDelVertex=false;
    PanelByHand.isDelEdge=true;
    jRadioButtonMenuItem1.setSelected(false);
    jRadioButtonMenuItem2.setSelected(false);
    jRadioButtonMenuItem4.setSelected(false);
    jRadioButtonMenuItem3.setSelected(false);
    jCheckBoxMenuItem2.setSelected(false);
}




  }
// save all
  void jMenuItem1_actionPerformed(ActionEvent e) {

PanelByHand.isSave=true;
PanelByHand.saved();
myNew();
PanelByHand.isSave=false;
  }




/*
////////////////write
 try
    {
    tableDataSet1.getDataFile().save(tableDataSet1);
    BufferedWriter out = new BufferedWriter(new FileWriter(myFile2+".vertex"));
         out.write(jTextField1.getText());
         out.close();
     }
    catch(Exception ex){javax.swing.JOptionPane.showMessageDialog(null," Error int the file , can't save it  ");}
      }

/////////////////////read

if(myFile2.equals(""))
{}
else
{
  try {
    so="";
       BufferedReader in = new BufferedReader(new FileReader(myFile2+".vertex"));
       String str;
       while ((str = in.readLine()) != null) {
           so+=str;
       }
       in.close();
   } catch (IOException e) {
   }

*/
  File openFile;
 private static String ss;
  private JLabel jLabel3 = new JLabel();
public void myNew()
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
BufferedWriter out = new BufferedWriter(new FileWriter(ss+".vertex"));
       out.write(PanelByHand.myVertText);
       out.close();


 BufferedWriter out2 = new BufferedWriter(new FileWriter(ss));
       out2.write(PanelByHand.myEdgeText);
       out2.close();
       }
      catch (IOException ex) { ex.printStackTrace();  }
      // for dijkstra o ahmad
   // Head.setfilePath(ss);
   // for combo box
      int x22=0;

       for(;x22<PanelByHand.myVSave.size();x22++ )
        {
       jComboBox2.insertItemAt(PanelByHand.myVSave.get(x22),x22);
       jComboBox3.insertItemAt(PanelByHand.myVSave.get(x22),x22);
        }
        x22=0;

        jComboBox1.insertItemAt("Dijkstra",0);
        jComboBox1.insertItemAt("Prim",1);





}
}


////////////////////////

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

public static String filePath()
{
  return ss;
}

int comboSelect2=-1;
int comboSelect3=-1;
int comboSelect1=0;
  private JComboBox jComboBox4 = new JComboBox();
  private JComboBox jComboBox3 = new JComboBox();
  private JLabel jLabel4 = new JLabel();
  private JComboBox jComboBox2 = new JComboBox();

  private JButton jButton4 = new JButton();
  private JComboBox jComboBox1 = new JComboBox();

  void jComboBox2_itemStateChanged(ItemEvent e) {
comboSelect2=jComboBox2.getSelectedIndex();
  }

  void jComboBox3_itemStateChanged(ItemEvent e) {
comboSelect3=jComboBox3.getSelectedIndex();
  }

  //chooce th e algorithm
  void jComboBox1_itemStateChanged(ItemEvent e) {
comboSelect1=jComboBox1.getSelectedIndex();
  }

  void jButton4_actionPerformed(ActionEvent e) {
  if(jComboBox1.getSelectedIndex()==0){
    dk=new Dijkstra(ss,PanelByHand.myVSave.get(comboSelect2).toString());

   ArrayList LL=new ArrayList();
   for ( StringTokenizer stok = new StringTokenizer(dk.printL2(),"\n");  stok.hasMoreTokens() ; )
        LL.add(stok.nextToken());
jLabel4.setText(LL.get(comboSelect3).toString());
//run the algorithm at the graph
// for movement

ArrayList mov=new ArrayList();
 for ( StringTokenizer st = new StringTokenizer(dk.shortPath(),"\n");  st.hasMoreTokens() ; )
       mov.add(st.nextToken());
String[] sMov=new String[mov.size()];
for(int t=0;t<mov.size();t++)
    sMov[t]=mov.get(t).toString();
int ttx=-1;
/////ahmad ///////////
jComboBox4.removeAllItems();
for(int tt=0;tt<mov.size();tt++)
   if( sMov[tt].endsWith(PanelByHand.myVSave.get(comboSelect3).toString()))
   {
   ++ttx;
  jComboBox4.insertItemAt((mov.get(tt)),ttx);
   }

/////////////////////

   ///////////////////////

  }
  else if(jComboBox1.getSelectedIndex()==1)
      {

    dk2=new Prim(ss,PanelByHand.myVSave.get(comboSelect2).toString());

    ArrayList LL=new ArrayList();
    for ( StringTokenizer stok = new StringTokenizer(dk2.printL2(),"\n");  stok.hasMoreTokens() ; )
         LL.add(stok.nextToken());
 jLabel4.setText(LL.get(comboSelect3).toString());
//run the algorithm at the graph
// for movement

 ArrayList mov=new ArrayList();
  for ( StringTokenizer st = new StringTokenizer(dk2.shortPath(),"\n");  st.hasMoreTokens() ; )
        mov.add(st.nextToken());
 String[] sMov=new String[mov.size()];
 for(int t=0;t<mov.size();t++)
     sMov[t]=mov.get(t).toString();
 int ttx=-1;

 for(int tt=0;tt<mov.size();tt++)
    if( sMov[tt].endsWith(PanelByHand.myVSave.get(comboSelect3).toString()))
    {
    ++ttx;
   jComboBox4.insertItemAt((mov.get(tt)),ttx);
    }
/////////////////////

   ///////////////////////


  }


  }// movement o ahmad on nodes
  void jComboBox4_itemStateChanged(ItemEvent e) {
String move=(String)jComboBox4.getSelectedItem();
//JOptionPane.showMessageDialog(this,move);
ArrayList move1=new ArrayList();
for ( StringTokenizer stmove = new StringTokenizer(move);  stmove.hasMoreTokens() ; )
       move1.add(stmove.nextToken());
// find nodes
cutMove=new String[move1.size()];
for(int t=0;t<move1.size();t++)
   cutMove[t]=move1.get(t).toString();
 //find index of nodes
intCutMove=new int[PanelByHand.myVSave.size()];
indexMove= PanelByHand.myVSave ;
for(int t=0;t<move1.size();t++)
{
 intCutMove[t] =indexMove.indexOf(cutMove[t]);
// JOptionPane.showMessageDialog(this,"\n"+intCutMove[t]);
}

 PanelByHand.isMyCutMove=true;


  }
//implementation



}



class GraphByHand_jMenuItem1_actionAdapter implements java.awt.event.ActionListener {
  private GraphByHand adaptee;

  GraphByHand_jMenuItem1_actionAdapter(GraphByHand adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {

  }
}

class GraphByHand_jMenu1_actionAdapter implements java.awt.event.ActionListener {
  private GraphByHand adaptee;

  GraphByHand_jMenu1_actionAdapter(GraphByHand adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jMenu1_actionPerformed(e);
  }
}

class GraphByHand_jRadioButtonMenuItem4_actionAdapter implements java.awt.event.ActionListener {
  private GraphByHand adaptee;

  GraphByHand_jRadioButtonMenuItem4_actionAdapter(GraphByHand adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jRadioButtonMenuItem4_actionPerformed(e);
  }
}

class GraphByHand_jRadioButtonMenuItem3_actionAdapter implements java.awt.event.ActionListener {
  private GraphByHand adaptee;

  GraphByHand_jRadioButtonMenuItem3_actionAdapter(GraphByHand adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jRadioButtonMenuItem3_actionPerformed(e);
  }
}

class GraphByHand_jComboBox1_itemAdapter implements java.awt.event.ItemListener {
  private GraphByHand adaptee;

  GraphByHand_jComboBox1_itemAdapter(GraphByHand adaptee) {
    this.adaptee = adaptee;
  }
  public void itemStateChanged(ItemEvent e) {
    adaptee.jComboBox1_itemStateChanged(e);
  }
}