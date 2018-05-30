package model.immobile;

import model.Property;
import model.Sprite;

public class BadDoor extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("BadDoor.jpg", ']');

    
    /**
     * Instanciate a new BadDoor
     */
	BadDoor() {
		super(SPRITE, Property.BLOCKING_WITH_ACTION);
	}

}