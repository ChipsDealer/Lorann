package view;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Window extends JFrame{

	private int width;
	private int length;
	private Panel panel;
	
	public Window(int width, int length, int[][] motionMapDimension,String[] motionMapImages, String[][] motionlessMap, int score, int life)
	{
		this.width = width;
		this.length = length;
		this.panel = new Panel(motionMapDimension,motionMapImages, motionlessMap, score, life, width, length);
		
		this.setTitle("Lorann java version");
		this.setSize(this.width * 32, this.length * 32 + 40);
		this.setLocationRelativeTo(null);               
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setContentPane(this.panel);
		this.setResizable(false);
		requestFocusInWindow();
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Panel getPanel() {
		return panel;
	}

	public void setPanel(Panel panel) {
		this.panel = panel;
	}
	
}
