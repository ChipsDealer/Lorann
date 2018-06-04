package model.motionLess;

import model.Property;
import model.Sprite;


/**
 * <h1>The Class Basic Ground is a static element on the map.</h1>
 *
 * @author Léo thommes leo.thommes@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_131
 */

public class BasicGround extends MotionLess{

	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\BasicGround.png", '_');

    
    /**
     * Instanciate a new BasicGround
     */
    BasicGround() {
		super(SPRITE, Property.PENETRABLE_WITHOUT_ACTION);
	}

}