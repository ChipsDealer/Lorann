package model.mobile;

import model.Property;
import model.Sprite;
import model.motionLess.MotionLess;
/**
 * <h1>The Class Lorann is a enemies of the player</h1>
 *
 * @author Frost
 * @version 1.0
 */

public class Lorann extends Motion{
		
	/** All the constant SPRITE **/
	private static final Sprite SPRITEB = new Sprite("lorann_b.png", 'L');
	private static final Sprite SPRITEBL = new Sprite("lorann_bl.png", 'L');
	private static final Sprite SPRITEBR = new Sprite("lorann_br.png", 'L');
	private static final Sprite SPRITEL = new Sprite("lorann_l.png", 'L');
	private static final Sprite SPRITER = new Sprite("lorann_r.png", 'L');
	private static final Sprite SPRITEU = new Sprite("lorann_u.png", 'L');
	private static final Sprite SPRITEUL = new Sprite("lorann_ul.png", 'L');
	private static final Sprite SPRITEUR = new Sprite("lorann_ur.png", 'L');
	private int x;
	private int y;
	@SuppressWarnings("unused")
	private Last_statement last_statement;
	@SuppressWarnings("unused")
	private boolean alive;
	
	public Lorann(int x,int y) {
		super(x, y, SPRITEB, Property.LORANN); 
		this.alive = false;
	
	}
	public boolean collision(Motion motion[], MotionLess motionLess[][]) {
		boolean bool = false;
		
		//Motionless verif
		switch (motionLess[this.y][this.x].getProperty())
		{	
			case BLOCKING_WITH_ACTION : //BadDoor
				{
					this.die(); //Lorann die
					bool = false;
				}
			break;
			
			case  BLOCKING_WITHOUT_ACTION:
				{
				bool = true;
				}
			break;
			
			case PENETRABLE_WITH_ACTION :
			{
				bool = false;	// Treasure or energicbubble
				motionLess[this.y][this.x].action(); //get the action of the element
			}
			default:
			{
				bool = false ;
			}
		}
		//Motion verif
		if (this.x == motion[1].getX() & this.y == motion[1].getY())
		{
			this.die(); //Lorann die
			bool = false;
		}
		else if (this.x == motion[2].getX() & this.y == motion[2].getY())
		{
			this.die(); //Lorann die
			bool = false;
		}
		else if (this.x == motion[3].getX() & this.y == motion[3].getY())
		{
			this.die(); //Lorann die
			bool = false;
		}
		else if (this.x == motion[4].getX() & this.y == motion[4].getY())
		{
			this.die(); //Lorann die
			bool = false;
		}
		else if (this.x == motion[0].getX() & this.y == motion[0].getY())
		{
			motion[5].die(); //Spell die
			bool = false;
		}
		return bool;		
	}
	
	/*
     * (non-Javadoc)
     * @see model.mobile#move(ArrayList<?> map, ArrayList<?> mob)
     */
	@Override
	public void move(Motion motion[], MotionLess motionLess[][]) {
	}
	
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
				default :
				{
					doNothing();
				}
			
			}	
	}
	
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
		//this.setSprite(SPRITEL);
	}
	
	 /*
     * (non-Javadoc)
     * @see model.mobile#die()
     */
	public void die() {
		super.die();
	}

	

}
