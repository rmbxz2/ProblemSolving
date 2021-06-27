package untitled15;

import java.awt.*;
import com.borland.jbcl.layout.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Stroke;
import java.util.*;
/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2000</p>
 * <p>Company: </p>
 * @author unascribed
 * @version 1.0
 */

public class PanelByHand extends JPanel {





static boolean isVertex=false;
static boolean isEdge=false;
static boolean isMyCutMove=false;
static boolean isChangedVertex=false;
static boolean isChangedEdge=false;
static boolean isDelVertex=false;
static boolean isDelEdge=false;
static boolean isDirect=true;
static boolean isUnDirect=false;
static boolean isSave=false;

static JLabel[] jLabelVertex = new JLabel[25];
private static int[][] mm=new int[25][25];
private JLabel[][] mmEdge=new JLabel[25][25];

private static int  noClick=0;
private   String ss3="";
//private   Analysis analysis;
//private   double[][] madj;
public static String myVertText=new String();
public static String myEdgeText=new String();

private   ArrayList myV;
public  static ArrayList myVSave=new ArrayList();

  public PanelByHand(String dd) {
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



    for( int ji=0;ji<jLabelVertex.length;ji++)
    {
       jLabelVertex[ji]=new JLabel();
       jLabelVertex[ji].setText("Vert"+ji);
       jLabelVertex[ji].setBounds(new Rectangle(0, 0, 50, 50));
       jLabelVertex[ji].setVisible(false);
       jLabelVertex[ji].addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        jLabelEVENT(e);

       }});

  }



    for( int jix=0;jix<mmEdge.length;jix++)
      for(int jiy=0;jiy<mmEdge[0].length;jiy++)
    {
       mmEdge[jix][jiy]=new JLabel();
       mmEdge[jix][jiy].setText("");
       mmEdge[jix][jiy].setBounds(new Rectangle(0, 0, 30, 30));
       mmEdge[jix][jiy].addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        mmEdgeEVENT(e);

       }});

  }

    this.setLayout(null);
    this.setBackground(UIManager.getColor("textHighlight"));
    this.setPreferredSize(new Dimension(1000,1000));


    this.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        if(isVertex){
        this_mouseClicked(e);
         noClick++;
        }
        if(isDelVertex){


        }
      }
    });





    for(int ji=0;ji<25;ji++)
    this.add(jLabelVertex[ji], null);

    for(int jix=0;jix<25;jix++)
      for(int jiy=0;jiy<25;jiy++)
    this.add(mmEdge[jix][jiy], null);

    //moheeeeeeeeeeeeeeeeemmmmmmmmmmmmmm






   myV=new ArrayList();
   for(int mk=0;mk<25;mk++)
     myV.add("Vert"+mk);




 for(int x=0;x<mm.length;x++)
   for(int y=0;y<mm[0].length;y++)
       mm[x][y]=0;



  }





  void this_mouseClicked(MouseEvent e) {
   jLabelVertex[noClick].setVisible(true);
   myVSave.add(noClick,jLabelVertex[noClick].getText());
  // GraphByHand.jComboBox2.ininsertItemAt(jLabelVertex[noClick].getText(),noClick);
  // GraphByHand.jComboBox3.insertItemAt(jLabelVertex[noClick].getText(),noClick);
   jLabelVertex[noClick].setLocation(e.getX(),e.getY());
   repaint();
 // System.out.print(""+(myVSave.get(noClick)).toString() );

  }

//del vertex
  void this_mouseClicked2(MouseEvent e) {
    String deletedV=((((JLabel)e.getComponent()).getText()) );
             ((JLabel)(e.getComponent())).remove(e.getComponent());

  }




    int a1,a2;
 boolean in1=true;
 boolean in2=false;
 boolean in3=false;
////////////////////////
  void jLabelEVENT(MouseEvent e)
 {

    if(isChangedVertex)
    {
      int xyz= myVSave.indexOf( (((JLabel)e.getComponent()).getText()));
      myVSave.remove(xyz);
      String gg=JOptionPane.showInputDialog("rename the Vertex");
       ((JLabel)e.getComponent()).setText( gg );
       myVSave.add(xyz,gg);
    }


  //////////////////////////
  if(isEdge)
    {
      if(in1)
      {
       a1= myV.indexOf( (((JLabel)e.getComponent()).getText()));
       in1=false;
      in2=true;

      }

 else if(in2)
      {
      a2= myV.indexOf( (((JLabel)e.getComponent()).getText()) );
      in1=true;
      in2=false;
    mm[a1][a2]=1 ;
    mmEdge[a1][a2].setText("1");

   if(isUnDirect)
   {
    mm[a2][a1]=1 ;
    mmEdge[a2][a1].setText("1");
   }

 }
    repaint();

}
 }

 ////////////////////////////
 void mmEdgeEVENT(MouseEvent e)
 {
if(isChangedEdge)
{
  for(int i=0;i<myVSave.size();i++ )
    for(int j=0;j<myVSave.size();j++ )
      if(mmEdge[i][j].equals((((JLabel)e.getComponent()))) )
      {
      String gg=JOptionPane.showInputDialog("rename the Edge");
      mmEdge[i][j].setText(gg);
      mm[i][j]=Integer.parseInt(gg);
      if(isUnDirect)
      {
        mmEdge[j][i].setText(gg);
      mm[j][i]=Integer.parseInt(gg);
      }
   }
}

 }



  public void paintComponent(Graphics g)
  {

      super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
               g2.setStroke(new BasicStroke(2.0f));
               g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);




  for(int kk=0;kk<noClick;kk++)
   {

   g2.setColor(Color.red);
   g2.drawOval(jLabelVertex[kk].getX(),jLabelVertex[kk].getY(),jLabelVertex[kk].getWidth(),jLabelVertex[kk].getHeight());
   g2.setColor(Color.yellow);
   g2.fillOval(jLabelVertex[kk].getX()+2,jLabelVertex[kk].getY()+2,47,47);
  }

  int xp=0,yp=0,xx,yy,sx,sy,ex,ey,cx,cy;
  int ArrowSize = 20;
 int size=40;
 {
   for(int x=0;x<mm.length;x++)
     for(int y=0;y<mm[0].length;y++)
       if(mm[x][y]!=0)
       {
         if(jLabelVertex[x].getLocation().y < jLabelVertex[y].getLocation().y)
         {
 xp=25; yp=50;
        xx=jLabelVertex[x].getLocation().x + xp;
        yy=jLabelVertex[x].getLocation().y + yp;
        ex=jLabelVertex[y].getLocation().x + xp;
        ey=jLabelVertex[y].getLocation().y;
        cx=(((jLabelVertex[x].getLocation().x + xp)+(jLabelVertex[y].getLocation().x + xp))/2);
        cy=(((jLabelVertex[x].getLocation().y+ yp)+(jLabelVertex[y].getLocation().y))/2);

        double angle = 120*Math.PI/180 + Math.atan2(yy-ey,xx-ex);
        sx=xx+(int)(size*Math.cos(angle));
        sy= yy+(int)(size*Math.sin(angle));

        g.setColor(Color.red);
        g.drawLine( xx,yy ,ex ,ey );

        g.setColor(Color.red);

//////////////////////////  Direction ///////////////
 if(isDirect)
 {
      angle = angle+270*Math.PI/180;
      g.drawLine(cx,cy,
        cx+(int)(Math.cos(angle)*ArrowSize),
        cy+(int)(Math.sin(angle)*ArrowSize));

      angle = angle-60*Math.PI/180;

      g.drawLine(cx,cy,
        cx+(int)(Math.cos(angle)*ArrowSize),
        cy+(int)(Math.sin(angle)*ArrowSize));
 }
  g2.setColor(Color.blue);


  //         g2.setColor(Color.red);
  //         g2.drawLine( jLabelVertex[x].getX(), jLabelVertex[x].getY(),jLabelVertex[y].getX(),jLabelVertex[y].getY()      );
////draw Edge

  mmEdge[x][y].setLocation (((jLabelVertex[x].getX()+xp+jLabelVertex[y].getX()+xp)/2)-10,((jLabelVertex[x].getY()+yp+jLabelVertex[y].getY())/2)+10);

/////////////////////////////////////////////////



         }

         else if(jLabelVertex[x].getLocation().y >= jLabelVertex[y].getLocation().y)
{ xp=25; yp=50;
xx=jLabelVertex[x].getLocation().x + xp;
//there
yy=jLabelVertex[x].getLocation().y ;
ex=jLabelVertex[y].getLocation().x +xp;
ey=jLabelVertex[y].getLocation().y+yp;
cx=(((jLabelVertex[x].getLocation().x + xp)+(jLabelVertex[y].getLocation().x + xp))/2);
cy=(((jLabelVertex[x].getLocation().y)+(jLabelVertex[y].getLocation().y+yp))/2);
  double angle = 120*Math.PI/180 + Math.atan2(yy-ey,xx-ex);
sx=xx+(int)(size*Math.cos(angle));
sy= yy+(int)(size*Math.sin(angle));




g.drawLine( xx,yy ,ex ,ey );
        g.setColor(Color.red);
if(isDirect)
{
    angle = angle+270*Math.PI/180;
    g.drawLine(cx,cy,
      cx+(int)(Math.cos(angle)*ArrowSize),
      cy+(int)(Math.sin(angle)*ArrowSize));

    angle = angle-60*Math.PI/180;

    g.drawLine(cx,cy,
      cx+(int)(Math.cos(angle)*ArrowSize),
      cy+(int)(Math.sin(angle)*ArrowSize));
}







      g.drawLine( xx,yy ,ex ,ey );
             g2.setColor(Color.blue);
      mmEdge[x][y].setLocation (((jLabelVertex[x].getX()+xp+jLabelVertex[y].getX()+xp)/2)-10,((jLabelVertex[x].getY()+jLabelVertex[y].getY()+yp)/2)+10);
        //     g2.drawString(""+madj[i][j] ,(((jLabel[i].getLocation().x + xp)+(jLabel[j].getLocation().x + xp))/2)-10,(((jLabel[i].getLocation().y)+(jLabel[j].getLocation().y+yp))/2)+10);
             g2.setColor(Color.red);

this.repaint();
}





       }
   }

   try {

   if(isMyCutMove)
   {
      /////////////////////////
       String[] sCutMove= GraphByHand.cutMove;
       int[]   intCutMove= GraphByHand.intCutMove;

     ////////////////////////
     {
     g2.setColor(Color.white);
     for(int mx=0;mx<GraphByHand.intCutMove.length ;mx++)
     g2.fillOval(jLabelVertex[GraphByHand.intCutMove[mx]].getX()+2,jLabelVertex[GraphByHand.intCutMove[mx]].getY()+2,47,47);
     g2.setColor(Color.yellow);
      }
   repaint();
   }



   }
   catch(Exception exx){JOptionPane.showMessageDialog(this,"Error ahmad hhhhha"); }






  }
  ////////////////////////////////////////////////








 /////////////////////////////////////////////////////

public static void saved()
{
  if(isSave)
  {
    myVertText="";
    myEdgeText="";
    for(int i=0;i<myVSave.size();i++)
    myVertText+=myVSave.get(i)+" ";

     for(int x=0;x<myVSave.size();x++)
        for(int y=0;y<myVSave.size();y++)
          {
           if(mm[x][y]!=0)
           {
myEdgeText+="\""+(myVSave.get(x)).toString()+"\""+""+"\t"
           +"\""+(myVSave.get(y)).toString()+"\""+""+"\t"
          + Double.parseDouble(""+mm[x][y])+"\n";

             }
           }
     //      JOptionPane.showMessageDialog(null,myVertText+"\n"+myEdgeText);

  }

}


}







