package model.mobile;

import model.Property;
import model.Sprite;
import model.motionLess.MotionLess;
/**
 * <h1>The Class Lorann is for the player.</h1>
 *
 * @author Pierre Baudot pierre.baudot@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_131
 */

public class Lorann extends Motion{
		
	/** All the constant SPRITE **/
	private static final Sprite SPRITEB = new Sprite("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\lorann_b.png", 'L');
	private static final Sprite SPRITEBL = new Sprite("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\lorann_bl.png", 'L');
	private static final Sprite SPRITEBR = new Sprite("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\lorann_br.png", 'L');
	private static final Sprite SPRITEL = new Sprite("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\lorann_l.png", 'L');
	private static final Sprite SPRITER = new Sprite("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\lorann_r.png", 'L');
	private static final Sprite SPRITEU = new Sprite("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\lorann_u.png", 'L');
	private static final Sprite SPRITEUL = new Sprite("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\lorann_ul.png", 'L');
	private static final Sprite SPRITEUR = new Sprite("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\lorann_ur.png", 'L');
	
	/**
	 * The constructor.
	 * @param int x, int y
	 */
	public Lorann(int x,int y) {
		super(x, y, SPRITEB, Property.LORANN); 
		this.setAlive(false);
	
	}
	/**
	 * This method allows the collisiosn for Lorann.
	 * @param the tables motion and motionless.
	 * @return a boolean.
	 */
	public boolean collision(Motion motion[], MotionLess motionLess[][]) {
		boolean bool = false;
		
		if (this.getX() >= 0 & this.getY() >= 0)
		{
			switch (motionLess[this.getY()][this.getX()].getProperty())
			{	
				case BLOCKING_WITH_ACTION:
					{
						this.die();
						bool = false;
					}
				break;
				
				case BLOCKING_WITHOUT_ACTION:
					{
					bool = true;
					}
				break;
				
				case PENETRABLE_WITH_ACTION:
				{
					bool = false;
					motionLess[this.getY()][this.getX()].action(motion, motionLess);
				}
				break;
				
				default:
				{
					bool = false ;
				}
			}
		}
		
		if (this.getX() == motion[1].getX() & this.getY() == motion[1].getY())
		{
			this.die();
			bool = false;
		}
		else if (this.getX() == motion[2].getX() & this.getY() == motion[2].getY())
		{
			this.die();
			bool = false;
		}
		else if (this.getX() == motion[3].getX() & this.getY() == motion[3].getY())
		{
			this.die();
			bool = false;
		}
		else if (this.getX() == motion[4].getX() & this.getY() == motion[4].getY())
		{
			this.die();
			bool = false;
		}
		//Colision with Lorann : WIP this feature don't work properly
		else if (this.getX() == motion[5].getX() & this.getY() == motion[5].getY())
		{
			motion[5].die();
			bool = false;
		}
		return bool;		
	}
	
	/**
     * (non-Javadoc)
     * @see model.mobile#move(ArrayList<?> map, ArrayList<?> mob)
     * @param the tables motion and motionless.
     */
	@Override
	public void move(Motion motion[], MotionLess motionLess[][], String dir) 
	{
		this.lorannMove(motion, motionLess, dir);
	}
	
	/**
	 * This method allows for Lorann's movements.
	 * @param the tables motion and motionless.
	 */
	public void lorannMove(Motion motion[], MotionLess motionLess[][], String dir) 
	{
		switch (dir)
			{
				case "Up" :
				{
					moveUp();
					if(collision(motion, motionLess) == true)
						{
						moveDown();					
						}
				}
				break;
		
				case "UpLeft":
				{
					moveUpLeft();
					if(collision(motion, motionLess) == true)
						{
						moveDownRight();						
						}
				}
				break;
		
				case "UpRight":
				{	
					moveUpRight();
					if(collision(motion, motionLess) == true)
						{
						moveDownLeft();						
						}
				}
				break;
		
				case "Down" :
				{
					moveDown();
					if(collision(motion, motionLess) == true)
						{
						moveUp();						
						}
				}
				break;
		
				case "DownLeft" :
				{
					moveDownLeft();
					if(collision(motion, motionLess) == true)
						{
						moveUpRight();						
						}
				}
				break;
				
				case"DownRight":
				{
					moveDownRight();
					if(collision(motion, motionLess) == true)
						{
						moveUpLeft();						
						}
				}
				break;
				
				case "Left" :
				{
					moveLeft();
					if(collision(motion, motionLess) == true)
						{
						moveRight();						
						}
				}
				break;
				
				case "Right" : 
				{
					moveRight();
					if(collision(motion, motionLess) == true)
						{
						moveLeft();						
						}
				}
				break;
				
				default :
				{
					doNothing();
				}
			
			}	
	}
	
	/**
	 * All the methods for movements.
	 */
	public void moveLeft() {
		super.moveLeft();
		this.setSprite(SPRITEL);
	}
	
	public void moveRight() {
		super.moveRight();
		this.setSprite(SPRITER);
	}
	
	public void moveUp() {
		super.moveUp();
		this.setSprite(SPRITEU);
	}
	
	public void moveUpRight() {
		super.moveUpRight();
		this.setSprite(SPRITEUR);
	}
	
	public void moveUpLeft() {
		super.moveUpLeft();
		this.setSprite(SPRITEUL);
	}
	
	public void moveDown() {
		super.moveDown();
		this.setSprite(SPRITEB);
	}
	
	public void moveDownLeft() {
		super.moveDownLeft();
		this.setSprite(SPRITEBL);
	}
	
	public void moveDownRight() {
		super.moveDownRight();
		this.setSprite(SPRITEBR);
	}
	
	public void doNothing() {
		super.doNothing();
	}
	
	 /**
     * (non-Javadoc)
     * @see model.mobile#die()
     */
	public void die() {
		super.die();
	}
	
	/**
	 * This method allows for movements of motion elements.
	 * @param the motion and motionless tables.
	 */
	@Override
	public void move(Motion[] motion, MotionLess[][] motionLess) {
	}

	

}
