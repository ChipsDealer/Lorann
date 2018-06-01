package model.motionLess;

import model.HUD;
import model.Property;
import model.Sprite;
import model.mobile.Motion;

public class EnergicBubble extends MotionLess{
	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("crystal_ball.png", '@');

    
    /**
     * Instanciate a new EnergicBubble
     */
	EnergicBubble() {
		super(SPRITE, Property.PENETRABLE_WITH_ACTION);
	}


	@Override
	public void action(Motion[] motion, MotionLess[][] motionLess) 
	{
		int x = motion[0].getX();
		int y = motion[0].getY();
		motionLess[y][x] = new BasicGround();
		for (int i = 0; i < HUD.getMapY(); i++)
		{
			for (int j = 0; j < HUD.getMapX(); j++)
			{
				if (motionLess[i][j].getSprite().getId() == '#') { //search for the BadDoor char
					motionLess[i][j] = new KindDoor();		
				}
			}
		}
		
	}
	
	

}
