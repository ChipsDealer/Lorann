package model.mobile;
import java.util.Random;

import model.Property;
import model.Sprite;
import model.motionLess.MotionLess;
/**
 * <h1>The Class Maarcg is a enemies of the player</h1>
 *
 * @author Frost
 * @version 1.0
 */

public class Maarcg extends Motion {
	
	//** Constant SPRITE **/
	private static final Sprite SPRITEMONSTER4 = new Sprite("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\monster_4.png", 'N');
	
	public Maarcg(int x,int y) {
		super(x, y,SPRITEMONSTER4, Property.DEMONS);
		this.setAlive(false);
	}

	
	
	public boolean collision(Motion motion[], MotionLess motionLess[][]) {
		boolean bool = false;
		
		//Motionless verif
		switch (motionLess[this.getY()][this.getX()].getProperty())
		{	
			case BLOCKING_WITH_ACTION : 
				{
				 bool = true;
				}
			break;
			
			case  BLOCKING_WITHOUT_ACTION:
				{
				bool = true;
				}
			break;
			
			case PENETRABLE_WITH_ACTION :
			{
				bool = true;	// Treasure or energicbubble
			}
			break;
			
			default:
			{
				bool = false ;
			}
		}
		//Motion verif
		if (this.getX() == motion[0].getX() & this.getY() == motion[0].getY())
		{
			motion[0].die();
			bool = false;
		}
		else if (this.getX() == motion[5].getX() & this.getY() == motion[5].getY())
		{
			motion[4].die(); //Maarcg die
			bool = false;
		}
		return bool;		
	}
	 /*
     * (non-Javadoc)
     * @see model.mobile#die()
     */
	public void die() {
		super.die();
	}

	@Override
	public void move(Motion motion[], MotionLess motionLess[][]) {
		Random r = new Random();
		int minValue = 1;
		int maxValue = 5;
		int value = minValue + r.nextInt(maxValue - minValue);
		boolean bool = true;
		
		while (bool != false)
		{
			r = new Random();
			value = minValue + r.nextInt(maxValue - minValue);
			
			switch (value)
			{
			case 1:
				{
					super.moveRight();
					if (collision(motion, motionLess) == true)
					{
						super.moveLeft();
					}
					else
					{
						bool = false;
					}
				}
			break;
			
			case 2:
				{
					super.moveLeft();
					if (collision(motion, motionLess) == true)
					{
						super.moveRight();
					}
					else
					{
						bool = false;
					}
				}
			break;
			
			case 3:
			{
				super.moveDown();
				if (collision(motion, motionLess) == true)
				{
					super.moveUp();
				}
				else
				{
					bool = false;
				}
			}
			break;
			
			case 4:
			{
				super.moveUp();
				if (collision(motion, motionLess) == true)
				{
					super.moveDown();
				}
				else
				{
					bool = false;
				}
			}
			break;
			}
			
		}
	}



	@Override
	public void move(Motion[] motion, MotionLess[][] motionLess, String dir) {
		// TODO Auto-generated method stub
		
	}
}
