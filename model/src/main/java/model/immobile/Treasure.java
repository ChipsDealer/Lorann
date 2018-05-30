package model.immobile;

import model.Property;
import model.Sprite;

public class Treasure extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("purse.png", '$');

    
    /**
     * Instanciate a new Treasure
     */
	Treasure() {
		super(SPRITE, Property.PENETRABLE_WITH_ACTION);
	}
	
	
	

}