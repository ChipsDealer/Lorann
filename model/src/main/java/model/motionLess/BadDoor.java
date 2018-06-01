package model.motionLess;

import model.Property;
import model.Sprite;

public class BadDoor extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("gate_closed.png", '#');

    
    /**
     * Instanciate a new BadDoor
     */
	BadDoor() {
		super(SPRITE, Property.PENETRABLE_WITH_ACTION);
	}

}