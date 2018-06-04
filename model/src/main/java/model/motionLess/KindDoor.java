package model.motionLess;

import model.HUD;
import model.Property;
import model.Sprite;
import model.mobile.Motion;

public class KindDoor extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\gate_open.png", '0');

    
    /**
     * Instanciate a new KindDoor
     */
	KindDoor() {
		super(SPRITE, Property.PENETRABLE_WITH_ACTION);	
	}

	@Override
	public void action(Motion[] motion, MotionLess[][] motionLess) 
	{
		HUD.setGameRunning(false);
	}
}