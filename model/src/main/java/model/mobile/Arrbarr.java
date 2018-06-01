package model.mobile;

import model.Property;
import model.Sprite;
import model.motionLess.MotionLess;
/**
 * <h1>The Class Arrbarr is a enemies of the player</h1>
 *
 * @author Frost
 * @version 1.0
 */

public class Arrbarr extends Motion {

	//* All the Constant**/
	private static final Sprite SPRITEMONSTER3 = new Sprite("monster_3.png", 'M');
	private int x;
	private int y;
	private Last_statement last_statement;
	@SuppressWarnings("unused")
	private boolean alive;
	
	public Arrbarr(int x,int y) {
		super(x, y, SPRITEMONSTER3, Property.DEMONS);
		this.alive = false;
	}
	
	public boolean collision(Motion motion[], MotionLess motionLess[][]) {
		boolean bool = false;
		
		//Motionless verif
		switch (motionLess[this.y][this.x].getProperty())
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
			default:
			{
				bool = false ;
			}
		}
		//Motion verif
		if (this.x == motion[0].getX() & this.y == motion[0].getY())
		{
			motion[0].die();
			bool = false;
		}
		else if (this.x == motion[5].getX() & this.y == motion[5].getY())
		{
			motion[3].die(); //Arrbarr die
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
		if (this.last_statement == Last_statement.UP || this.last_statement == Last_statement.NOP) {
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
		else if (this.last_statement == Last_statement.RIGHT)
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
		else if	(this.last_statement == Last_statement.LEFT)	
		{
			super.moveLeft();
				if(collision(motion, motionLess) == true)
					{	
						super.moveRight();
						super.moveUp();
							if(collision(motion, motionLess) == true)
								{
									super.moveDown();
									super.moveLeft();
										if(collision(motion, motionLess) == true)
											{
												super.moveRight();
												super.moveDown();
											}
								}
					}
		}
		else if (this.last_statement == Last_statement.DOWN)
		{
			super.moveDown();
				if(collision(motion, motionLess) == true)
					{	
						super.moveUp();
						super.moveRight();
							if(collision(motion, motionLess) == true)
								{
									super.moveLeft();
									super.moveUp();
										if(collision(motion, motionLess) == true)
											{
												super.moveDown();
												super.moveLeft();
											}
								}
					}
		}
	}
	
	
}
