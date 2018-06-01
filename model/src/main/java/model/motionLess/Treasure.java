package model.motionLess;

import model.HUD;
import model.Property;
import model.Sprite;
import model.mobile.Motion;

public class Treasure extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("D:\\Documents\\Exia\\Projets\\Projet 5 - Java\\Ressources fournis\\sprite\\purse.png", 'c');

    
    /**
     * Instanciate a new Treasure
     */
	Treasure() {
		super(SPRITE, Property.PENETRABLE_WITH_ACTION);
	}


	@Override
	public void action(Motion[] motion, MotionLess[][] motionLess) {
		HUD.addScore();
		int x = motion[0].getX();
		int y = motion[0].getY();
		motionLess[y][x] = new BasicGround();
	}
	
	
}
	
	
	
