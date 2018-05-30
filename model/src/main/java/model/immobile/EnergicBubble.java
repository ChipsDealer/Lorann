package model.immobile;

import model.Property;
import model.Sprite;

public class EnergicBubble extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("EnergicBubble.jpg", ']');

    
    /**
     * Instanciate a new EnergicBubble
     */
	EnergicBubble() {
		super(SPRITE, Property.BLOCKING_WITH_ACTION);
	}

}
