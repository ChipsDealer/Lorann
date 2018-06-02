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
	private static final Sprite SPRITEB = new Sprite("D:\\Documents\\Exia\\Projets\\Projet 5 - Java\\Ressources fournis\\sprite\\lorann_b.png", 'L');
	private static final Sprite SPRITEBL = new Sprite("D:\\Documents\\Exia\\Projets\\Projet 5 - Java\\Ressources fournis\\sprite\\lorann_bl.png", 'L');
	private static final Sprite SPRITEBR = new Sprite("D:\\Documents\\Exia\\Projets\\Projet 5 - Java\\Ressources fournis\\sprite\\lorann_br.png", 'L');
	private static final Sprite SPRITEL = new Sprite("D:\\Documents\\Exia\\Projets\\Projet 5 - Java\\Ressources fournis\\sprite\\lorann_l.png", 'L');
	private static final Sprite SPRITER = new Sprite("D:\\Documents\\Exia\\Projets\\Projet 5 - Java\\Ressources fournis\\sprite\\lorann_r.png", 'L');
	private static final Sprite SPRITEU = new Sprite("D:\\Documents\\Exia\\Projets\\Projet 5 - Java\\Ressources fournis\\sprite\\lorann_u.png", 'L');
	private static final Sprite SPRITEUL = new Sprite("D:\\Documents\\Exia\\Projets\\Projet 5 - Java\\Ressources fournis\\sprite\\lorann_ul.png", 'L');
	private static final Sprite SPRITEUR = new Sprite("D:\\Documents\\Exia\\Projets\\Projet 5 - Java\\Ressources fournis\\sprite\\lorann_ur.png", 'L');
	
	public Lorann(int x,int y) {
		super(x, y, SPRITEB, Property.LORANN); 
		this.setAlive(false);
	
	}
	public boolean collision(Motion motion[], MotionLess motionLess[][]) {
		boolean bool = false;
		
		//Motionless verif
		switch (motionLess[this.getY()][this.getX()].getProperty())
		{	
			case BLOCKING_WITH_ACTION: //BadDoor
				{
					this.die(); //Lorann die
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
				bool = false;	// Treasure or energicbubble
				motionLess[this.getY()][this.getX()].action(motion, motionLess); //get the action of the element
			}
			break;
			
			default:
			{
				bool = false ;
			}
		}
		//Motion verif
		if (this.getX() == motion[1].getX() & this.getY() == motion[1].getY())
		{
			this.die(); //Lorann die
			bool = false;
		}
		else if (this.getX() == motion[2].getX() & this.getY() == motion[2].getY())
		{
			this.die(); //Lorann die
			bool = false;
		}
		else if (this.getX() == motion[3].getX() & this.getY() == motion[3].getY())
		{
			this.die(); //Lorann die
			bool = false;
		}
		else if (this.getX() == motion[4].getX() & this.getY() == motion[4].getY())
		{
			this.die(); //Lorann die
			bool = false;
		}
		else if (this.getX() == motion[5].getX() & this.getY() == motion[5].getY())
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
	public void move(Motion motion[], MotionLess motionLess[][], String dir) 
	{
		this.lorannMove(motion, motionLess, dir);
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
				break;
				
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
	@Override
	public void move(Motion[] motion, MotionLess[][] motionLess) {
	}

	

}
