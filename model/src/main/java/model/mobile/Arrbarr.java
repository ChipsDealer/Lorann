package model.mobile;

import model.Property;
import model.Sprite;
import model.motionLess.MotionLess;
/**
 * <h1>The Class Arrbarr is a enemies of the player.</h1>
 *
 * @author Pierre Baudot pierre.baudot@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_131
 */

public class Arrbarr extends Motion {


	/**
	 * The Constant sprite.
	 */
	private static final Sprite SPRITEMONSTER3 = new Sprite("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\monster_3.png", 'M');
	
	/**
	 * The constructor
	 * @param x, y
	 */
	public Arrbarr(int x,int y) {
		super(x, y, SPRITEMONSTER3, Property.DEMONS);
		this.setAlive(false);
	}
	
	/**
	 * This method allows the collision.
	 * 
	 * @param table motion and motionless
	 * @return boolean
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
			motion[3].die();
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

	/**
	 * This method allows the movement.
	 * @param motion and motionless table
	 */
	@Override
	public void move(Motion motion[], MotionLess motionLess[][]) {
		if (this.getLast_statement() == Last_statement.UP || this.getLast_statement() == Last_statement.NOP) {
				super.moveUp();
			if(collision(motion, motionLess) == true)
				{
					super.moveDown();
					super.moveRight();
						if(collision(motion, motionLess) == true)
							{
								super.moveLeft();
								super.moveDown();
									if(collision(motion, motionLess) == true)
										{
											super.moveUp();
											super.moveLeft();
										}
							}
				}
		}
		else if (this.getLast_statement() == Last_statement.RIGHT)
		{
			super.moveRight();
				if(collision(motion, motionLess) == true)
					{
						super.moveLeft();
						super.moveDown();
							if(collision(motion, motionLess) == true)
								{
									super.moveUp();
									super.moveLeft();
										if(collision(motion, motionLess) == true)
											{
												super.moveRight();
												super.moveUp();
											}
								}
					}
		}
		else if	(this.getLast_statement() == Last_statement.LEFT)	
		{
			super.moveLeft();
				if(collision(motion, motionLess) == true)
					{	
						super.moveRight();
						super.moveUp();
							if(collision(motion, motionLess) == true)
								{
									super.moveDown();
									super.moveRight();
										if(collision(motion, motionLess) == true)
											{
												super.moveLeft();
												super.moveDown();
											}
								}
					}
		}
		else if (this.getLast_statement() == Last_statement.DOWN)
		{
			super.moveDown();
				if(collision(motion, motionLess) == true)
					{	
						super.moveUp();
						super.moveLeft();
							if(collision(motion, motionLess) == true)
								{
									super.moveRight();
									super.moveUp();
										if(collision(motion, motionLess) == true)
											{
												super.moveDown();
												super.moveRight();
											}
								}
					}
		}
	}

	/**
	 * This methdo allows the movement.
	 * @param the tables motion and motionless
	 */
	@Override
	public void move(Motion[] motion, MotionLess[][] motionLess, String dir) {
		// TODO Auto-generated method stub
		
	}
	
	
}
