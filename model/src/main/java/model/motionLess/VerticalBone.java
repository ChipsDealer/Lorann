package model.motionLess;

import model.Property;
import model.Sprite;


/**
 * <h1>The Class vertical bone is a static element on the map.</h1>
 *
 * @author Léo thommes leo.thommes@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_131
 */

public class VerticalBone extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\vertical_bone.png", '|');

    
    /**
     * Instanciate a new VerticalBone.
     * The constructor.
     */
	VerticalBone() {
		super(SPRITE, Property.BLOCKING_WITHOUT_ACTION);
	}

}