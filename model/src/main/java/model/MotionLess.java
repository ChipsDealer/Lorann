package model;

import model.Element;
import model.Property;
import model.Sprite;
import model.mobile.Motion;

/**
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
	 * 
	 * @author Nathan Beer nathan.beer@viacesi.fr, Léo Thommes leo.thommes@cesi.fr, Frost
	 * @version 1.0
	 * @return
	 */
	
	MotionLess(final Sprite sprite, final Property property) {
		super(sprite, property);
	}
	
	/**
	 * The action of the MotionLess element
	 * @param motion, motionLess
	 */
	public void action(Motion[] motion, MotionLess[][] motionLess) {
		
	}
	
}
