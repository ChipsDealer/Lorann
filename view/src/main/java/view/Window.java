package view;

import javax.swing.JFrame;

public class Window extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int widthMap;
	private int lengthMap;
	private Panel panel;
	
	public Window(int width, int length, int[][] motionMapDimension,String[] motionMapImages, String[][] motionlessMap, int score, int life)
	{
		this.widthMap = width;
		this.lengthMap = length;
		this.setTitle("Lorann java version");
		this.setSize((this.widthMap * 32) + 6, (this.lengthMap * 32) + 50);
		this.setLocationRelativeTo(null);               
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.panel = new Panel(motionMapDimension,motionMapImages, motionlessMap, score, life, width, length);
		this.setVisible(true);
		this.setContentPane(this.panel);
		requestFocusInWindow();
		
	}
 
	public int getWidthMap() {
		return this.widthMap;
	}

	public void setWidthMap(int width) {
		this.widthMap = width;
	}

	public int getLengthMap() {
		return this.lengthMap;
	}

	public void setLengthMap(int length) {
		this.lengthMap = length;
	}

	public Panel getPanel() {
		return this.panel;
	}

	public void setPanel(Panel panel) {
		this.panel = panel;
	}
	
}
