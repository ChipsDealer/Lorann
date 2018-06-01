package view;

import javax.swing.JFrame;

/**
 * <h1>The class that generate the window. </h1>
 * 
 * @author Nathan Beer nathan.beer@viacesi.fr
 * @version 1.0 
 * @since jre1.8.0_151
 * @see Panel
 */
public class Window extends JFrame{

	/**
	 * All the variable for the window
	 */
	
	/**
	 * Variable to identify window's class
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Variable to set window's dimension
	 */
	private int widthMap;
	
	/**
	 * Variable to set window's dimension
	 */
	private int lengthMap;
	
	/**
	 * Instanciate panel
	 */
	private Panel panel;
	
	/**
	 * Constructor of the window
	 * 
	 * @param width Dimension of the window
	 * @param length Dimension of the window
	 * @param motionMapDimension position of the motion elements in 2 dimensions
	 * @param motionMapImages image path for the motion elements
	 * @param motionlessMap	image path for the motion elements 
	 * @param score score's player
	 * @param life life's player
	 */
	public Window(int width, int length, int[][] motionMapDimension,String[] motionMapImages, String[][] motionlessMap, int score, int life)
	{
		this.widthMap = width;
		this.lengthMap = length;
		
		this.setTitle("Lorann Java 1.0");
		
		/**
		 * Calculate the size of the window including the sprite's size
		 */
		this.setSize((this.widthMap * 32) + 6, (this.lengthMap * 32) + 50);
		this.setLocationRelativeTo(null);               
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.panel = new Panel(motionMapDimension,motionMapImages, motionlessMap, score, life, width, length);
		this.setVisible(true);
		this.setContentPane(this.panel);
		requestFocusInWindow();
		
	}
	
	/**
	 * Getters and setters for panel and window
	 */
	
	/**
	 * Getters and setters
	 * @return size of widthMap
	 */
	public int getWidthMap() {
		return this.widthMap;
	}

	/**
	 * Getters and setters
	 * @param width
	 */
	public void setWidthMap(int width) {
		this.widthMap = width;
	}

	/**
	 * Getters and setters
	 * @return size of lengthMap
	 */
	public int getLengthMap() {
		return this.lengthMap;
	}

	/**
	 * Getters and setters
	 * @param length of the window
	 */
	public void setLengthMap(int length) {
		this.lengthMap = length;
	}

	/**
	 * Getters and setters
	 * @return the Panel
	 */
	public Panel getPanel() {
		return this.panel;
	}

	/**
	 * Getters and setters
	 * @param the panel
	 */
	public void setPanel(Panel panel) {
		this.panel = panel;
	}
	
}
