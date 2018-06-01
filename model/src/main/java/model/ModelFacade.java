package model;

import java.awt.Point;
import java.sql.ResultSet;
import model.dao.MapDAO;
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
    
	@Override
	public ResultSet getProcedureMotion(final String id){
		return MapDAO.getProcedureMotion(id);
	}

	@Override
	public ResultSet getProcedureMotionLess(final String id){
		return MapDAO.getProcedureMotionLess(id);
	}

	@Override
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

}
