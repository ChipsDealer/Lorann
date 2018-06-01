package model.mobile;


import model.*;
import model.motionLess.MotionLess;

/**
 * <h1>The Class Spell is a spell that the player can use to kill his enemies</h1>
 *
 * @author Frost
 * @version 1.0
 */

public class Spell extends Motion {

	private static final Sprite SPRITESPELL = new Sprite("SPELLGREEN.png", '°'); // Change sprite
	private int x;
	private int y;
	private Last_statement last_statement;
	@SuppressWarnings("unused")
	private boolean alive;
	
	
	public Spell(int x,int y) {
		super(x, y,SPRITESPELL, Property.SPELL);
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
		if (this.x == motion[1].getX() & this.y == motion[1].getY())
		{
			motion[1].die(); //Demon die
			bool = false;
		}
		else if (this.x == motion[2].getX() & this.y == motion[2].getY())
		{
			motion[2].die(); //Kyracj die
			bool = false;
		}
		else if (this.x == motion[3].getX() & this.y == motion[3].getY())
		{
			motion[3].die(); //Kyracj die
			bool = false;
		}
		else if (this.x == motion[4].getX() & this.y == motion[4].getY())
		{
			motion[4].die(); //Kyracj die
			bool = false;
		}
		else if (this.x == motion[0].getX() & this.y == motion[0].getY())
		{
			this.die(); //Spell die
			bool = false;
		}
		return bool;		
	}
	
	public void die() {
		
	}

	@Override
	public void move(Motion motion[], MotionLess motionLess[][]) {
		if (this.last_statement == Last_statement.UP) {
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
		
		if (this.last_statement == Last_statement.DOWN) {
			super.moveDown();
			if(collision(motion, motionLess) == true)
			{
				super.moveUp();			
			}
		}
		else {
			super.moveUp();
			if(collision(motion, motionLess) == true)
			{
				super.moveDown();			
			}
		}
		if (this.last_statement == Last_statement.RIGHT) {
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
		
		if (this.last_statement == Last_statement.LEFT) {
			super.moveLeft();
			if(collision(motion, motionLess) == true)
			{
				super.moveRight();			
			}
		}
		else {
			super.moveRight();
			if(collision(motion, motionLess) == true)
			{
				super.moveLeft();			
			}
		}
		
		
		
	}
}
