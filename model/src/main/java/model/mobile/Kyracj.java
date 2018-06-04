package model.mobile;

import model.Property;
import model.Sprite;
import model.motionLess.MotionLess;
/**
 * <h1>The Class Kyracj is a enemies of the player.</h1>
 *
 * @author Pierre Baudot pierre.baudot@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_131
 */

public class Kyracj extends Motion {
	
	/**
	 * The Constant Sprite.
	 */
	private static final Sprite SPRITEMONSTER1 = new Sprite("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\monster_1.png", 'D');
	
	/**
	 * The Constructor.
	 */
	public Kyracj(int x,int y) {
		super(x, y, SPRITEMONSTER1, Property.DEMONS);
		this.setAlive(false);
	}
	
	/*
     * (non-Javadoc)
     * @see model.mobile#move(ArrayList<?> map, ArrayList<?> mob)
     */
	

	/**
	 * This method allows movement pattern for Kyracj.
	 * @param tables motion and motionless
	 */
	public void move(Motion motion[], MotionLess motionLess[][]) {
			if (this.getLast_statement() == Last_statement.UP || this.getLast_statement() == Last_statement.NOP) {
				super.moveUp();
				if(collision(motion, motionLess) == true)
				{
					super.moveDown();
					super.moveDown();
				}
			}
			else {
				super.moveDown();
				if(collision(motion, motionLess) == true)
				{
					super.moveUp();	
					super.moveUp();
				}
			}
		}
	
	/**
	 * This method allows collisions.
	 * @param tables motion and motionless.
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
			motion[0].die();
			bool = false;
		}
		else if (this.getX() == motion[5].getX() & this.getY() == motion[5].getY())
		{
			System.out.println(this.getX() + " et " + motion[5].getX());
			motion[1].die();
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
	 * @param tables motion and motionless.
	 */
	@Override
	public void move(Motion[] motion, MotionLess[][] motionLess, String dir) {
		
	}


}