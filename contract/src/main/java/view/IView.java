package view;

import java.awt.event.KeyListener;

/**
 * <h1>The Interface IView.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IView {

    /**
     * Display message.
     *
     * @param message
     *            the message
     */
    void displayMessage(String message);
    
    public void createDisplay(int[][] motionMapDimension,String[] motionMapImages, String[][] motionlessMap, int score, int life, int width, int length);
    
    public void showDisplay(int[][] motionMapDimension,String[] motionMapImages, String[][] motionlessMap, int score, int life);
    
    public void addListener(KeyListener listener);
    
}
