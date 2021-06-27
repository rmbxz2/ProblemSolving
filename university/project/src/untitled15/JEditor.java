package untitled15;
/*
@author Badr Almodara. bmbsa@hotmail.com
@version 1.5
*/

// import statements
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.text.*;
/**
   A class for creating a stack with Object items. it's used for undo/redo operations
*/
class StackArray{
        Object[] items;
        private int maxSize;
        private int stackTop;

        public StackArray(int s) {
                maxSize = s;
                items = new Object[maxSize];
                stackTop = -1;
        }
        public boolean isEmpty() {
                return (stackTop == -1);
        }
        public boolean isFull() {
                return (stackTop == maxSize - 1);
        }
        public void push(Object d) throws StackOutOfBoundsException{
                if(isFull()){
                        for(int i=0;i<stackTop;i++)
                                items[i]=items[i+1];
                        items[stackTop]=d;
                }
                else
                items[++stackTop] = d;
        }
        public void pop() throws StackOutOfBoundsException{
                if(isEmpty())
                        throw new StackOutOfBoundsException("Stack Empty");
                else
                stackTop--;
        }
        public Object peek() throws StackOutOfBoundsException{
                if(isEmpty())
                throw new StackOutOfBoundsException("Stack Empty");
                else
                return items[stackTop];
        }
}
/*
   A class for handling stack errors.
*/
class StackOutOfBoundsException extends IndexOutOfBoundsException {
        public StackOutOfBoundsException() {} // default constructor
        public StackOutOfBoundsException(String problem) {
        super(problem); // let superclass constructor handle the argument
        }
}
/*
   A class for compiling and executing the java source code in a separate thread
   @see Thread.
*/
class JavaCommands extends Thread{
        static String  path = ""; // this is the path to the java bin directory
        // the main program sets this each time the program is loaded.
        String JAVA_HOME 		= System.getProperty("java.home");
        String java_dir			=JAVA_HOME.substring(0,JAVA_HOME.lastIndexOf(File.separator));
        String compileCommand	=java_dir+File.separator+"bin"+File.separator+"javac.exe ";
        String runClassCommand	=java_dir+File.separator+"bin"+File.separator+"java.exe ";
        /*
        needed to get streams from JDK.
        */
        Process compile;
        /*
        used to retrieve errors when compiling a file.
        */
        String errors;
        /*
        used for getting output from the jdk
        */
        BufferedReader br;
        /**
        command for thread to run
        */
        String command;
        String classname,classpath;
        /*
        This method compiles a .java file.
        @param filename the complete path of the source code file (.java).
        @see Exception
        */
        public void compile(String filename){
                String line = "";
                JEditor.errOutput.setText("");
                try{
                        compile = Runtime.getRuntime().exec(compileCommand +"\""+filename+"\"");
                        br = new BufferedReader(new InputStreamReader(compile.getErrorStream()));
                }
                catch(Exception e){
                        JEditor.errOutput.append("Error: "+e);
                        return;
                }
                // now we check for errors in the user code
                try{
                        while (true) {
                                line = br.readLine();
                                if(line != null){
                                        System.err.println(line + '\n');
                                        JEditor.errOutput.append(line+'\n');
                                 }
                                else
                                {
                                        br.close();
                                        break;
                                }
                        }
                }
                catch(Exception e)
                {
                        JEditor.errOutput.append("\nAttempt to check for errors failed");
                        compile.destroy();
                        return;
                }
                JEditor.errOutput.append('\n'+"Process completed");
                JEditor.errOutput.setCaretPosition(0);
        }
        /**
        This method invokes the run() method to execute a .class file.
        @param file the compelete path of the source code file
        */
        public  void runClass(String file)
        {
                Thread thead = new Thread(this);
                command = runClassCommand;
                classname=file.substring(file.lastIndexOf(File.separator)+1,file.length()-5);
                classpath=file.substring(0,file.lastIndexOf(File.separator));
                start();
        }
        /**
        This method executes a .class file in a separate thread
        @see Thread
        */
        public void run()
        {
                try
                {
         compile = Runtime.getRuntime().exec(command +"-classpath "+"\""+classpath+"\" "+classname);
        }
                catch(Exception e)
                {
                JEditor.errOutput.append("\nFailed to execute java.exe " + "check the directory and try again");
                return;
                }
                try
                {
                        BufferedReader br = new BufferedReader(new InputStreamReader(compile.getInputStream()));

                        while(true)
                        {
                         String line = br.readLine();
                         if	(line == null)
                                {
                                        br.close();
                                        break;
                                }
                                else if(line.length() > 0)
                                        JEditor.errOutput.append("\n: " + line + '\n');
                        }
                        compile.destroy();
                }
                catch(Exception e)
                {
                        JEditor.errOutput.append("\nRedirecting System.out failed");
                        compile.destroy();
                }



        }
}
/**
   the main class for creating the frame and mainpulating the commands.
*/
public class JEditor extends JInternalFrame implements ActionListener,CaretListener{
        JFrame      thisFrame=new JFrame();
        JPanel northPanel	= new JPanel();
        JToolBar toolBar	= new JToolBar();
        JDesktopPane desktop;
        JTabbedPane desktopTabbedPane = new JTabbedPane(SwingConstants.BOTTOM);
        JPanel statusPanel=new JPanel(new BorderLayout());
        JSplitPane splitPaneV;
        JScrollPane textareaScrollPane;
        JLabel col_row=new JLabel("Col: " + 0 + " Row: " + 0);
        int document = 1,tabIndex=0;
        String filePath;
        JButton newButton,openButton,saveButton,saveAsButton,cutButton,copyButton,pasteButton,undoButton,redoButton,indentButton,undentButton,compileButton,runButton;
        JButton[] toolbarButton=new JButton[13];
        String [] toolbarImages= {"new","open","save","saveas","cut","copy","paste","undo","redo","indent","undent","compile","run"};
        JInternalFrame jif[]=new JInternalFrame[50];
        JTextArea[] jta=new JTextArea[50];
        boolean[] isChanged=new boolean[50];
        String[] savedFileName=new String[50];
        Font myFont=new Font("Courier",Font.PLAIN,12);
        static JTextArea errOutput=new JTextArea();
        JMenuBar jmb = new JMenuBar();
        JMenu jmFile = new JMenu(" File ");
        JMenu jmEdit = new JMenu(" Edit ");
        JMenu jmBuild = new JMenu(" Build ");
        JMenu jmHelp = new JMenu(" Help ");
        JMenuItem jmiNew,jmiOpen,jmiClose,jmiSave,jmiSaveAs,jmiExit;
        JMenuItem jmiCut,jmiCopy,jmiPaste,jmiSelectAll,jmiGoTo,jmiUndo;
        JMenuItem jmiCompile,jmiExecute;
        JMenuItem jmiHelp,jmiAbout;
        // Go to frame components
    JTextArea textarea;
        JTextField linenumber=new JTextField(15);
        JFrame jfGoto=new JFrame("Go to line number");
        JLabel jlFromTo=new JLabel();
        JButton jbGoto=new JButton("Go");
        //creates two stacks of size 100
        StackArray string_stack = new StackArray(100);
        StackArray location_stack = new StackArray(100);
  private JToolBar jToolBar1 = new JToolBar();
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  private JButton jButton4 = new JButton();
  private JButton jButton5 = new JButton();
  private JButton jButton6 = new JButton();
  private JButton jButton7 = new JButton();
  private JButton jButton8 = new JButton();
  private JButton jButton9 = new JButton();
  private JButton jButton10 = new JButton();
  private JButton jButton11 = new JButton();
  private JButton jButton12 = new JButton();
  private JButton jButton13 = new JButton();
  private JButton jButton14 = new JButton();
        public JEditor(){
                Container cp=getContentPane();
                //creates menus
                setJMenuBar(menuBar());
                northPanel.setLayout(new BorderLayout());
                //adding buttons to the toolbar
                addButtons(toolBar);
                //adding the toolbar to the panel
                northPanel.add("North", toolBar);
                //adding the panel to the contentpane
                cp.add("North",northPanel);
                splitPaneV = new JSplitPane(JSplitPane.VERTICAL_SPLIT );
                Dimension minimumSize = new Dimension(0, 500);
                desktopTabbedPane.setMinimumSize(minimumSize);
                splitPaneV.setLeftComponent(desktopTabbedPane);
                splitPaneV.setRightComponent(new JScrollPane(errOutput));
                splitPaneV.setOneTouchExpandable(true);
                cp.add("Center",splitPaneV);
                statusPanel.add(col_row,BorderLayout.EAST);
                cp.add("South",statusPanel);
               int width=Toolkit.getDefaultToolkit().getScreenSize().width;
               int height=Toolkit.getDefaultToolkit().getScreenSize().height;
               setBounds( 0, 0, width, height - 50 );
               setTitle("JEditor ");
               show();
        /*       addWindowListener(new WindowAdapter(){
                       public void windowClosing(WindowEvent e){
                               closeAllFrames();
                               System.out.print("\n");
                               System.exit(0);
                        }
                });
        */
    try
    {
      jbInit();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
               }
        private JMenuBar menuBar(){
                //File Menu
                jmiNew = new JMenuItem(" New ");
                jmiNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
                jmiNew.setIcon(new ImageIcon("images/new.gif"));
                jmiNew.addActionListener(this);
                jmFile.add(jmiNew);
                jmiOpen = new JMenuItem(" Open... ");
                jmiOpen.addActionListener(this);
                jmiOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
                jmiOpen.setIcon(new ImageIcon("images/open.gif"));
                jmFile.add(jmiOpen);
                jmiClose = new JMenuItem(" Close ");
                jmiClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                closeFrame();
            }
        });
                jmFile.add(jmiClose);
                jmFile.addSeparator();
                jmiSave = new JMenuItem(" Save ");
                jmiSave.addActionListener(this);
                jmiSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
                jmiSave.setIcon(new ImageIcon("images/save.gif"));
                jmFile.add(jmiSave);
                jmiSaveAs = new JMenuItem(" Save As... ");
                jmiSaveAs.addActionListener(this);
                jmiSaveAs.setIcon(new ImageIcon("images/saveas.gif"));
                jmFile.add(jmiSaveAs);
                jmFile.addSeparator();
                jmiExit = new JMenuItem(" Exit ");
                jmiExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
                jmiExit.addActionListener(this);
                jmFile.add(jmiExit);
                //Edit Menu
                jmiCut = new JMenuItem(" Cut ");
                jmiCut.setAccelerator(KeyStroke.getKeyStroke(
                        KeyEvent.VK_X, ActionEvent.CTRL_MASK));
                jmiCut.addActionListener(this);
                jmEdit.add(jmiCut);
                jmiCopy = new JMenuItem(" Copy ");
                jmiCopy.addActionListener(this);
                jmiCopy.setAccelerator(KeyStroke.getKeyStroke(
                        KeyEvent.VK_C, ActionEvent.CTRL_MASK));
                jmEdit.add(jmiCopy);
                jmiPaste  = new JMenuItem(" Paste ");
                jmiPaste.addActionListener(this);
                jmiPaste.setAccelerator(KeyStroke.getKeyStroke(
                        KeyEvent.VK_V, ActionEvent.CTRL_MASK));
                jmEdit.add(jmiPaste);
                jmEdit.addSeparator();
                jmiSelectAll = new JMenuItem(" Select All ");
                jmiSelectAll.setAccelerator(KeyStroke.getKeyStroke(
                        KeyEvent.VK_A, ActionEvent.CTRL_MASK));
                jmiSelectAll.addActionListener(this);
                jmEdit.add(jmiSelectAll);
                jmiGoTo = new JMenuItem(" Go To... ");
                jmiGoTo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                goTo();
            }
        });
                jmiGoTo.setAccelerator(KeyStroke.getKeyStroke(
                        KeyEvent.VK_G, ActionEvent.CTRL_MASK));
                jmEdit.add(jmiGoTo);
                jmEdit.addSeparator();
                jmiUndo = new JMenuItem(" Undo  ");
                jmiUndo.addActionListener(this);
                jmiUndo.setAccelerator(KeyStroke.getKeyStroke(
                        KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
                jmEdit.add(jmiUndo);

                //Build Menu
                jmiCompile = new JMenuItem(" Compile File ");
                jmiCompile.addActionListener(this);
                jmBuild.add(jmiCompile);
                jmiExecute = new JMenuItem(" Execute File ");
                jmiExecute.addActionListener(this);
                jmBuild.add(jmiExecute);
                //Help Menu
                jmiHelp = new JMenuItem(" Help Contents... ");
                jmHelp.add(jmiHelp);
                jmHelp.addSeparator();
                jmiAbout = new JMenuItem(" About ");
                jmHelp.add(jmiAbout);

                jmb.add(jmFile);
                jmb.add(jmEdit);
                jmb.add(jmBuild);
                jmb.add(jmHelp);
                return jmb;
        }
        /**
        this method is called when the caret position is updated.
        @param e the caret event.
        */
        public void caretUpdate(CaretEvent e)
        {
                try
                {
                        int col = e.getDot() - jta[desktopTabbedPane.getSelectedIndex()].getLineStartOffset(jta[desktopTabbedPane.getSelectedIndex()].getLineOfOffset(e.getDot())) + 1;
                        int row= jta[desktopTabbedPane.getSelectedIndex()].getLineOfOffset(e.getDot()) + 1;
                        col_row.setText("Col: " + col + " Row: " + row);
                }
                catch(Exception ex)
                {System.err.println(ex);}
        }
        /**
        this method is invoked when an action occurs.
        @param e the action event.
        */
        public void actionPerformed(ActionEvent e){
                if ((e.getSource()==jmiNew)||(e.getSource()==toolbarButton[0]))
                        newFile(false,null);
                else if ((e.getSource()==jmiOpen)||(e.getSource()==toolbarButton[1]))
                        openFile();
                else if ((e.getSource()==jmiSave)||(e.getSource()==toolbarButton[2]))
                        save();
                else if ((e.getSource()==jmiSaveAs)||(e.getSource()==toolbarButton[3]))
                        saveAs();
                else if(e.getSource()==jmiCut || e.getSource()==toolbarButton[4])
                        cut();
                else if(e.getSource()==jmiCopy || e.getSource()==toolbarButton[5])
                        jta[desktopTabbedPane.getSelectedIndex()].copy();
                else if(e.getSource()==jmiPaste || e.getSource()==toolbarButton[6])
                        paste();
                else if(e.getSource()==jmiUndo || e.getSource()==toolbarButton[7])
                        undo();
                else if(e.getSource()==toolbarButton[9])
                        increaseIndent();
                else if(e.getSource()==toolbarButton[10])
                        decreaseIndent();
                else if(e.getSource()==jmiCompile || e.getSource()==toolbarButton[11])
                        compile();
                else if(e.getSource()==jmiExecute || e.getSource()==toolbarButton[12])
                        execute();
                else if(e.getSource()==jmiSelectAll){
                        jta[desktopTabbedPane.getSelectedIndex()].selectAll();
                        jta[desktopTabbedPane.getSelectedIndex()].requestFocus();
                }
                else if(e.getSource()==jmiExit){
                        closeAllFrames();
                        this.setVisible(false);
                }
        }
        /**
        This method adds buttons to the toolbar.
        @param toolBar the toolbar to which the buttons are added.
        */
        void addButtons(JToolBar toolBar) {
        for (int i=0;i<13;i++){
                toolbarButton[i] = new JButton(new ImageIcon("images/"+toolbarImages[i]+".gif"));
                toolbarButton[i].setToolTipText(toolbarImages[i]);
                toolbarButton[i].addActionListener(this);

                        if(i==1 ||i==4 || i==7 || i==9 || i==11) {
                                toolBar.add(new JToolBar.Separator());
                                toolBar.add(toolbarButton[i]); }
                        else
                        toolBar.add(toolbarButton[i]);
                if (i!=0 && i!=1)
                                toolbarButton[i].setEnabled(false);
             }
    }
    /**
        Transfers the selected range in the associated text model to the system clipboard, removing the contents from the model. Does nothing for null selections.
        */
    private void cut(){
            JTextArea t=jta[desktopTabbedPane.getSelectedIndex()];
        string_stack.push(t.getSelectedText());
        location_stack.push(""+t.getSelectionStart());
        toolbarButton[7].setEnabled(true); // enable undo button
        t.cut();
        t.requestFocus();
    }
    /**
       Transfers the contents of the system clipboard into the associated text model.
        */
    private void paste(){
                   JTextArea t=jta[desktopTabbedPane.getSelectedIndex()];

        int start=t.getCaretPosition();
        t.paste();
        int end =t.getCaretPosition();

        t.setSelectionStart(start);
        t.setSelectionEnd(end);

        string_stack.push(t.getSelectedText());
        location_stack.push(""+start+","+end);
        toolbarButton[7].setEnabled(true); // enable undo button
        t.setSelectionStart(end);
        t.requestFocus();
    }
    /**
       Undo the last edit in the text component
        */
    private void undo(){
            JTextArea t=jta[desktopTabbedPane.getSelectedIndex()];
            try{
                String s=(String)location_stack.peek();
                if ((String)string_stack.peek()!=null)
                        if(s.indexOf(",")>0){ //undoing paste command
                                t.setSelectionStart(Integer.parseInt(s.substring(0,s.indexOf(","))));
                                t.setSelectionEnd(Integer.parseInt(s.substring(s.indexOf(",")+1)));
                                t.replaceSelection("");
                                t.requestFocus();
                            }
                        else // undoing Backspace
                        t.insert((String)string_stack.peek(),Integer.parseInt(s));
                else{ //undoing every typed character
                t.setSelectionStart(Integer.parseInt(s));
                t.setSelectionEnd(Integer.parseInt(s)+1);
                t.replaceSelection("");
                t.requestFocus();
                     }
                string_stack.pop();
                location_stack.pop();
                if (location_stack.isEmpty()) toolbarButton[7].setEnabled(false);

            }
            catch(StackOutOfBoundsException e) {
                        System.err.println("\n"+e);
                        t.requestFocus();
                }
    }
    /**
       Creats a new empty text area inside an internal frame.
        */
        private void newFile(boolean isSaved,String filename){
                String title;
                if(!isSaved){ //if the file is not saved
                        title = "Algorithm" + document; document++;
                        savedFileName[tabIndex]=null;
                }
                else
                        title = filename;
                //create new desktop
                desktop=new JDesktopPane();
                //creates a new internal frmae
                jif[tabIndex] = new JInternalFrame(title,true,true,true,true);
                jta[tabIndex] = new JTextArea();
                jta[tabIndex].setFont(myFont);
                jta[tabIndex].setTabSize(4);
                jta[tabIndex].setCaretColor(Color.red);
                jta[tabIndex].setMargin(new Insets(0, 5, 0, 5));
                //adding the textarea to the scrollpane
                textareaScrollPane=new JScrollPane(jta[tabIndex]);
                //adding the scrollpane to the internal frame
                jif[tabIndex].getContentPane().add(textareaScrollPane);
                //creating a new icon
            ImageIcon icon = new ImageIcon("images/icon.gif");
            jif[tabIndex].setResizable(true);
            //sets the size of the internal frame
                jif[tabIndex].setSize(600, 395);
                //adding the internal frame to the desktop
                desktop.add(jif[tabIndex]);
                //adding the desktop to a new tab
                desktopTabbedPane.addTab(title,icon,desktop,title);
                //selects the current tab
                desktopTabbedPane.setSelectedIndex(tabIndex);
                //sets the frame to be visible
                jif[tabIndex].setVisible(true);
                isChanged[tabIndex]=false;
                //adding a caretlistener to the current textarea
                jta[tabIndex].addCaretListener(this);
                //adding a keylistener to the current textarea
                jta[tabIndex].addKeyListener(new KeyAdapter() {
                        public void keyPressed(KeyEvent evt) {
                                int key = evt.getKeyCode();
                                JTextArea t=jta[desktopTabbedPane.getSelectedIndex()];
                                // if the pressed key is Backspace
                                if(key!=KeyEvent.VK_BACK_SPACE){
                                        string_stack.push(null);
                                        location_stack.push(""+t.getCaretPosition());
                                        toolbarButton[7].setEnabled(true);
                                }
                else{
                        char last_char=t.getText().charAt(t.getCaretPosition()-1);
                        string_stack.push(""+last_char);
                        location_stack.push(""+(t.getCaretPosition()-1));
                        toolbarButton[7].setEnabled(true);
                }
                desktopTabbedPane.setTitleAt(desktopTabbedPane.getSelectedIndex(),jif[desktopTabbedPane.getSelectedIndex()].getTitle()+" * ");
                                isChanged[desktopTabbedPane.getSelectedIndex()]=true;
                        }
                });
                //adding a listener to the internal frame
                jif[tabIndex].addInternalFrameListener(new InternalFrameAdapter(){
                       public void internalFrameClosing(InternalFrameEvent e){
                               closeFrame();
                        }
                });
                tabIndex++;
                errOutput.setText("");
                for (int i=2;i<13;i++)
                        if (i!=7 && i!=8) toolbarButton[i].setEnabled(true);

        }
        /**
       Increases the indent of the selected line(s).
        */
        private void increaseIndent(){
                JTextArea textArea = jta[desktopTabbedPane.getSelectedIndex()];
                Caret caret = textArea.getCaret();
                int dot = caret.getDot();
                int mark = caret.getMark();
                boolean cursorFront = true;
                // Used for setting cursor
                int startOffset = 0,endOffset = 0;
                if (dot == mark) {  // no selection
                    startOffset = dot;
                    endOffset = dot;
                } else if (dot < mark) {
                    startOffset = dot;
                    endOffset = mark;
                } else {
                    startOffset = mark;
                    endOffset = dot;
                    cursorFront = false;
                }
                // Used within while loop below
                int start = startOffset;
                int line = 0;
                try {
                    line =  textArea.getLineOfOffset( startOffset );
                    start = textArea.getLineStartOffset( line );
                }
                catch ( BadLocationException ble ) {
                        ble.printStackTrace();
                }
                 // Check first loop as undentAction latter on. Watch out for soft&hard tab
                while ( true ) {
                    try {
                      textArea.setCaretPosition(start);
                      textArea.replaceSelection("\t");
                      endOffset++;
                      line = textArea.getLineOfOffset( start );
                          start = textArea.getLineEndOffset(line);
                      if ( endOffset < start )
                      break;
                    }
                    catch ( BadLocationException ble ) { ble.printStackTrace(); }
                 } // End while
                startOffset++;
                if ( cursorFront ) {
                   textArea.setCaretPosition( endOffset );
                   textArea.moveCaretPosition( startOffset );
                }
                else {
                        textArea.setCaretPosition( startOffset );
                          textArea.moveCaretPosition( endOffset );
                }
                textArea.requestFocus();
        }
        /**
       Decreases the indent of the selected line(s).
       @throws BadLocationException
        */
        private void decreaseIndent(){
                JTextArea textArea = jta[desktopTabbedPane.getSelectedIndex()];
                Caret caret = textArea.getCaret();
                int dot = caret.getDot();
                int mark = caret.getMark();
                boolean cursorFront = true;
                // Used for setting cursor
                int startOffset = 0,
                     endOffset = 0;
                if (dot == mark) {  // no selection
                    startOffset = dot;
                    endOffset = dot;
                } else if (dot < mark) {
                   startOffset = dot;
                    endOffset = mark;
                }
                else {
                    startOffset = mark;
                    endOffset = dot;
                    cursorFront = false;
                }
                int line = 0;
                // Used for working within while loop
                int start = 0;
                int end = 0;
                try {
                        line =  textArea.getLineOfOffset( startOffset );
                        start = textArea.getLineStartOffset(line);
                }
                catch ( BadLocationException ble ) {
                        ble.printStackTrace();
                }
                boolean decrementStart = true;
                if ( startOffset == start )
                        decrementStart = false;
                int tabSize = textArea.getTabSize();
                boolean firstLoop = true;
                // First loop checking takes care of soft/hard tab
                while ( true ) {
                        textArea.setCaretPosition(start);
                        try {
                                end = textArea.getLineEndOffset(line);
                                  String s = textArea.getText(start, end-start-1 );  // -1 is for '/n'
                                int c = undent( textArea, s, start, tabSize );
                                if ( firstLoop ) { // If first iteration
                                        firstLoop = false;
                                        if ( decrementStart ) {
                                                startOffset = startOffset - c;
                                        }
                                        else
                                                break;  // If cursor at start of line with no selection
                                }
                                start = end-c;
                                endOffset = endOffset - c;
                             if ( endOffset < start )
                              break;
                              line =  textArea.getLineOfOffset( start );
                        }
                      catch ( BadLocationException ble ) {
                                ble.printStackTrace();
                                return;
                        }
                } // End while
                if ( cursorFront ) {
                           textArea.setCaretPosition( endOffset );
                      textArea.moveCaretPosition( startOffset );
                  }
                 else {
                        textArea.setCaretPosition( startOffset );
                      textArea.moveCaretPosition( endOffset );
                  }
                  textArea.requestFocus();
        }
        /**
       Used by decreaseIndent(). .
        */
        public int undent( JTextArea textArea, String s, int start, int tabSize ) {
                Character tabChar = new Character('\t');
                int counter = 0;
                boolean tab = false;
                try {
                        // s is never null
                           for ( int j = 0; j < s.length(); j++ ) {
                                   char c = s.charAt(j);
                        if ( tabChar.equals( new Character(c) ) ) {
                                tab = true;
                                   break;
                                }
                                else if ( Character.isWhitespace( c ) ) {
                                        counter++;
                                }
                                else {
                                        break;
                                }
                        if ( counter == tabSize )
                           break;
                        }// End for

                        if ( tab ) {
                                textArea.replaceRange( "", start+counter, start+counter+1 );
                                counter = 1;
                        }
                        else {
                            if ( counter != 0 ) {
                        textArea.replaceRange( "", start, start+counter );
                            }
                        }
                }
                catch ( Exception ble ) {
              ble.printStackTrace();
                }
        return counter;

        } // End undent
        /**
       Closes the selected frame. .
        */
        private void closeFrame(){
                int selectedIndex=desktopTabbedPane.getSelectedIndex();
                if (isChanged[selectedIndex]){
                int n = JOptionPane.showConfirmDialog(null,"Do you want to save changes to "+
                        jif[selectedIndex].getTitle()+"?"
                        ,"JEditor ",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                        if(n == JOptionPane.YES_OPTION){
                        if(savedFileName[selectedIndex]== null)
                                saveAs() ;
                        else
                                save();
                        }
                }
                desktopTabbedPane.removeTabAt(selectedIndex); tabIndex--;
                if (desktopTabbedPane.getTabCount()==0){
                        for (int i=0; i<toolbarButton.length;i++)
                        if(i!=0 && i!=1)
                        toolbarButton[i].setEnabled(false); errOutput.setText("");
                }
    }
    /**
       Closes all availble frames. .
        */
        private void closeAllFrames(){
                int last_tab_index=desktopTabbedPane.getTabCount()-1;
                while (last_tab_index>=0){
                        if (isChanged[last_tab_index]){
                        int n = JOptionPane.showConfirmDialog(null,"Do you want to save changes to "+
                                jif[last_tab_index].getTitle()+"?"
                                ,"JEditor",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                                if(n == JOptionPane.YES_OPTION){
                                if(savedFileName[last_tab_index]== null)
                                        saveAs() ;
                                else
                                        save();
                                }
                        }
                        desktopTabbedPane.removeTabAt(last_tab_index); last_tab_index--;
                }
    }
    /**
       Loads the contents of a file into the text component.
       @throws IOException
        */
        private void openFile() {
            // Use a filedialog to get the input file
            FileDialog fd = new FileDialog(thisFrame, "Load File", FileDialog.LOAD );
            fd.show();
            String file = fd.getFile();
            if ( file == null ) // Cancel
              return;
            // Use a file input stream to read in the data
            try {
                    String fullPath=fd.getDirectory()+fd.getFile();
                    FileInputStream fis = new FileInputStream (fullPath);
                    // Data read in bytes
                    byte [] data = new byte [ fis.available() ];
                    fis.read(data);
                    savedFileName[tabIndex]=fullPath;
                    newFile(true,file);
                    int index=desktopTabbedPane.getSelectedIndex();
                    jta[index].setText(new String(data));
                    jta[index].setCaretPosition(0);
                    jta[index].requestFocus();
            }
            catch (IOException e ) {
                    System.err.println("Could not load file..." );
            }
        }
    /**
       Saves the changes to the file.
        */
        private void save(){
                int selectedIndex=desktopTabbedPane.getSelectedIndex();
                try{
                        if(savedFileName[selectedIndex]==null)
                                saveAs();
                        else{
                                FileOutputStream fos=new FileOutputStream(savedFileName[selectedIndex]);
                                fos.write(jta[selectedIndex].getText().getBytes());
                                fos.close();
                                desktopTabbedPane.setTitleAt(selectedIndex,jif[selectedIndex].getTitle());

                        }
                }
                catch(Exception e)
                {
                        System.err.println("Save Failed");
                }
        }
        /**
       Saves the contents of the text component to a file.
       @throws IOException
        */
        private void saveAs(){
                int index=desktopTabbedPane.getSelectedIndex();
                FileDialog fd = new FileDialog(thisFrame,"Save ",FileDialog.SAVE);
                fd.setFile(jif[desktopTabbedPane.getSelectedIndex()].getTitle());
                fd.show();
                if(fd.getFile() == null) //when choose cancel
                        return;
                try{
                        String fullPath=fd.getDirectory()+fd.getFile();
                        FileOutputStream fos=new FileOutputStream(fullPath);
                        fos.write(jta[index].getText().getBytes());
                        fos.close();

                        // change title to new file name.
                        desktopTabbedPane.setTitleAt(index,fd.getFile());
                        jif[desktopTabbedPane.getSelectedIndex()].setTitle(fd.getFile());
                        savedFileName[tabIndex-1]=fullPath;

                }
                catch(Exception e)
                {
                        System.err.println("Save Failed");
                }
        }
    /**
       Displays a window to enter the number of the line to which you want to go.
        */
        private void goTo(){
                if(desktopTabbedPane.getSelectedIndex()<0) return; //if there's no tabs
                textarea = jta[desktopTabbedPane.getSelectedIndex()];
                jlFromTo.setText("1-"+ textarea.getLineCount());
                jfGoto.getContentPane().setLayout(new FlowLayout());
                jfGoto.getContentPane().add(jlFromTo);
                jfGoto.getContentPane().add(linenumber);
                jfGoto.getContentPane().add(jbGoto);
                jfGoto.pack();
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                jfGoto.setLocation((screenSize.width-jfGoto.getWidth()) / 2, (screenSize.height-jfGoto.getHeight())/ 2);
                jfGoto.show();
                 String  line = linenumber.getText();
                jbGoto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                    String line = linenumber.getText();
                if(line != null){
                                        try	{
                                                int go = Integer.parseInt(line);
                                                textarea.select(textarea.getLineStartOffset(go - 1),textarea.getLineEndOffset(go - 1) - 1);
                                                textarea.requestFocus();

                                        }
                                        catch(Exception e){
                                                errOutput.setText(line + " is not a valid line number");
                                        }

                    }
                    jfGoto.dispose();
                }
                });
        }
    /**
       to check if the file in the selected frame is saved or not. if it's saved it invokes compile() method of JavaCommands class. if the file is not saved it displays the Save As dialaog.
       @see JavaCommands
        */
                private void compile(){
                if(savedFileName[desktopTabbedPane.getSelectedIndex()] == null)
                {
                        int n = JOptionPane.showConfirmDialog(null,
                                "you should save this file before compiling ? ",
                                "JEditor ",
                                JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
                        if(n == JOptionPane.YES_OPTION)
                                        saveAs();
                                else
                                        return;
                }
                else
                {
                        try
                        {
                                save();
                                JavaCommands c = new JavaCommands();
                                c.compile(savedFileName[desktopTabbedPane.getSelectedIndex()]);
                        }
                        catch(Exception e)
                        {System.err.println(e);}
                }
        }
        /**
       to check if the file in the selected frame is saved or not. if it's saved it invokes runClass() method of JavaCommands class. if the file is not saved it displays the Save As dialaog.
       @see JavaCommands
        */
        private void execute(){
                int index=desktopTabbedPane.getSelectedIndex();
                if(savedFileName[index] == null)
                {
                        int n = JOptionPane.showConfirmDialog(null,
                                "you should save this file before compiling ? ",
                                "JEditor ",
                                JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);
                        if(n == JOptionPane.YES_OPTION)
                                        saveAs();
                                else
                                        return;
                }
                else
                {
                        try
                        {
                                JavaCommands c = new JavaCommands();
                                c.runClass(savedFileName[index]);
                        }
                        catch(Exception e)
                        {System.err.println(e);}
                }
        }
        /**
        The main method creates JEditor object.
        @param String[] args: Command line arguments as an array of Strings.
        */

        public static void main(String[] aa)
        {
                new JEditor();

                }
  private void jbInit() throws Exception
  {
    jButton1.setIcon(new ImageIcon(JEditor.class.getResource("images/save.gif")));
    jButton1.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jButton1_actionPerformed(e);
      }
    });
    jButton2.setIcon(new ImageIcon(JEditor.class.getResource("images/saveas.gif")));
    jButton2.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jButton2_actionPerformed(e);
      }
    });
    jButton3.setIcon(new ImageIcon(JEditor.class.getResource("images/cut.gif")));
    jButton3.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jButton3_actionPerformed(e);
      }
    });
    jButton4.setIcon(new ImageIcon(JEditor.class.getResource("images/copy.gif")));
    jButton4.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jButton4_actionPerformed(e);
      }
    });
    jButton5.setIcon(new ImageIcon(JEditor.class.getResource("images/paste.gif")));
    jButton5.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jButton5_actionPerformed(e);
      }
    });
    jButton6.setIcon(new ImageIcon(JEditor.class.getResource("images/undo.gif")));
    jButton6.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jButton6_actionPerformed(e);
      }
    });
    jButton7.setIcon(new ImageIcon(JEditor.class.getResource("images/redo.gif")));
    jButton7.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jButton7_actionPerformed(e);
      }
    });
    jButton8.setIcon(new ImageIcon(JEditor.class.getResource("images/indent.gif")));
    jButton8.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jButton8_actionPerformed(e);
      }
    });
    jButton9.setIcon(new ImageIcon(JEditor.class.getResource("images/undent.gif")));
    jButton9.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jButton9_actionPerformed(e);
      }
    });
    jButton10.setIcon(new ImageIcon(JEditor.class.getResource("images/compile.gif")));
    jButton10.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jButton10_actionPerformed(e);
      }
    });
    jButton11.setIcon(new ImageIcon(JEditor.class.getResource("images/open.gif")));
    jButton11.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jButton11_actionPerformed(e);
      }
    });
    jButton12.setIcon(new ImageIcon(JEditor.class.getResource("images/new.gif")));
    jButton12.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jButton12_actionPerformed(e);
      }
    });
    jButton13.setIcon(new ImageIcon(JEditor.class.getResource("images/run.gif")));
    jButton13.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jButton13_actionPerformed(e);
      }
    });
    jButton14.setIcon(new ImageIcon(JEditor.class.getResource("images/noidea.gif")));
    jButton14.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton14_actionPerformed(e);
      }
    });
    this.getContentPane().add(jToolBar1, BorderLayout.NORTH);
    jToolBar1.add(jButton12, null);
    jToolBar1.add(jButton11, null);
    jToolBar1.add(jButton1, null);
    jToolBar1.add(jButton2, null);
    jToolBar1.add(jButton3, null);
    jToolBar1.add(jButton4, null);
    jToolBar1.add(jButton5, null);
    jToolBar1.add(jButton6, null);
    jToolBar1.add(jButton7, null);
    jToolBar1.add(jButton8, null);
    jToolBar1.add(jButton9, null);
    jToolBar1.add(jButton10, null);
    jToolBar1.add(jButton13, null);
    jToolBar1.add(jButton14, null);
  }
// execute
    void jButton13_actionPerformed(ActionEvent e)
  {
 execute();
  }
// new
  void jButton12_actionPerformed(ActionEvent e)
  {
 newFile(false,null);
  }

  void jButton11_actionPerformed(ActionEvent e)
  {
    openFile();
  }

  void jButton1_actionPerformed(ActionEvent e)
  {
  save();
  }

  void jButton2_actionPerformed(ActionEvent e)
  {
saveAs();
  }

  void jButton3_actionPerformed(ActionEvent e)
  {
cut();
  }

  void jButton4_actionPerformed(ActionEvent e)
  {
    jta[desktopTabbedPane.getSelectedIndex()].copy();
  }

  void jButton5_actionPerformed(ActionEvent e)
  {
paste();
  }

  void jButton6_actionPerformed(ActionEvent e)
  {
undo();
  }

  void jButton7_actionPerformed(ActionEvent e)
  {

  }

  void jButton8_actionPerformed(ActionEvent e)
  {
   increaseIndent();
  }

  void jButton9_actionPerformed(ActionEvent e)
  {
decreaseIndent();
  }

  void jButton10_actionPerformed(ActionEvent e)
  {
  compile();
  }

  void this_internalFrameClosing(InternalFrameEvent e) {

  }

  void jButton14_actionPerformed(ActionEvent e) {
//add all algorithm
  try
  {
    Head.addAlog (savedFileName);
  }
  catch (Exception ex){ }
  }

}