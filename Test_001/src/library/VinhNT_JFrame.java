package library;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class VinhNT_JFrame extends JFrame {

	public static final int  WINDOWS_WIDTH = 600;
	public static final int  WINDOWS_HEIGHT = 450;
	
	public VinhNT_JFrame() throws HeadlessException {
		// TODO Auto-generated constructor stub
		init();
	}

	public VinhNT_JFrame(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
		init();
	}

	public VinhNT_JFrame(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
		init();
	}

	public VinhNT_JFrame(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
		init();
	}
	
	public void init(){
		// SET SIZE
		setSize(WINDOWS_WIDTH, WINDOWS_HEIGHT);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationByPlatform(true);
	}
	
	public void hienThi(){
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
        		setVisible(true);
            }
        });
	}
	
	

}
