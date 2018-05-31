package model.immobile;

import model.Property;
import model.Sprite;

public class WallCorner extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("bone.png", 'X');

    
    /**
     * Instanciate a new WallCorner
     */
	WallCorner() {
		super(SPRITE, Property.BLOCKING_WITHOUT_ACTION);
	}

}