package model.immobile;

import model.Property;
import model.Sprite;

public class KindDoor extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("KindDoor.jpg", ']');

    
    /**
     * Instanciate a new KindDoor
     */
	KindDoor() {
		super(SPRITE, Property.BLOCKING_WITH_ACTION);
	}

}