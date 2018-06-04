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
	 * 
	 * @throws Exception
	 */
	public void getProcedureMotion() throws Exception;
	
	/**
	 * 
	 * @throws Exception
	 */
	public void getProcedureMotionLess() throws Exception;
	
	/**
	 * 
	 * @throws Exception
	 */
	public void createMap() throws Exception;
	
	public void loadMap();
	
	/**
	 * 
	 * @return the int
	 */
	public int getLifes();
	
	/**
	 * 
	 * @return the int
	 */
	public int getScore();
	
	/**
	 * 
	 * @return the int
	 */
	public int getMapY();
	
	/**
	 * 
	 * @param the mapY
	 */
	public void setMapY(int mapY);
	
	/**
	 * 
	 * @return the int
	 */
	public int getMapX();
	
	/**
	 * 
	 * @param the mapY
	 */
	public void setMapX(int mapY);
	
	public void moveMobile();
	
	/**
	 * 
	 * @param the dir
	 */
	public void moveLorann(String dir);
	
	/**
	 * 
	 * @return a boolean
	 */
	public boolean isGameRunning();
	
	/**
	 * 
	 * @return a boolean
	 */
	public boolean isLorannAlive();
	
	/**
	 * 
	 * @return a String
	 */
	public String[][] convertMotionLessMap();
	
	/**
	 * 
	 * @return a String
	 */
	public String[] convertMotionMapImages();
	
	/**
	 * 
	 * @return a int
	 */
	public int[][] convertMotionMapDimension();
	
	public void respawn();
	
	/**
	 * 
	 * @param a bool
	 */
	public void lorannAction(boolean bool);
	
	/**
	 * 
	 * @return a boolean
	 */
	public boolean getLorannAction();
}
