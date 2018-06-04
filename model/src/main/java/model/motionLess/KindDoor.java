package model.motionLess;

import model.HUD;
import model.Property;
import model.Sprite;
import model.mobile.Motion;


/**
 * <h1>The Class KindDoor is a static element on the map.</h1>
 *
 * @author Léo thommes leo.thommes@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_131
 */

public class KindDoor extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\gate_open.png", '0');

    
    /**
     * Instanciate a new KindDoor
     */
	KindDoor() {
		super(SPRITE, Property.PENETRABLE_WITH_ACTION);	
	}

	/**
	 * This method allows to specific action for the kind door.
	 */
	@Override
	public void action(Motion[] motion, MotionLess[][] motionLess) 
	{
		HUD.setGameRunning(false);
	}
}