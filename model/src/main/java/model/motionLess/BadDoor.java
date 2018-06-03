package model.motionLess;

import model.Property;
import model.Sprite;

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