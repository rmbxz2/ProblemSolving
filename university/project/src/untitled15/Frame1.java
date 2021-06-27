package untitled15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import com.borland.dx.dataset.*;
import com.borland.dbswing.*;
import java.io.*;
import com.borland.jbcl.layout.*;
/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2000</p>
 * <p>Company: </p>
 * @author unascribed
 * @version 1.0
 */

public class Frame1 extends JInternalFrame
{ private static String myFile2="";
  private static String so="";
  private JPanel contentPane;
  private JMenuBar jMenuBar1 = new JMenuBar();
  private JMenu jMenuFile = new JMenu();
  private JMenu jMenuHelp = new JMenu();
  private JMenuItem jMenuHelpAbout = new JMenuItem();
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
  private JLabel jLabel1 = new JLabel();
  private Border border1;
  private TextDataFile textDataFile1 = new TextDataFile();
  private TableDataSet tableDataSet1 = new TableDataSet();
  private JdbNavToolBar jdbNavToolBar1 = new JdbNavToolBar();
  private JPanel jPanel2 = new JPanel();
  private TableScrollPane tableScrollPane1 = new TableScrollPane();
  private JdbTable jdbTable1 = new JdbTable();
  private JdbStatusLabel jdbStatusLabel1 = new JdbStatusLabel();
  private Border border2;
  private JTextField jTextField1 = new JTextField();
  private TitledBorder titledBorder1;
  private JMenuItem jMenuItem1 = new JMenuItem();
  private JMenuItem jMenuItem2 = new JMenuItem();
  private Column column3 = new Column();
  private Column column1 = new Column();
  private Column column2 = new Column();
  private JLabel jLabel2 = new JLabel();
  private XYLayout xYLayout1 = new XYLayout();
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel4 = new JLabel();
  private TitledBorder titledBorder2;

  //Construct the frame

public Frame1(){}
  public Frame1(String myFile)
  {
super.setTitle("Vertex and Edge  ");
super.setClosable(true);
super.setIconifiable(true);
   myFile2=myFile;
textDataFile1.setFileName(myFile);
textDataFile1.setLoadAsInserted(true);
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
    image1 = new ImageIcon(untitled15.Frame1.class.getResource("openFile.gif"));
    image2 = new ImageIcon(untitled15.Frame1.class.getResource("closeFile.gif"));
    image3 = new ImageIcon(untitled15.Frame1.class.getResource("help.gif"));
    //setIconImage(Toolkit.getDefaultToolkit().createImage(Frame1.class.getResource("[Your Icon]")));
    contentPane = (JPanel) this.getContentPane();
    border1 = BorderFactory.createMatteBorder(1,1,1,1,Color.red);
    border2 = new EtchedBorder(EtchedBorder.RAISED,Color.red,Color.green);
    titledBorder1 = new TitledBorder("");
    titledBorder2 = new TitledBorder("");
    contentPane.setLayout(borderLayout1);
    this.setSize(new Dimension(399, 316));
    this.setTitle("Frame Title");
    statusBar.setText(" ");
    jMenuFile.setBackground(new Color(209, 229, 255));
    jMenuFile.setText("File");
    jMenuHelp.setBackground(new Color(209, 229, 255));
    jMenuHelp.setText("Help");
    jMenuHelpAbout.setBackground(new Color(209, 229, 255));
    jMenuHelpAbout.setText("About");
    jMenuHelpAbout.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jMenuHelpAbout_actionPerformed(e);
      }
    });
    jButton1.setIcon(image1);
    jButton1.setBackground(SystemColor.info);
    jButton1.setToolTipText("Open File");
    jButton2.setIcon(image2);
    jButton2.setBackground(SystemColor.info);
    jButton2.setToolTipText("Close File");
    jButton3.setIcon(image3);
    jButton3.setBackground(SystemColor.info);
    jButton3.setToolTipText("Help");
    jLabel1.setFont(new java.awt.Font("Dialog", 0, 12));
    jLabel1.setBorder(border1);
    jLabel1.setIcon(new ImageIcon(Frame1.class.getResource("lolo.gif")));
    jLabel1.setText("   The Graph is ( "+ ((new File(myFile2)).getName())  +" )  ");
   // textDataFile1.setFileName("C:\\ax");

    tableScrollPane1.getViewport().setBackground(new Color(239, 241, 255));
    tableScrollPane1.setMaximumSize(new Dimension(3276, 32767));
    tableScrollPane1.setPreferredSize(new Dimension(300, 220));
    jdbStatusLabel1.setBackground(new Color(237, 241, 255));
    jdbStatusLabel1.setBorder(titledBorder1);
    jdbStatusLabel1.setText("jdbStatusLabel1");
    jdbStatusLabel1.setDataSet(tableDataSet1);
    jTextField1.setColumns(30);
    jPanel1.setBackground(new Color(238, 241, 255));
    jPanel1.setLayout(xYLayout1);
    contentPane.setBackground(new Color(239, 241, 255));
    jToolBar.setBackground(new Color(238, 241, 255));
    jToolBar.setBorder(BorderFactory.createEtchedBorder());
    jdbNavToolBar1.setBackground(new Color(237, 240, 255));
    jdbNavToolBar1.setForeground(Color.blue);
    jdbNavToolBar1.setBorder(BorderFactory.createEtchedBorder());
    jdbNavToolBar1.setDataSet(tableDataSet1);
    jPanel2.setBackground(new Color(239, 241, 255));
    jMenuBar1.setBackground(new Color(238, 240, 255));
    jMenuItem1.setText("Exit");
    jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
         jMenuItem1_actionPerformed(e);
      }
    });
    jMenuItem2.setText("Save");
    jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jMenuItem2_actionPerformed(e);
      }
    });
    column3.setAlignment(com.borland.dx.text.Alignment.CENTER | com.borland.dx.text.Alignment.MIDDLE);
    column3.setColumnName("edge");
    column3.setDataType(com.borland.dx.dataset.Variant.DOUBLE);
    column3.setPreferredOrdinal(2);
    column3.setRequired(true);
    column3.setServerColumnName("edge");
    column3.setSqlType(0);
    jdbTable1.setBorder(BorderFactory.createEtchedBorder());
    jdbTable1.setDataSet(tableDataSet1);
   // textDataFile1.setFileName("C:\\myNet\\ax");
    column1.setAlignment(com.borland.dx.text.Alignment.CENTER | com.borland.dx.text.Alignment.MIDDLE);
    column1.setColumnName("From");
    column1.setDataType(com.borland.dx.dataset.Variant.STRING);
    column1.setPreferredOrdinal(0);
    column1.setRequired(true);
    column1.setServerColumnName("From");
    column1.setSqlType(0);
    column2.setAlignment(com.borland.dx.text.Alignment.CENTER | com.borland.dx.text.Alignment.MIDDLE);
    column2.setColumnName("To");
    column2.setDataType(com.borland.dx.dataset.Variant.STRING);
    column2.setPreferredOrdinal(1);
    column2.setRequired(true);
    column2.setServerColumnName("To");
    column2.setSqlType(0);
//    textDataFile1.setFileName("C:\\myNet\\ax");
    tableDataSet1.setDataFile(textDataFile1);
    jLabel2.setToolTipText("");
    jLabel2.setText("Vertex =");
    jLabel3.setText("Edge =");
    jLabel4.setIcon(new ImageIcon(Frame1.class.getResource("text19.gif")));
    jToolBar.add(jButton1);
    jToolBar.add(jButton2);
    jToolBar.add(jButton3);
    jMenuFile.add(jMenuItem2);
    jMenuFile.add(jMenuItem1);
    jMenuHelp.add(jMenuHelpAbout);
    jMenuBar1.add(jMenuFile);
    jMenuBar1.add(jMenuHelp);
    this.setJMenuBar(jMenuBar1);
    tableDataSet1.setColumns(new Column[] {column1, column2, column3});
    contentPane.add(jToolBar, BorderLayout.NORTH);
    contentPane.add(statusBar, BorderLayout.WEST);
    contentPane.add(jPanel1, BorderLayout.CENTER);
    jPanel1.add(jLabel1,  new XYConstraints(124, 5, -1, -1));
    jPanel1.add(jdbNavToolBar1,  new XYConstraints(5, 87, -1, -1));
    jPanel1.add(tableScrollPane1,  new XYConstraints(43, 135, -1, -1));
    jPanel1.add(jLabel2,     new XYConstraints(0, 62, 50, -1));
    jPanel1.add(jTextField1,   new XYConstraints(50, 63, -1, -1));
    jPanel1.add(jLabel3,     new XYConstraints(1, 154, -1, 26));
    contentPane.add(jPanel2, BorderLayout.SOUTH);
    jPanel2.add(jLabel4, null);
    jPanel2.add(jdbStatusLabel1, null);
    tableScrollPane1.getViewport().add(jdbTable1, null);

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
    jTextField1.setText(so);
}



  }
  //File | Exit action performed
  public void jMenuFileExit_actionPerformed(ActionEvent e)
  {

    jMenuItem2_actionPerformed(e);
  }
  //Help | About action performed
  public void jMenuHelpAbout_actionPerformed(ActionEvent e)
  {
    Frame1_AboutBox dlg = new Frame1_AboutBox(null);
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
   // super.processWindowEvent(e);
    if (e.getID() == WindowEvent.WINDOW_CLOSING)
    {
      jMenuFileExit_actionPerformed(null);
    }
  }

  void jMenuItem2_actionPerformed(ActionEvent e) {
    try
    {
    tableDataSet1.getDataFile().save(tableDataSet1);
    BufferedWriter out = new BufferedWriter(new FileWriter(myFile2+".vertex"));
         out.write(jTextField1.getText());
         out.close();
     }
    catch(Exception ex){javax.swing.JOptionPane.showMessageDialog(null," Error int the file , can't save it  ");}
      }



  void jMenuItem1_actionPerformed(ActionEvent e) {
  this.dispose();
  }





//the end
}