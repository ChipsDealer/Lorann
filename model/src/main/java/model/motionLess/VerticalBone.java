package model.motionLess;

import model.Property;
import model.Sprite;

public class VerticalBone extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\vertical_bone.png", '|');

    
    /**
     * Instanciate a new VerticalBone
     */
	VerticalBone() {
		super(SPRITE, Property.BLOCKING_WITHOUT_ACTION);
	}

}