package model.motionLess;

import model.Property;
import model.Sprite;

public class EnergicBubble extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("crystal_ball.png", '@');

    
    /**
     * Instanciate a new EnergicBubble
     */
	EnergicBubble() {
		super(SPRITE, Property.PENETRABLE_WITH_ACTION);
	}

}
