package scjp2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Describe class EmployeeFrame here.
 *
 *
 * Created: Thu Mar 28 09:26:44 2019
 *
 * @author <a href="mailto:root@localhost.localdomain">root</a>
 * @version 1.0
 */
public class EmployeeFrame extends JFrame {
    /**
     * Creates a new <code>EmployeeFrame</code> instance.
     *
     */

    EmployeeFrame() {
        this.setLayout(new FlowLayout());
        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            public final void actionPerformed(final ActionEvent actionEvent) {
                String label = button.getLabel();
                if (label.equals("Click here!"))
                    button.setLabel("Try again");
                else
                    button.setLabel("Click here!");
            }
        });
        add(button);
        this.addWindowListener(new WindowAdapter() {
            // Implementation of java.awt.event.WindowListener
            public final void windowClosing(final WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        this.pack();
        this.setSize(200, 200);
        this.setVisible(true);
        //  Causes the <code>Popup</code> to be sized to fit the preferred size
        //  of the <code>Component</code> it contains.
        // java.util.Collection
        // java.util.Set ;
    }

    /**
     * Describe <code>main</code> method here.
     *
     * @param args a <code>String</code> value
     */
    public static void main(String[] args) {
        // MyInterface myClass = new MySubclass();
        //      new EmployeeFrame();
        //      JFrame hi = new JFrame();
        //      hi.pack();

        Map map = new TreeMap();
        // map.put("key3", "value3");
        // map.put("key11", "value1");
        // map.put("key12", "value1");
        // map.put("key13", "value1");
        // map.put("key2", "value2");
        // SortedMap sortedMap = (SortedMap) map;
        // System.out.println(sortedMap);

        // MyInterface myClass1 = new MyClass();
        // MyInterface myClass2 = new MySubclass();
        // if (myClass1 instanceof MyInterface ) {
        // 	  System.out.println("myClass1 instanceof MyInterface");
        // }

        // if (myClass2 instanceof MyInterface ) {
        // 	  System.out.println("myClass2 instanceof MyInterface");
        // }
    }
} // end of class scjp2.EmployeeFrame

// interface MyInterface { }
// class MyClass implements MyInterface{  }
// class MySubclass extends MyClass implements MyInterface{     }
