package model.motionLess;

import model.HUD;
import model.Property;
import model.Sprite;
import model.mobile.Motion;


/**
 * <h1>The Class treasure is a static element on the map.</h1>
 *
 * @author Léo thommes leo.thommes@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_131
 */

public class Treasure extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\purse.png", 'C');

    
    /**
     * Instanciate a new Treasure
     * The constructor.
     */
	Treasure() {
		super(SPRITE, Property.PENETRABLE_WITH_ACTION);
	}


	/**
	 * This method allows to display score on HUD.
	 * 
	 * @param motion
	 * @param motionLess
	 */
	@Override
	public void action(Motion[] motion, MotionLess[][] motionLess) {
		HUD.addScore();
		int x = motion[0].getX();
		int y = motion[0].getY();
		motionLess[y][x] = new BasicGround();
	}
	
	
}
	
	
	
