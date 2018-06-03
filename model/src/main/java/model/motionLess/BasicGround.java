package model.motionLess;

import model.Property;
import model.Sprite;

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