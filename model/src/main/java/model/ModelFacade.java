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
 * @author Nathan Beer nathan.beer@viacesi.fr, Frost
 * @version 1.0
 * @since jdk1.8.0_171
 */
public class ModelFacade implements IModel {

	private int mapX;
	private int mapY;
	
	/**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
    	
    }
    
	/*
	 * (non-Javadoc)
	 * @see model.IModel#getProcedureMotion(java.lang.String)
	 */
	public ResultSet getProcedureMotion(final String id){
		return MapDAO.getProcedureMotion(id);
	}

	/*
	 * (non-Javadoc)
	 * @see model.IModel#getProcedureMotionLess(java.lang.String)
	 */
	public ResultSet getProcedureMotionLess(final String id){
		return MapDAO.getProcedureMotionLess(id);
	}

	/*
	 * (non-Javadoc)
	 * @see model.IModel#createMap()
	 */
	public void createMap() {
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.IModel#loadMap()
	 */
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
	
	/*
	 * (non-Javadoc)
	 * @see model.IModel#getLifes()
	 */
	public int getLifes()
	{
		return HUD.getLifes();
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.IModel#getScore()
	 */
	public int getScore()
	{
		return HUD.getScore();
	}
	
	/*
	 * The getter of the motionLess array
	 * @return motionLess[][]
	 */
	public MotionLess[][] getMotionLess()
	{
		return MotionLessFactory.getMotionLess();
	}
	
	/*
	 * The getter of the motion array
	 * @return motion[]
	 */
	public Motion[] getMotion()
	{
		return MotionFactory.getMotion();
	}

	/*
	 * (non-Javadoc)
	 * @see model.IModel#getMapY()
	 */
	public int getMapY() {
		return mapY;
	}

	/*
	 * (non-Javadoc)
	 * @see model.IModel#setMapY(int)
	 */
	public void setMapY(int mapY) {
		this.mapY = mapY;
	}

	/*
	 * (non-Javadoc)
	 * @see model.IModel#getMapX()
	 */
	public int getMapX() {
		return mapX;
	}

	/*
	 * (non-Javadoc)
	 * @see model.IModel#setMapX(int)
	 */
	public void setMapX(int mapX) {
		this.mapX = mapX;
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.IModel#moveMobile()
	 */
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
	
	/*
	 * (non-Javadoc)
	 * @see model.IModel#moveLorann(java.lang.String)
	 */
	public void moveLorann(String dir)
	{
		this.getMotion()[0].move(this.getMotion(), this.getMotionLess(), dir);
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.IModel#isGameRunning()
	 */
	public boolean isGameRunning()
	{
		return HUD.isGameRunning();
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.IModel#isLorannAlive()
	 */
	public boolean isLorannAlive()
	{
		return this.getMotion()[0].isAlive();
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.IModel#convertMotionLessMap()
	 */
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
	
	/*
	 * (non-Javadoc)
	 * @see model.IModel#convertMotionMapImages()
	 */
	public String[] convertMotionMapImages()
	{
		String[] motionMapImages = new String[6];
		for (int i=0; i < 6; i++ )
		{
			motionMapImages[i] = this.getMotion()[i].getSprite().getPathImage();
		}
	return motionMapImages;
	}
	
	/*
	 * (non-Javadoc)
	 * @see model.IModel#convertMotionMapDimension()
	 */
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
	
	/*
	 * (non-Javadoc)
	 * @see model.IModel#respawn()
	 */
	public void respawn()
	{
		HUD.lessLifes();
		this.loadMap();
		HUD.setScore(0);
	}
	
	/*
	 * non-Javadoc)
	 * @see model.IModel#lorannAction(boolean)
	 */
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
	
	/*
	 * (non-Javadoc)
	 * @see model.IModel#getLorannAction()
	 */
	public boolean getLorannAction()
	{
		return this.getMotion()[5].isAlive();
	}
	
}
