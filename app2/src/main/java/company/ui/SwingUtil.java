package company.ui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingUtil {
	
	/**
	 * 
	 * @param label
	 * @param txt
	 * @return
	 */
/*
	public static JPanel buildLabledTextPanel(String label,JTextField txt){
		JPanel pnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel lbl = new JLabel(label);
		lbl.setPreferredSize(new Dimension(50,15));
    	pnl.add(lbl);
		pnl.add(txt);
		return pnl;
	}
*/	
	/**
	 * @param pnl
	 * @param title
	 * @return
	 *//*
	public static JDialog showPanelInDialog(JPanel pnl,String title,FrmMain frmMain) {
		JDialog dlg = new JDialog(frmMain);  
		dlg.add(pnl);
		dlg.pack();
		dlg.setLocationRelativeTo(null);
		dlg.setModal(true);
		dlg.setTitle(title);
		dlg.setResizable(false);
		return dlg;
	}*/

	public static JPanel buildLableTextPanel(String label, JTextField txt) {
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel(label);
		//pnl.setPreferredSize(new Dimension(50,15));
		pnl.add(lbl);
		pnl.add(txt);

		return pnl;
	}
}
