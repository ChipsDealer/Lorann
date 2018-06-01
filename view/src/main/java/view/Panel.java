package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * <h1>The class that manage the panel into the window. </h1>
 * 
 * @author Nathan Beer nathan.beer@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_151
 * @see Window
 */
public class Panel extends JPanel{

	/**
	 * Variable to identify this class
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Position of the motion elements in 2 dimensions
	 */
	private String[] motionMapImages;
	
	/**
	 * Image path for the motion elements
	 */
	private int[][] motionMapDimension;
	
	/**
	 * Image path for the motionless elements
	 */
	private String[][] motionlessMap;
	
	/**
	 * All the others variables for the Panel
	 */
	private int score;
	private int life;
	private int mapWidth;
	private int mapLength;
	
	/**
	 * Constructor of the panel
	 * 
	 * @param motionMapDimension Image path for the motion elements
	 * @param motionMapImages Position of the motion elements in 2 dimensions
	 * @param motionlessMap Image path for the motionless elements
	 * @param score score's player
	 * @param life life's player
	 * @param width Dimension of the Panel
	 * @param length Dimension of the Panel
	 */
	public Panel(int[][] motionMapDimension,String[] motionMapImages, String[][] motionlessMap, int score, int life, int width, int length)
	{
		this.motionlessMap = motionlessMap;
		this.motionMapDimension = motionMapDimension;
		this.motionMapImages = motionMapImages;
		this.score = score;
		this.life = life;
		this.mapWidth = width;
		this.mapLength = length;
		
	}
	

	/**
	 * Getters and setters
	 * @return the score 
	 */
	public int getScore() {
		return score;
	}
	
	/**
	 * Getters and setters
	 * @param score
	 */
	public void setScore(int score) {
		this.score = score;
	}
	
	/**
	 * Getters and setters
	 * @return number of lifes
	 */
	public int getLife() {
		return life;
	}
	
	/**
	 * Getters and setters
	 * @param life
	 */
	public void setLife(int life) {
		this.life = life;
	}
	
	/**
	 * Getters and setters
	 * @return Image path for the motion elements
	 */
	public int[][] getmotionMapDimension() {
		return motionMapDimension;
	}
	
	/**
	 * Getters and setters
	 * @param motionMap Image path for the motion elements
	 */
	public void setmotionMapDimension(int[][] motionMap) {
		this.motionMapDimension = motionMap;
	}
	
	/**
	 * Getters and setters
	 * @return Image path for the motionlesselements
	 */
	public String[][] getMotionlessMap() {
		return motionlessMap;
	}
	
	/**
	 * Getters and setters
	 * @param motionlessMap image path for the motionless elements
	 */
	public void setMotionlessMap(String[][] motionlessMap) {
		this.motionlessMap = motionlessMap;
	}
	
	/**
	 * Getters and setters
	 * @return position of the motion elements in 2 dimensions
	 */
	public String[] getMotionMapImages() {
		return motionMapImages;
	}
	
	/**
	 * Getters and setters
	 * @param motionMapImages position of the motion elements in 2 dimensions
	 */
	public void setMotionMapImages(String[] motionMapImages) {
		this.motionMapImages = motionMapImages;
	}
	
	/**
	 * Draw the tiles
	 */
	public void paintComponent(Graphics g)
	{
		/**
		 * Color of the basic ground
		 */
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, this.mapWidth * 32, (this.mapLength * 32) + 40);
		
		/**
		 * Load image for the motionless elements
		 */
		Image img;
		
		/**
		 * Travel all the tiles and drawImage with position
		 */
		for (int i = 0; i < this.mapLength; i++)
		{
			for (int j = 0; j < this.mapWidth; j++)
			{
				try {
				      img = ImageIO.read(new File(this.motionlessMap[i][j]));
				      g.drawImage(img, j*32, i*32, this);
				    } catch (Exception e) {
				      e.printStackTrace();
				    } 
			}
		}
		
		/**
		 * Load image for the motion elements
		 * If tiles's position are different of -1
		 */

		for (int i = 0; i < 6; i++)
		{
			if (motionMapDimension[i][0] != -1)
			{
				try {
				      img = ImageIO.read(new File(this.motionMapImages[i]));
				      g.drawImage(img, this.motionMapDimension[i][0] * 32, this.motionMapDimension[i][1] * 32, this);
				    } catch (Exception e) {
				      e.printStackTrace();
				    } 
			}
		}
		
		/**
		 * loadHud (not necessary but it's better for having better experiences)
		 */
	    g.setColor(Color.WHITE);
	    g.drawString("Lifes : " + this.life + "  -  Score : " + this.score, ((this.mapWidth * 32) / 2) - 60, (this.mapLength * 32) + 15);
	    
	}

}
