package model.immobile;

import model.Property;
import model.Sprite;

public class VerticalBone extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("VerticalBone.jpg", ']');

    
    /**
     * Instanciate a new VerticalBone
     */
	VerticalBone() {
		super(SPRITE, Property.BLOCKING_WITH_ACTION);
	}

}