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
	private static final Sprite SPRITEMONSTER2 = new Sprite("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\monster_2.png", 'E');
	
	public Cargyv(int x,int y) {
		super(x , y,SPRITEMONSTER2 , Property.DEMONS);
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

	@Override
	public void move(Motion[] motion, MotionLess[][] motionLess, String dir) {
		// TODO Auto-generated method stub
		
	}	
}
