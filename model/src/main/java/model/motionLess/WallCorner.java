package model.motionLess;

import model.Property;
import model.Sprite;

public class WallCorner extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("D:\\Documents\\Exia\\Projets\\Projet 5 - Java\\Ressources fournis\\sprite\\bone.png", 'X');

    
    /**
     * Instanciate a new WallCorner
     */
	WallCorner() {
		super(SPRITE, Property.BLOCKING_WITHOUT_ACTION);
	}

}