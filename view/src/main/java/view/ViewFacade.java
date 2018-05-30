package view;

import javax.swing.JOptionPane;

/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView {

	
	private Window window;
    /**
     * Instantiates a new view facade.
     */
    public ViewFacade() {
        super();
    }

    public void createDisplay(int[][] motionMapDimension,String[] motionMapImages, String[][] motionlessMap, int score, int life, int width, int length)
    {
    	this.window = new Window(width, length, motionMapDimension, motionMapImages, motionlessMap, score, life);
    }
    
    public void showDisplay(int[][] motionMapDimension,String[] motionMapImages, String[][] motionlessMap, int score, int life)
    {
    	this.window.getPanel().setMotionlessMap(motionlessMap);
    	this.window.getPanel().setmotionMapDimension(motionMapDimension);
    	this.window.getPanel().setMotionMapImages(motionMapImages);
    	this.window.getPanel().setScore(score);
    	this.window.getPanel().setLife(life);
    	
    	this.window.repaint();
    }
    
    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }

	public Window getWindow() {
		return window;
	}

	public void setWindow(Window window) {
		this.window = window;
	}

}
