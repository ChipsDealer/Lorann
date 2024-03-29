package model.motionLess;

import model.Property;
import model.Sprite;


/**
 * <h1>The Class LateralBone is a static element on the map.</h1>
 *
 * @author L�o thommes leo.thommes@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_131
 */

public class LateralBone extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\horizontal_bone.png", '-');

    
    /**
     * The constructor.
     * Instanciate a new LateralBone
     */
	public LateralBone() {
		super(SPRITE, Property.BLOCKING_WITHOUT_ACTION);
	}

}