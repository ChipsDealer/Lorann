package model.motionLess;

import model.Property;
import model.Sprite;


/**
 * <h1>The Class Wall Corner is a static element on the map.</h1>
 *
 * @author Léo thommes leo.thommes@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_131
 */

public class WallCorner extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\bone.png", 'X');

    
    /**
     * Instanciate a new WallCorner.
     * The Constructor.
     */
	WallCorner() {
		super(SPRITE, Property.BLOCKING_WITHOUT_ACTION);
	}

}