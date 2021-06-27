package untitled15;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyLabelVertex extends JLabel
{


  public MyLabelVertex(String s)
  {
    super(s);
    try
    {
      jbInit();
    }
    catch(Exception ex)
    {
      ex.printStackTrace();
    }
  }
  void jbInit() throws Exception
  {
    this.addMouseListener(new MyLabelVertex_this_mouseAdapter(this));

  }

  void this_mouseClicked(MouseEvent e)
  {

  }

}

class MyLabelVertex_this_mouseAdapter extends java.awt.event.MouseAdapter
{
  private MyLabelVertex adaptee;

  MyLabelVertex_this_mouseAdapter(MyLabelVertex adaptee)
  {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e)
  {
    adaptee.this_mouseClicked(e);
  }
}