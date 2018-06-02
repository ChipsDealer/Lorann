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
	private static final Sprite SPRITEMONSTER3 = new Sprite("D:\\Documents\\Exia\\Projets\\Projet 5 - Java\\Ressources fournis\\sprite\\monster_3.png", 'M');
	
	public Arrbarr(int x,int y) {
		super(x, y, SPRITEMONSTER3, Property.DEMONS);
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

	@Override
	public void move(Motion[] motion, MotionLess[][] motionLess, String dir) {
		// TODO Auto-generated method stub
		
	}
	
	
}
