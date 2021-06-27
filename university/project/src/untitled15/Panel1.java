package untitled15;

import java.awt.*;
import com.borland.jbcl.layout.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Stroke;
import java.util.*;

public class Panel1 extends JPanel {
  private JLabel[] jLabel ;
  private  int  jjj=1;
  private   int  iii=0;
  private  int   first=1;
  private     String ss3="";
  private      Analysis analysis;
  private       double[][] madj;
  private   int[][] myLocation;
        //  String[][]  m2d;
     private      ArrayList myV;



public Panel1(String dd) {
  ss3=dd;
  try {
    if(!(dd.equals("")))
      jbInit();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
  }
  void jbInit() throws Exception {

    this.setBackground(new Color(212, 208, 255));

    this.setLayout(null);
    analysis = new Analysis(ss3);
    madj= analysis.getMAdj();
    //m2d= analysis.getMy2d();
    myV=analysis.getV();
    first=(int)((myV.size())/5)*200;
   this.setPreferredSize(new Dimension(first*2, first*2 ));
    myLocation=new int[myV.size()][2];

    jLabel = new JLabel[myV.size()];

    for(int i=0;i<myLocation.length;i++)
      for(int j=0;j<myLocation[0].length; j++ )
    {
      myLocation[i][j]=0;

    }

    for(int i=0;i<jLabel.length;i++)
    {
    jLabel[i]=new JLabel((myV.get(i)).toString() );
    jLabel[i].setToolTipText((myV.get(i)).toString());
    jLabel[i].setForeground(Color.black);

    }


  jLabel[0].addMouseMotionListener(
  new MouseMotionAdapter()
  {
    public void mouseMoved(MouseEvent e)
    {

   // jLabel[0].setLocation(e.getX(),e.getY());
    } // end

    public void mouseDragged(MouseEvent e)
    {
  //      jLabel[0].setLocation(e.getX(),e.getY());
     //  repaint();
    }
  }

       );





    jLabel[0].setText((myV.get(0)).toString() );
    jLabel[0].setBounds(first,first,50,50);
    myLocation[0][0]=first;
    myLocation[0][1]=first;

try
{

while(iii<myLocation.length)
{
//1
if(iii<myLocation.length)
   {++iii;
    myLocation[iii][0]=first+(100*jjj);
    myLocation[iii][1]=first-(100*jjj);
   }
//2
if(iii<myLocation.length)
 {++iii;
  myLocation[iii][0]=first+(100*jjj);
  myLocation[iii][1]=first+(100*jjj);
 }
//3
if(iii<myLocation.length)
  { ++iii;
   myLocation[iii][0]=first-(100*jjj);
   myLocation[iii][1]=first+(100*jjj);
  }
//4
if(iii<myLocation.length)
   { ++iii;
    myLocation[iii][0]=first-(100*jjj);
    myLocation[iii][1]=first-(100*jjj);
   }
//5
 if(iii<myLocation.length)
  { ++iii;++jjj;
   myLocation[iii][0]=first+(5*jjj);;
   myLocation[iii][1]=first-(100*jjj);;
    }
//6
  if(iii<myLocation.length)
    { ++iii;
     myLocation[iii][0]=first+(100*jjj);
     myLocation[iii][1]=first-(1*jjj);
    }
//7
if(iii<myLocation.length)
 { ++iii;
  myLocation[iii][0]=first-(5*jjj);;
  myLocation[iii][1]=first+(100*jjj);;
 }
//8
 if(iii<myLocation.length)
  { ++iii;
   myLocation[iii][0]=first-(100*jjj);
   myLocation[iii][1]=first+(5*jjj);;
   ++jjj;
  }
}





}catch(Exception e){ }


for(int i=0;i<myV.size();i++)
{
jLabel[i].setBounds( myLocation[i][0],myLocation[i][1],50,50);
 }



   for(int i=0;i<jLabel.length;i++)
        this.add(jLabel[i], null);


  }




 public void paintComponent(Graphics g)
 {
   if(!(ss3.equals(""))){
     super.paintComponent(g);
   Graphics2D g2 = (Graphics2D)g;
              g2.setStroke(new BasicStroke(2.0f));
              g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);




 for(int i=0;i<jLabel.length ;i++)
 {  g2.setColor(Color.red);
   g2.drawOval (jLabel[i].getLocation().x-5, jLabel[i].getLocation().y,jLabel[i].getSize().width,jLabel[i].getSize().height);
    g2.setColor(Color.yellow);
   g2.fillOval (jLabel[i].getLocation().x-4, jLabel[i].getLocation().y+1,jLabel[i].getSize().width-1,jLabel[i].getSize().height-1);
}

int xp=0,yp=0,xx,yy,sx,sy,ex,ey,cx,cy;
 int ArrowSize = 20;
 int size=40;
for(int i=0;i< madj.length;i++ )
  for(int j=0;j< madj[0].length;j++ )
  { //g2.setColor(new Color(255, 132, 181) );
  if(madj[i][j]!= Double.MAX_VALUE)
  {
     if(jLabel[i].getLocation().y < jLabel[j].getLocation().y)
     {
    xx=jLabel[i].getLocation().x + xp;
    yy=jLabel[i].getLocation().y + yp;
    ex=jLabel[j].getLocation().x + xp;
    ey=jLabel[j].getLocation().y;
    cx=(((jLabel[i].getLocation().x + xp)+(jLabel[j].getLocation().x + xp))/2);
    cy=(((jLabel[i].getLocation().y+ yp)+(jLabel[j].getLocation().y))/2);
      double angle = 120*Math.PI/180 + Math.atan2(yy-ey,xx-ex);
    sx=xx+(int)(size*Math.cos(angle));
    sy= yy+(int)(size*Math.sin(angle));


     xp=25; yp=50;
  g.setColor(Color.red);
   g.drawLine( xx,yy ,ex ,ey );
            g.setColor(Color.red);

        angle = angle+270*Math.PI/180;
        g.drawLine(cx,cy,
          cx+(int)(Math.cos(angle)*ArrowSize),
          cy+(int)(Math.sin(angle)*ArrowSize));

        angle = angle-60*Math.PI/180;

        g.drawLine(cx,cy,
          cx+(int)(Math.cos(angle)*ArrowSize),
          cy+(int)(Math.sin(angle)*ArrowSize));





       g2.setColor(Color.blue);
     g2.drawString(""+madj[i][j] ,(((jLabel[i].getLocation().x + xp)+(jLabel[j].getLocation().x + xp))/2)-10,(((jLabel[i].getLocation().y+ yp)+(jLabel[j].getLocation().y))/2)+10);
     //

     //
     g2.setColor(Color.red);

      }
else if(jLabel[i].getLocation().y >= jLabel[j].getLocation().y)
{ xp=25; yp=50;
xx=jLabel[i].getLocation().x + xp;
//there
yy=jLabel[i].getLocation().y ;
ex=jLabel[j].getLocation().x +xp;
ey=jLabel[j].getLocation().y+yp;
cx=(((jLabel[i].getLocation().x + xp)+(jLabel[j].getLocation().x + xp))/2);
cy=(((jLabel[i].getLocation().y)+(jLabel[j].getLocation().y+yp))/2);
  double angle = 120*Math.PI/180 + Math.atan2(yy-ey,xx-ex);
sx=xx+(int)(size*Math.cos(angle));
sy= yy+(int)(size*Math.sin(angle));




g.drawLine( xx,yy ,ex ,ey );
        g.setColor(Color.red);

    angle = angle+270*Math.PI/180;
    g.drawLine(cx,cy,
      cx+(int)(Math.cos(angle)*ArrowSize),
      cy+(int)(Math.sin(angle)*ArrowSize));

    angle = angle-60*Math.PI/180;

    g.drawLine(cx,cy,
      cx+(int)(Math.cos(angle)*ArrowSize),
      cy+(int)(Math.sin(angle)*ArrowSize));








      g.drawLine( xx,yy ,ex ,ey );
             g2.setColor(Color.blue);
       g2.drawString(""+madj[i][j] ,(((jLabel[i].getLocation().x + xp)+(jLabel[j].getLocation().x + xp))/2)-10,(((jLabel[i].getLocation().y)+(jLabel[j].getLocation().y+yp))/2)+10);
             g2.setColor(Color.red);

this.repaint();
}

    }
  }




   }



}
}