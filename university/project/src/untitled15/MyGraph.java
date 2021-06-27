package untitled15;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class MyGraph extends JInternalFrame
{
  private JScrollPane jScrollPane1 = new JScrollPane();
  private Panel1 jPanel1 ;
  private JPanel jPanel2 = new JPanel();
  private JLabel jLabel1 = new JLabel();
  private String ss3="";

  public MyGraph(String ss2) {
    super.setName(ss2);
    ss3=ss2;
    super.setClosable(true);
    super.setMaximizable(true);
    super.setIconifiable(true);
    super.setResizable(true);
   jPanel1 = new Panel1(ss2);
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  private void jbInit() throws Exception {
    this.getContentPane().add(jScrollPane1, BorderLayout.CENTER);
    this.getContentPane().add(jPanel2, BorderLayout.NORTH);
    jPanel2.add(jLabel1, null);
    jScrollPane1.getViewport().add(jPanel1, null);
    jLabel1.setText(ss3);
  }

}