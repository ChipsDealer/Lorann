package model;

import java.io.FileNotFoundException;
import java.sql.ResultSet;


/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IModel {

	public void getProcedureMotion() throws Exception;
	
	public void getProcedureMotionLess() throws Exception;
	
	public void createMap() throws Exception;
	
	public void loadMap();
	
	public int getLifes();
	
	public int getScore();
	
	public int getMapY();
	
	public void setMapY(int mapY);
	
	public int getMapX();
	
	public void setMapX(int mapY);
	
	public void moveMobile();
	
	public void moveLorann(String dir);
	
	public boolean isGameRunning();
	
	public boolean isLorannAlive();
	
	public String[][] convertMotionLessMap();
	
	public String[] convertMotionMapImages();
	
	public int[][] convertMotionMapDimension();
	
	public void respawn();
	
	public void lorannAction(boolean bool);
	
	public boolean getLorannAction();
}
