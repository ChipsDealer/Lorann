package view;

import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Nathan Beer nathan.beer@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_151
 * @see Window
 */
public class ViewFacade implements IView {

	/**
	 * Instanciate object window
	 */
	private Window window;
	
    /**
     * Constructor of ViewFacade
     * Instantiates a new view facade.
     * No parameters
     */
    public ViewFacade() {
        super();
    }

    /**
     * Method to create good window with parameters.
     * 
     * @param motionMapDimension position of the motion elements in 2 dimensions
     * @param motionMapImages image path for the motion elements
     * @param motionlessMap image path for the motion elements 
     * @param score score's player
     * @param life life's player
     * @param width dimension of the window
     * @param length dimension of the window
     */
    public void createDisplay(int[][] motionMapDimension,String[] motionMapImages, String[][] motionlessMap, int score, int life, int width, int length)
    {
    	this.window = new Window(width, length, motionMapDimension, motionMapImages, motionlessMap, score, life);
    }
    
    /**
     * Method to display all important information to the screen
     * 
     * @param motionMapDimension position of the motion elements in 2 dimensions
     * @param motionMapImages image path for the motion elements
     * @param motionlessMap image path for the motion elements 
     * @param score
     * @param life
     */
    public void showDisplay(int[][] motionMapDimension,String[] motionMapImages, String[][] motionlessMap, int score, int life)
    {
    	
    	/**
    	 * All the setMethod() to parameter window
    	 * Set the motionlessMap
    	 */
    	this.window.getPanel().setMotionlessMap(motionlessMap);
    	
    	/**
    	 * Set the motionMapDimension
    	 */
    	this.window.getPanel().setmotionMapDimension(motionMapDimension);
    	
    	/**
    	 * Set the motionMapImages
    	 */
    	this.window.getPanel().setMotionMapImages(motionMapImages);
    	
    	/**
    	 * Set the score to the panel
    	 */
    	this.window.getPanel().setScore(score);
    	
    	/**
    	 * Set the life to the panel
    	 */
    	this.window.getPanel().setLife(life);
    	
    	/**
    	 * Update the display
    	 */
    	this.window.repaint();
    }
    
    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     * @param message
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }


    /**
     * Getters and setters
     * @return the Window
     */
	public Window getWindow() {
		return window;
	}

	/**
	 * Getters and setters
	 * @param Window
	 */
	public void setWindow(Window window) {
		this.window = window;
	}
	
	/*
	 * (non-Javadoc)
	 * @see view.IView#addListener(java.awt.event.KeyListener)
	 */
	public void addListener(KeyListener listener)
	{
		this.getWindow().addKeyListener(listener);
	}
	/*
	 * Display the end game message
	 * @param bool
	 */
	public void endGame(boolean bool)
	{
		if (bool == true)
		{
			this.displayMessage("You won !");
		}
		else
		{
			this.displayMessage("You lost !");
		}
	}
	
	/*
	 * Close the window of the game
	 * No parameters
	 */
	public void closeGame()
	{
		this.getWindow().setVisible(false);
		Thread.currentThread().interrupt();
	}

}
