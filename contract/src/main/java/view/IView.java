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
     * Display message.
     *
     * @param message
     *            the message
     */
    void displayMessage(String message);
    
    /**
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
     * 
     * @param motionMapDimension
     * @param motionMapImages
     * @param motionlessMap
     * @param score
     * @param life
     */
    public void showDisplay(int[][] motionMapDimension,String[] motionMapImages, String[][] motionlessMap, int score, int life);
    
    /**
     * 
     * @param listener
     */
    public void addListener(KeyListener listener);
    
    /**
     * 
     * @param bool
     */
    public void endGame(boolean bool);
    
	public void closeGame();

    
}
