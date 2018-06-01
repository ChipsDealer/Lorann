package model.motionLess;

import model.HUD;
import model.Property;
import model.Sprite;
import model.mobile.Motion;

public class KindDoor extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("D:\\Documents\\Exia\\Projets\\Projet 5 - Java\\Ressources fournis\\sprite\\gate_open.png", 'O');

    
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