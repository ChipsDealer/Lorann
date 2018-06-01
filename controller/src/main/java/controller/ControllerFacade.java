package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;

import model.IModel;
import view.IView;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
<<<<<<< HEAD
public class ControllerFacade implements IControllerFacade, IOrderPerformer {

    private int speedThread;

    private Order stackOrder;

    private IViewFacade view;

    private IViewFacade model;


    public ControllerFacade(ControllerFacade view, ModelFacade model){

    }

    public void start(){

    }

    public void orderPerform(Order order){

    }

    public void clearStackOver(){

    }

    public IViewFacade getModel(){

    }

    public void setModel(IViewFacade model){

    }

    public IViewFacade getView(){

    }

    public void setView(IViewFacade view){

    }

    public Order getStackOrder(){

    }

    public void setStackOrder(Order stackOrder){

    }

    public IOrderPerformer getOrderPerformer(){

    }

=======
public class ControllerFacade implements IController, KeyListener {
>>>>>>> origin/Model

    /** The view. */
    private final IView  view;

    /** The model. */
    private final IModel model;
    
    private String lorannDir;

    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
    public ControllerFacade(final IView view, final IModel model) {
        super();
        this.view = view;
        this.model = model;
    }

    /**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     */
    public void start() throws Exception 
    {
    	this.getModel().createMap();
    	this.getModel().loadMap();
    	//this.getView().addListener(this);
    	this.getView().createDisplay(this.getModel().convertMotionMapDimension(), this.getModel().convertMotionMapImages(), this.getModel().convertMotionLessMap(), this.getModel().getScore(), this.getModel().getLifes(), this.getModel().getMapX(), this.getModel().getMapY());
    	runGame();
    }
    
    public void runGame() throws Exception
    {
    	while (this.getModel().isGameRunning() == true & this.getModel().getLifes() > 0)
    	{
    		this.getView().showDisplay(this.getModel().convertMotionMapDimension(), this.getModel().convertMotionMapImages(), this.getModel().convertMotionLessMap(), this.getModel().getScore(), this.getModel().getLifes());
    		Thread.sleep(500);
    		if (this.getModel().isLorannAlive() == true)
    		{
    			this.getModel().moveMobile();
    			//this.getModel().moveLorann(this.lorannDir);
    			
    		}
    		else
    		{
    			this.getModel().respawn();
    		}
    	}
    }

    /**
     * Gets the view.
     *
     * @return the view
     */
    public IView getView() {
        return this.view;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    public IModel getModel() {
        return this.model;
    }

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
