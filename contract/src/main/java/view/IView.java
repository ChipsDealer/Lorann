package view;

import java.awt.event.KeyListener;

/**
 * <h1>The Interface IView.</h1>
 *
 * @author Nathan Beer nathan.beer@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_131
 */
public interface IView {

    /**
     * Display a message.
     *
     * @param message
     *            the message
     */
    void displayMessage(String message);
    
    /**
     * It used to create the display
     * 
     * @param motionMapDimension
     * @param motionMapImages
     * @param motionlessMap
     * @param score
     * @param life
     * @param width
     * @param length
     */
    public void createDisplay(int[][] motionMapDimension,String[] motionMapImages, String[][] motionlessMap, int score, int life, int width, int length);
    
    /**
     * It used to show the display
     * 
     * @param motionMapDimension
     * @param motionMapImages
     * @param motionlessMap
     * @param score
     * @param life
     */
    public void showDisplay(int[][] motionMapDimension,String[] motionMapImages, String[][] motionlessMap, int score, int life);
    
    /**
     * It used to add a keylistenet to the window
     * 
     * @param listener
     */
    public void addListener(KeyListener listener);
    
    /**
     * It used to show the endgame message
     * 
     * @param bool
     */
    public void endGame(boolean bool);
    
    /**
     * It used to exit the game
     * 
     */
	public void closeGame();

    
}
