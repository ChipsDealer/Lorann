package model.immobile;

import model.Property;
import model.Sprite;

public class LateralBone extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("LateralBone.jpg", ']');

    
    /**
     * Instanciate a new LateralBone
     */
	LateralBone() {
		super(SPRITE, Property.BLOCKING_WITH_ACTION);
	}

}