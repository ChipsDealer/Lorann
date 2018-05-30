package model.immobile;

import model.Property;
import model.Sprite;

public class WallCorner extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("WallCorner.jpg", ']');

    
    /**
     * Instanciate a new EnergicBubble
     */
	WallCorner() {
		super(SPRITE, Property.BLOCKING_WITH_ACTION);
	}

}