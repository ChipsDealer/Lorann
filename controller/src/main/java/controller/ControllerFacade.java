package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;

import model.IModel;
import view.IView;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller component.</h1>
 *
 * @author Nathan Beer nathan.beer@viacesi.fr
 * @version 1.0
 */
public class ControllerFacade implements IController, KeyListener {

    /** The view. */
    private final IView  view;

    /** The model. */
    private final IModel model;
    
    private String lorannDir;
    
    private boolean isLorannActionAlive;

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
    	this.getView().createDisplay(this.getModel().convertMotionMapDimension(), this.getModel().convertMotionMapImages(), this.getModel().convertMotionLessMap(), this.getModel().getScore(), this.getModel().getLifes(), this.getModel().getMapX(), this.getModel().getMapY());
    	this.getView().addListener(this);
    	runGame();
    }
    
    /*
     * Run the loop of the deplacements of the game
     * No parameters
     */
    public void runGame() throws Exception
    {
    	while (this.getModel().isGameRunning() == true & this.getModel().getLifes() > 0)
    	{
    		this.isLorannActionAlive = this.getModel().getLorannAction();
    		this.lorannDir = "nop";
    		Thread.sleep(200);
    		if (this.getModel().isLorannAlive() == true)
    		{
    			this.getModel().lorannAction(this.isLorannActionAlive);
    			this.getModel().moveMobile();
    			this.getModel().moveLorann(this.lorannDir);
    			
    			
    		}
    		else
    		{
    			this.getModel().respawn();
    		}
    		this.getView().showDisplay(this.getModel().convertMotionMapDimension(), this.getModel().convertMotionMapImages(), this.getModel().convertMotionLessMap(), this.getModel().getScore(), this.getModel().getLifes());
    	}
    	if (this.getModel().getLifes() > 0)
    	{
    		this.getView().endGame(true);
    	}
    	else
    	{
        	this.getView().endGame(false);
    	}
    	this.getView().closeGame();
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

    /*
     * (non-Javadoc)
     * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
     */
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	/*
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	/*
	 * (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	@Override
	public void keyTyped(KeyEvent e) {
		char direction = e.getKeyChar();
		switch (direction) 
		{
			case '8':
			{
				this.lorannDir = "Up";
			}
			break;
			
			case '2':
			{
				this.lorannDir = "Down";
			}
			break;
			
			case '6':
			{
				this.lorannDir = "Right";
			}
			break;
			
			case '4':
			{
				this.lorannDir = "Left";
			}
			break;

			case '9':
			{
				this.lorannDir = "UpRight";
			}
			break;
			
			case '7':
			{
				this.lorannDir = "UpLeft";
			}
			break;
			
			case '1':
			{
				this.lorannDir = "DownLeft";
			}
			break;
			
			case '3':
			{
				this.lorannDir = "DownRight";
			}
			break;
			
			case '5':
			{
				if (this.isLorannActionAlive == true)
				{
					this.isLorannActionAlive = false;
				}
				else
				{
					this.isLorannActionAlive = true;
				}
			}
			break;
			
			default:
				this.lorannDir = "nop";
			break;
		}
	}
}
