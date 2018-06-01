package model.motionLess;

import model.Property;
import model.Sprite;

public class LateralBone extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("D:\\Documents\\Exia\\Projets\\Projet 5 - Java\\Ressources fournis\\sprite\\horizontal_bone.png", '-');

    
    /**
     * Instanciate a new LateralBone
     */
	LateralBone() {
		super(SPRITE, Property.BLOCKING_WITHOUT_ACTION);
	}

}