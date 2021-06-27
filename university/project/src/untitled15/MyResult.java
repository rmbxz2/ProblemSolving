package untitled15;

import java.awt.*;
import javax.swing.*;
import com.borland.jbcl.layout.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.border.*;
public class MyResult extends JInternalFrame
{

  private String algorithms2="";
  private JPanel jPanel1 = new JPanel();
  private XYLayout xYLayout1 = new XYLayout();
  private JLabel jLabel1 = new JLabel();
  private JScrollPane jScrollPane1 = new JScrollPane();
  private JTextArea jTextArea1 = new JTextArea();
  private JButton jButton1 = new JButton();
  private JTextField jTextField1 = new JTextField();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel4 = new JLabel();
  private TitledBorder titledBorder1;

  public MyResult(String algorithms)

  {
   super.setTitle(algorithms);
   super.setClosable(true);
   super.setIconifiable(true);
   algorithms2=algorithms;
   if(Head.filePath().equals(""))
   { }
   else
   {
     jLabel4.setText(""+(new File(Head.filePath()).getName()));
      }

    try
    {
      jbInit();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
  private void jbInit() throws Exception
  {
    titledBorder1 = new TitledBorder("");
    jPanel1.setLayout(xYLayout1);
    jLabel1.setForeground(Color.black);
    jLabel1.setIcon(new ImageIcon(new java.net.URL("file:///D:/untitled15/classes/untitled15/a1.gif")));
    jPanel1.setBackground(new Color(238, 241, 255));
    jButton1.setBackground(new Color(255, 255, 182));
    jButton1.setText("Result");
    jButton1.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jButton1_actionPerformed(e);
      }
    });
    jTextField1.setToolTipText("");
    jLabel2.setText("Source");
    jLabel3.setForeground(Color.black);
    jLabel3.setText("The Graph is");
    jLabel4.setForeground(Color.red);
    this.getContentPane().add(jPanel1, BorderLayout.CENTER);
    jPanel1.add(jScrollPane1,            new XYConstraints(64, 109, 260, 155));
    jScrollPane1.getViewport().add(jTextArea1, null);
    jPanel1.add(jButton1, new XYConstraints(82, 281, 95, 30));
    jPanel1.add(jTextField1, new XYConstraints(212, 330, 61, 26));
    jPanel1.add(jLabel2, new XYConstraints(170, 333, 42, 23));
    jPanel1.add(jLabel3,     new XYConstraints(125, 91, 78, 19));
    jPanel1.add(jLabel4,    new XYConstraints(201, 92, 124, 18));
    jPanel1.add(jLabel1,      new XYConstraints(98, 6, -1, 76));
  }

  void jButton1_actionPerformed(ActionEvent e)
  {
    if((jTextField1.getText().equals("")) && (Head.filePath().equals("")))
    {
    JOptionPane.showMessageDialog(this,"please Select the Graph and Enter the source ");
    }
      else
      {
        if(algorithms2.equals("Dijkstra") )
        {
      Dijkstra dk=new Dijkstra(Head.filePath(),jTextField1.getText());
      jTextArea1.setText(" the implementation "+dk.T +"\n=======================\n All Vlaues\n"+dk.printL2() +" \n=======================\n All paths\n"+dk.shortPath());
        }
      else  if(algorithms2.equals("Prim") )
      {
      Prim dk2=new Prim(Head.filePath(),jTextField1.getText());
      jTextArea1.setText(" the implementation "+dk2.T +"\n=======================\n All Vlaues\n"+dk2.printL2() +" \n=======================\n All paths\n"+dk2.shortPath());
      }
      }



  }
//(new File(myFile2)).getName()
}