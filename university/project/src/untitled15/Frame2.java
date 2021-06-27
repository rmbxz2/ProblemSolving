package untitled15;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.borland.jbcl.layout.*;
import java.awt.event.*;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2000</p>
 * <p>Company: </p>
 * @author unascribed
 * @version 1.0
 */

public class Frame2 extends JFrame
{
  private JPanel jPanel1 = new JPanel();
  private JLabel jLabel1 = new JLabel();
  private Border border1;
  private Border border2;
  private JButton jButton1 = new JButton();
  private XYLayout xYLayout1 = new XYLayout();
  private JButton jButton2 = new JButton();

  public Frame2()
  {
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
    border1 = BorderFactory.createMatteBorder(6,6,6,6,Color.red);
    border2 = BorderFactory.createCompoundBorder(new EtchedBorder(EtchedBorder.RAISED,Color.red,Color.blue),BorderFactory.createEmptyBorder(2,2,2,2));
    jLabel1.setBackground(new Color(255, 255, 184));
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 19));
    jLabel1.setForeground(SystemColor.activeCaption);
    jLabel1.setBorder(border2);
    jLabel1.setText("   Net Algorithm   ");
    jPanel1.setBackground(new Color(255, 238, 203));
    jPanel1.setBorder(border1);
    jPanel1.setLayout(xYLayout1);
    jButton1.setText("Static Net");
    jButton1.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jButton1_actionPerformed(e);
      }
    });
    jButton2.setText("Dynamic Net");
    this.getContentPane().add(jPanel1, BorderLayout.CENTER);
    jPanel1.add(jLabel1, new XYConstraints(33, 9, -1, -1));
    jPanel1.add(jButton1, new XYConstraints(62, 93, 102, -1));
    jPanel1.add(jButton2, new XYConstraints(62, 144, -1, -1));
  }

  void jButton1_actionPerformed(ActionEvent e)
  {
    int trys=1;
String abc =javax.swing.JOptionPane.showInputDialog("please, Enter the password ");
  if(abc.equals("af"))  {

  Frame1 frame1 = new Frame1();
        frame1.setSize(400,500);
        {
            Frame2 frame2 = new Frame2();
                   frame2.setSize(250,100);    //Validate frames that have preset sizes
                      //Center the window
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            Dimension frameSize = frame1.getSize();
            if (frameSize.height > screenSize.height)
            {
              frameSize.height = screenSize.height;
            }
            if (frameSize.width > screenSize.width)
            {
              frameSize.width = screenSize.width;
            }
            frame1.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
            frame1.setVisible(true);
            frame2.setVisible(false);
  }

}
else if(trys==3)
{
    javax.swing.JOptionPane.showMessageDialog(this,"Finished");
    System.exit(0);

}
else {
    javax.swing.JOptionPane.showMessageDialog(this,"Access Denied");
    trys++;
  }

  }
}