package model.motionLess;

import model.Property;
import model.Sprite;

public class VerticalBone extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("D:\\Documents\\Exia\\Projets\\Projet 5 - Java\\Ressources fournis\\sprite\\vertical_bone.png", '|');

    
    /**
     * Instanciate a new VerticalBone
     */
	VerticalBone() {
		super(SPRITE, Property.BLOCKING_WITHOUT_ACTION);
	}

}