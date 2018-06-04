package model.motionLess;

import model.Property;
import model.Sprite;

/**
 * <h1>The Class BadDoor is a static element on the map.</h1>
 *
 * @author Léo thommes leo.thommes@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_131
 */

public class BadDoor extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\gate_closed.png", '#');

    
    /**
     * Instanciate a new BadDoor
     */
	BadDoor() {
		super(SPRITE, Property.BLOCKING_WITH_ACTION);
	}

}