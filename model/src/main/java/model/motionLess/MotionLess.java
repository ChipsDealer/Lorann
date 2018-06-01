package model.motionLess;

import model.Element;
import model.Property;
import model.Sprite;
import model.mobile.Motion;

public abstract class MotionLess extends Element{
	
	/**
	 * Instantiates a new MotionLess element
	 * @param sprite
	 * 				the sprite
	 * @param property
	 * 				the property
	 * 
	 * @author Léo Thommes
	 * @return
	 */
	
	MotionLess(final Sprite sprite, final Property property) {
		super(sprite, property);
	}
	
	public void action(Motion[] motion, MotionLess[][] motionLess) {
		
	}
	
}
