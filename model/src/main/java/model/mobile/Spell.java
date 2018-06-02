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

	private static final Sprite SPRITESPELL = new Sprite("D:\\Documents\\Exia\\Projets\\Projet 5 - Java\\Ressources fournis\\sprite\\fireball_1.png", 'O'); // Change sprite
	
	
	public Spell(int x,int y) {
		super(x, y,SPRITESPELL, Property.SPELL);
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
		if (this.getX() == motion[1].getX() & this.getY() == motion[1].getY())
		{
			motion[1].die(); //Demon die
			bool = false;
		}
		else if (this.getX() == motion[2].getX() & this.getY() == motion[2].getY())
		{
			motion[2].die(); //Kyracj die
			bool = false;
		}
		else if (this.getX() == motion[3].getX() & this.getY() == motion[3].getY())
		{
			motion[3].die(); //Kyracj die
			bool = false;
		}
		else if (this.getX() == motion[4].getX() & this.getY() == motion[4].getY())
		{
			motion[4].die(); //Kyracj die
			bool = false;
		}
		else if (this.getX() == motion[0].getX() & this.getY() == motion[0].getY())
		{
			this.die(); //Spell die
			bool = false;
		}
		return bool;		
	}
	
	public void die() {
		super.die();
	}

	@Override
	public void move(Motion motion[], MotionLess motionLess[][]) 
	{
		if (this.getLast_statement() == Last_statement.UP) 
		{
			super.moveUp();
			if(collision(motion, motionLess) == true)
			{
				super.moveDown();
				super.moveDown();
			}
		}
		
		else if (this.getLast_statement() == Last_statement.DOWN) 
		{
			super.moveDown();
			if(collision(motion, motionLess) == true)
			{
				super.moveUp();
				super.moveUp();
			}
		}

		else if (this.getLast_statement() == Last_statement.RIGHT) 
		{
			super.moveRight();
			if(collision(motion, motionLess) == true)
			{
				super.moveLeft();
				super.moveLeft();
			}
		}
		
		else if (this.getLast_statement() == Last_statement.LEFT ) 
		{
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
