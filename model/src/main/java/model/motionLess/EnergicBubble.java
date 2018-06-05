package model.motionLess;

import model.HUD;
import model.Property;
import model.Sprite;
import model.mobile.Motion;


/**
 * <h1>The Class EnergicBubble is a static element on the map.</h1>
 *
 * @author Léo thommes leo.thommes@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_131
 */

public class EnergicBubble extends MotionLess{

	
	/** The Constant SPRITE. */
    private static final Sprite SPRITE = new Sprite("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\crystal_ball.png", '@');

    
    /**
     * Instanciate a new EnergicBubble
     */
	EnergicBubble() {
		super(SPRITE, Property.PENETRABLE_WITH_ACTION);
	}


	/**
	 * This method allows the specific action to energicbubble.
	 * 
	 * @param motion
	 * @param motionLess
	 */
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
