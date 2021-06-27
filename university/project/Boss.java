import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Boss
 {


JButton jButton =new JButton("press me");

public Boss()
{



         jButton.setText("ok " +5);



  JInternalFrame jInternalFrame =new JInternalFrame("ahmad ali",true,true,true,true);
                 jInternalFrame.getContentPane().add((new JPanel()).add(new JButton("ahmad ali") ));
                 jInternalFrame.setSize(200,200);
                 jInternalFrame.setVisible(true);





 JDesktopPane jDesktopPane=new JDesktopPane();
              jDesktopPane.add(jInternalFrame);

JFrame jFrame =new JFrame("Hi" );
       jFrame.getContentPane().add(jDesktopPane);
       jFrame.setSize(300,200);
       jFrame.setVisible(true);




 }








  public static void main( String[] args)
    {
   new Hi();

   }


}
