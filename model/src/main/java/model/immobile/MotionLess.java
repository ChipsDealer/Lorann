package model.immobile;

import model.Element;
import model.Property;
import model.Sprite;

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
	
	/** Declaration of Action Method
	 * Depending of object using it
	 * Use in every MotionLess element who need specific task
	 * 
	 * @return void
	 */
	public void Action() {
		
	}
	

}
