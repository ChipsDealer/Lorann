package model;

import java.io.FileNotFoundException;
import java.sql.ResultSet;


/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Nathan Beer nathan.beer@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_131
 */
public interface IModel {

	/**
	 * It used to download the motion map from the BDD
	 * 
	 * @throws Exception
	 */
	public void getProcedureMotion() throws Exception;
	
	/**
	 * It used to download the motionless map from the BDD
	 * 
	 * @throws Exception
	 */
	public void getProcedureMotionLess() throws Exception;
	
	/**
	 * It used to create the diffrents .txt files
	 * 
	 * @throws Exception
	 */
	public void createMap() throws Exception;
	
	/**
	 * It used to load the map from .txt files
	 */
	public void loadMap();
	
	/**
	 * Getter of lifes
	 * 
	 * @return the int
	 */
	public int getLifes();
	
	/**
	 * Getter of score
	 * 
	 * @return the int
	 */
	public int getScore();
	
	/**
	 * Getter of map length
	 * 
	 * @return the int
	 */
	public int getMapY();
	
	/**
	 * Setter of map length
	 * 
	 * @param mapY
	 * 			the mapY
	 */
	public void setMapY(int mapY);
	
	/**
	 * Getter of map width
	 * 
	 * @return the int
	 */
	public int getMapX();
	
	/**
	 * Setter of map width
	 * 
	 * @param mapY
	 * 			the mapX
	 */
	public void setMapX(int mapY);
	
	/**
	 * It used to move the mobile elements
	 */
	public void moveMobile();
	
	/**
	 * It used to move Lorann
	 * 
	 * @param dir
	 * 			the dir
	 */
	public void moveLorann(String dir);
	
	/**
	 * Getter of game status
	 * 
	 * @return a boolean
	 */
	public boolean isGameRunning();
	
	/**
	 * Getter of Lorann status
	 * 
	 * @return a boolean
	 */
	public boolean isLorannAlive();
	
	/**
	 * It used to convert the motionlessmap array
	 * 
	 * @return a String
	 */
	public String[][] convertMotionLessMap();
	
	/**
	 * It used to convert the motionmap array
	 * 
	 * @return a String
	 */
	public String[] convertMotionMapImages();
	
	/**
	 * It used to convert the motionmap array
	 * 
	 * @return a int
	 */
	public int[][] convertMotionMapDimension();
	
	/**
	 * It used to respawn Lorann
	 * 
	 */
	public void respawn();
	
	/**
	 * it used to activate the spell of Lorann
	 * 
	 * @param bool
	 * 			a bool
	 */
	public void lorannAction(boolean bool);
	
	/**Getter of Lorann spell status
	 * 
	 * @return a boolean
	 */
	public boolean getLorannAction();
}
