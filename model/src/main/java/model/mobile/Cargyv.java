package model.mobile;

import model.Property;
import model.Sprite;
import model.motionLess.MotionLess;
/**
 * <h1>The Class Cargyv is a enemies of the player.</h1>
 *
 * @author Pierre Baudot pierre.baudot@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_131
 */

public class Cargyv extends Motion {

	/**
	 * The Constant.
	 */
	private static final Sprite SPRITEMONSTER2 = new Sprite("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\monster_2.png", 'E');
	
	/**
	 * The constructor.
	 * 
	 * @param x
	 * @param y
	 */
	public Cargyv(int x,int y) {
		super(x , y,SPRITEMONSTER2 , Property.DEMONS);
		this.setAlive(false);
	}
	
	/**
	 * This method allows the collisions.
	 * 
	 * @param motion
	 * @param motionLess
	 * @return bool
	 * 			A boolean : true if there is a colision; false if there is no colision
	 */
	public boolean collision(Motion motion[], MotionLess motionLess[][]) {
		boolean bool = false;
		
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
				bool = true;
			}
			break;
			
			default:
			{
				bool = false ;
			}
		}
		if (this.getX() == motion[0].getX() & this.getY() == motion[0].getY())
		{
			motion[5].die();
			motion[0].die();
			bool = false;
		}
		else if (this.getX() == motion[5].getX() & this.getY() == motion[5].getY())
		{
			motion[2].die();
			bool = false;
		}
		return bool;		
	}

	 /**
	  * It used when this element die
	  */
	public void die() {
		super.die();
	}

	/**
	 * This method allows the movements.
	 * 
	 * @param motion
	 * @param motionLess
	 */
	@Override
	public void move(Motion motion[], MotionLess motionLess[][]) {
		if (this.getLast_statement() == Last_statement.RIGHT || this.getLast_statement() == Last_statement.NOP) {
			super.moveRight();
			if(collision(motion, motionLess) == true)
			{
				super.moveLeft();		
				super.moveLeft();
			}
		}
		else {
			super.moveLeft();
			if(collision(motion, motionLess) == true)
			{
				super.moveRight();
				super.moveRight();
			}
		}
	}

	/**
	 * This method allows the movements.
	 * 
	 * @param motion
	 * @param motionLess
	 * @param dir
	 */
	@Override
	public void move(Motion[] motion, MotionLess[][] motionLess, String dir) {
		
	}	
}
