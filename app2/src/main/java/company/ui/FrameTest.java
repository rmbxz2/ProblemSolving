package company.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.jws.Oneway;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;

/**
 * @author root
 *
 */
public class FrameTest extends JFrame {

    // macro with template  ok 
    // mc    with template  not ok 



        public JButton btnPagestart = new JButton("pagestart");
	public JButton btnPageend = new JButton("pageend");
	public JButton btnLinestart = new JButton("linestart");
	public JButton btnLineend = new JButton("lineend");

	public JButton btnEast = new JButton("east");
	public JButton btnWest = new JButton("west");
	public JButton btnNorth = new JButton("north");
	public JButton btnSouth = new JButton("south");
	public JButton btnCenter = new JButton("center");

	public FrameTest() {

		// add(borderLayoutPanel());
		// Font font = new Font("serif",Font.BOLD+Font.ITALIC,28);
		// btnEast.setFont(font);
		// getContentPane().add(BorderLayout.EAST, pnlTest());
		// getContentPane().add(BorderLayout.SOUTH, BoxLayoutPanel());
		// getContentPane().add(BorderLayout.NORTH, btnNorth);
		// getContentPane().add(BorderLayout.EAST, btnWest);
		// getContentPane().add(BorderLayout.NORTH, pnlFields());
		getContentPane().add(BorderLayout.CENTER, this.btnWest);
		getContentPane().add(BorderLayout.EAST, pnl0());

		pack();
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * @return
	 */
    public JPanel borderLayoutPanel() {
	JPanel pnl = new JPanel();
	pnl.setLayout(new BorderLayout());
	pnl.add(this.btnEast, BorderLayout.EAST);
	pnl.add(this.btnLineend, BorderLayout.LINE_END);
	pnl.add(this.btnWest, BorderLayout.WEST);
	pnl.add(this.btnLinestart, BorderLayout.LINE_START);
	pnl.add(this.btnNorth, BorderLayout.NORTH);
	pnl.add(this.btnPagestart, BorderLayout.PAGE_START);
	pnl.add(this.btnSouth, BorderLayout.SOUTH);
	pnl.add(this.btnPageend, BorderLayout.PAGE_END);
	pnl.add(this.btnCenter, BorderLayout.CENTER);

	return pnl;
    }

	/**
	 * @return
	 */
    public JPanel BoxLayoutPanel() {
	JPanel pnl = new JPanel();
	pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
	pnl.add(this.btnEast);
	pnl.add(this.btnWest);
	pnl.add(this.btnNorth);
	pnl.add(this.btnSouth);
	pnl.add(this.btnCenter);
	return pnl;
    }

	/**
	 * @return
	 */
	public JPanel pnlTest() {
		JPanel pnl = new JPanel();
		pnl.setBackground(Color.gray);
		pnl.add(this.btnEast);
		pnl.add(this.btnWest);
		pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
		pnl.add(this.btnEast);
		pnl.add(this.btnWest);

		return pnl;
	}

    public JPanel pnlFields() {
	JPanel pnl = new JPanel();

	JTextField txtID = new JTextField(20);
	JLabel lblID = new JLabel("ID");

	JTextField txtName = new JTextField(20);
	JLabel lblName = new JLabel("name");

	txtName.requestFocus();
	JTextArea txtNote = new JTextArea(20, 10);
	txtNote.setLineWrap(true);

	JScrollPane scrollPane = new JScrollPane(txtNote);
	scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	// to start typing
	txtNote.requestFocus();

	final JCheckBox box1 = new JCheckBox("first check box");
	box1.setSelected(true);
	box1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		    if (box1.isSelected()) {
			box1.setText("selected");
		    } else {
			box1.setText("not selected");
		    }
		}
	    });

	String[] friends = { "ahmad", "ali", "omar", "roro", "asma" };
	JList list = new JList(friends);

	JScrollPane scrollList = new JScrollPane(list);
	scrollList.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	scrollList.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

	// so show only 4 element then scroll to see the others
	list.setVisibleRowCount(4);

	// select one at the time
	list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

	pnl.add(box1);
	pnl.add(scrollPane);
	pnl.add(lblName);
	pnl.add(txtName);
	pnl.add(lblID);
	pnl.add(txtID);
	return pnl;
    }

	public JPanel pnl0() {
		JPanel pnl = new JPanel();
		pnl.add(this.btnEast);
		return pnl;
	}

	/**
	 * @return
	 */
	public JPanel pnl1() {
		JPanel pnl = new JPanel();
		return pnl;
		
	}

	/**
	 * @return
	 */
	public JPanel pnl2() {
		JPanel pnl = new JPanel();
		return pnl;
	}

	/**
	 * @return
	 */
	public JPanel pnl3 (  ) {
		JPanel pnl = new JPanel();
		pnl.setLayout(new BorderLayout());
		pnl.add(this.btnCenter, BorderLayout.WEST);
		return pnl;
	}

    	/**
	 * @return
	 */
	public JPanel pnl4() {
		JPanel pnl = new JPanel();
		return pnl;
				
	}

	/**
	 * @return
	 */
    public JPanel pnl5() {
	JPanel  pnl = new JPanel();
	return   pnl;
    }



    public static void main(String[] args) {
	FrameTest frameTest = new FrameTest();
	int x =5;
	int y =10;
		    
    }
}
