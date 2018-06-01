package model.mobile;

import model.Property;
import model.Sprite;
import model.motionLess.MotionLess;
/**
 * <h1>The Class Kyracj is a enemies of the player</h1>
 *
 * @author Frost
 * @version 1.0
 */

public class Kyracj extends Motion {
	
	//** Constant SPRITE **/
	private static final Sprite SPRITEMONSTER1 = new Sprite("monster_1.png", 'D');
	private int x;
	private int y;
	private Last_statement last_statement;
	@SuppressWarnings("unused")
	private boolean alive;
	
	public Kyracj(int x,int y) {
		super(x, y, SPRITEMONSTER1, Property.DEMONS);
		this.alive = false;
	}
	
	/*
     * (non-Javadoc)
     * @see model.mobile#move(ArrayList<?> map, ArrayList<?> mob)
     */
	
	// Pattern for Kyracj
	public void move(Motion motion[], MotionLess motionLess[][]) {
			if (this.last_statement == Last_statement.UP || this.last_statement == Last_statement.NOP) {
				super.moveUp();
				if(collision(motion, motionLess) == true)
				{
					super.moveDown();			
				}
			}
			else {
				super.moveDown();
				if(collision(motion, motionLess) == true)
				{
					super.moveUp();			
				}
			}
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
			motion[1].die(); //Kyracj die
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


}