package model.motionLess;

import model.Property;
import model.Sprite;

public class KindDoor extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("gate_open.png", 'O');

    
    /**
     * Instanciate a new KindDoor
     */
	KindDoor() {
		super(SPRITE, Property.PENETRABLE_WITH_ACTION);
	}

}