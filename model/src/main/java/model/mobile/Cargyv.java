package model.mobile;

import model.Property;
import model.Sprite;
import model.motionLess.MotionLess;
/**
 * <h1>The Class Cargyv is a enemies of the player</h1>
 *
 * @author Frost
 * @version 1.0
 */


public class Cargyv extends Motion {

	//* All the Constant**/
	private static final Sprite SPRITEMONSTER2 = new Sprite("monster_2.png", 'E');
	private int x;
	private int y;
	private Last_statement last_statement;
	@SuppressWarnings("unused")
	private boolean alive;
	
	public Cargyv(int x,int y) {
		super(x , y,SPRITEMONSTER2 , Property.DEMONS);
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
			motion[2].die(); //Cargyv die
			bool = false;
		}
		return bool;		
	}
	 /*
     * (non-Javadoc)
     * @see model.mobile#move(ArrayList<?> map, ArrayList<?> mob)
     */

	
	 /*
     * (non-Javadoc)
     * @see model.mobile#die()
     */
	public void die() {
		super.die();
	}

	@Override
	//patern for Cargyv
	public void move(Motion motion[], MotionLess motionLess[][]) {
		if (this.last_statement == Last_statement.RIGHT || this.last_statement == Last_statement.NOP) {
			super.moveRight();
			if(collision(motion, motionLess) == true)
			{
				super.moveLeft();			
			}
		}
		else {
			super.moveLeft();
			if(collision(motion, motionLess) == true)
			{
				super.moveRight();			
			}
		}
	}	
}
