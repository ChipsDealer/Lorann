package model;

import java.awt.Point;
import java.sql.ResultSet;
import model.dao.MapDAO;
import model.mobile.Last_statement;
import model.mobile.Motion;
import model.mobile.MotionFactory;
import model.motionLess.MotionLess;
import model.motionLess.MotionLessFactory;
import model.HUD;


/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Léo Thommes leo.thommes@cesi.fr
 * @version 1.0
 */
public class ModelFacade implements IModel {

	private int mapX;
	private int mapY;
	
	/**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
    	
    }
    
	
	public ResultSet getProcedureMotion(final String id){
		return MapDAO.getProcedureMotion(id);
	}

	
	public ResultSet getProcedureMotionLess(final String id){
		return MapDAO.getProcedureMotionLess(id);
	}

	
	public void createMap() {
		
	}
	

	public void loadMap() {
		try {
			MotionFactory.loadFile();
			Point point = MotionLessFactory.loadFile();
			HUD.setMapX(point.x);
			HUD.setMapY(point.y);
			this.setMapX(point.x);
			this.setMapY(point.y);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int getLifes()
	{
		return HUD.getLifes();
	}
	
	public int getScore()
	{
		return HUD.getScore();
	}
	
	public MotionLess[][] getMotionLess()
	{
		return MotionLessFactory.getMotionLess();
	}
	
	public Motion[] getMotion()
	{
		return MotionFactory.getMotion();
	}

	public int getMapY() {
		return mapY;
	}

	public void setMapY(int mapY) {
		this.mapY = mapY;
	}

	public int getMapX() {
		return mapX;
	}

	public void setMapX(int mapX) {
		this.mapX = mapX;
	}
	
	public void moveMobile()
	{
		for (int i = 1; i < 6; i++)
		{
			if (this.getMotion()[i].isAlive() == true)
			{
				this.getMotion()[i].move(this.getMotion(), this.getMotionLess());
			}
		}
	}
	
	public void moveLorann(String dir)
	{
		this.getMotion()[0].move(this.getMotion(), this.getMotionLess(), dir);
	}
	
	public boolean isGameRunning()
	{
		return HUD.isGameRunning();
	}
	
	public boolean isLorannAlive()
	{
		return this.getMotion()[0].isAlive();
	}
	
	public String[][] convertMotionLessMap(){
			String [][] motionLessMap = new String[this.getMapY()][this.getMapX()];
			
			for (int i = 0; i < this.getMapY(); i++)
			{
				for (int j = 0; j < this.getMapX(); j++)
				{
					motionLessMap[i][j] = this.getMotionLess()[i][j].getSprite().getPathImage();
				}
			}
		
		return motionLessMap;
	}
	
	public String[] convertMotionMapImages()
	{
		String[] motionMapImages = new String[6];
		for (int i=0; i < 6; i++ )
		{
			motionMapImages[i] = this.getMotion()[i].getSprite().getPathImage();
		}
	return motionMapImages;
	}
	
	public int[][] convertMotionMapDimension()
	{
		
		int[][] motionMapDimension = new int[6][2];
		for (int i = 0; i < 6; i++)
		{
			
				if (this.getMotion()[i].isAlive() == true)
				{
					motionMapDimension[i][0] = this.getMotion()[i].getX();
					motionMapDimension[i][1] = this.getMotion()[i].getY();
					
				}
				else
				{
					motionMapDimension[i][0] = -1;
					motionMapDimension[i][1] = -1;
				}
				
		}
	return motionMapDimension;
	}
	
	
	public void respawn()
	{
		HUD.lessLifes();
		this.loadMap();
		HUD.setScore(0);
	}
	
	public void lorannAction(boolean bool)
	{
		if (bool == false)
		{
			this.getMotion()[5].setAlive(false);

		}
		else
		{
			if (this.getLorannAction() == false)
			{
				this.getMotion()[5].setLast_statement(this.getMotion()[0].getLast_statement());
				this.getMotion()[5].setX(this.getMotion()[0].getX());
				this.getMotion()[5].setY(this.getMotion()[0].getY());
				this.getMotion()[5].setAlive(true);
			}
		}
	}
	
	public boolean getLorannAction()
	{
		return this.getMotion()[5].isAlive();
	}
	
}
