package model.motionLess;

import model.Element;
import model.Property;
import model.Sprite;
import model.mobile.Motion;


/**
 * <h1>The abstract class MotionLess for all static elements.</h1>
 *
 * @author Léo thommes leo.thommes@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_131
 */

public abstract class MotionLess extends Element{
	
	/**
	 * Instantiates a new MotionLess element
	 * @param sprite
	 * 				the sprite
	 * @param property
	 * 				the property
	 */
	
	MotionLess(final Sprite sprite, final Property property) {
		super(sprite, property);
	}
	
	/**
	 * This method allows to specific action for all motion elements.
	 * 
	 * @param motion
	 * @param motionLess
	 */
	public void action(Motion[] motion, MotionLess[][] motionLess) {
		
	}
	
}
