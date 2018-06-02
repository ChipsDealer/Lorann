package model.mobile;

import model.*;
import model.motionLess.MotionLess;

/**
 * <h1>The Class Motion is a generic class for every motion Element</h1>
 *
 * @author Frost
 * @version 1.0
 */
public abstract class Motion extends Element {
	
	/** position of the motion element in x**/
	private int x;
	/** position of the motion element in y**/
	private int y;
	/** statement of motion element : dead or alive**/
	private boolean alive;
	//** Last_movement of the motion element **/
	private Last_statement last_statement;
	
	
	public Motion(final int x, final int y, final Sprite sprite, final Property property) {
		super(sprite, property);
		this.setX(x);
		this.setY(y);
		this.setSprite(sprite);
		this.setProperty(property);
		this.setLast_statement(Last_statement.NOP);
	
	}
	 /**
     * delete a motion element
     * 
     * @return nothing
     */
	public void die() {
		this.alive = false;
		this.setX(-1);
		this.setY(-1);
	}
	 /**
     * move the element 
     *    
     * @return nothing
       */
	public abstract void move(Motion motion[], MotionLess motionLess[][]);
	
	/**
     * move the element Lorann
     *    
     * @return nothing
       */
	public abstract void move(Motion motion[], MotionLess motionLess[][], String dir);
	
	 /**
     * move the element to the Up
     *
     *@return nothing
       */
	public void moveUp() {
		this.setY(this.getY() -1);
		this.setLast_statement(Last_statement.UP);
	}
	
	 /**
     * move the element to the Up and the Right (diagonal)
     *     
     * @return nothing
       */
	public void moveUpRight() {
		this.setY(this.getY() -1);
		this.setX(this.getX() +1);
		this.setLast_statement(Last_statement.UPRIGHT);
	}
	
	 /**
     * move the element to the Up and the Left
     *    
     * @return nothing
       */
	public void moveUpLeft() {
		this.setY(this.getY() -1);
		this.setX(this.getX() -1);
		this.setLast_statement(Last_statement.UPLEFT);
	}
	
	 /**
     * move the element the Down
     *
     * @return nothing
       */
	public void moveDown() {
		this.setY(this.getY() +1);
		this.setLast_statement(Last_statement.DOWN);
	}
	
	 /**
     * move the element to the Down and the Right
     *  
     * @return nothing
       */
	public void moveDownRight() {
		this.setY(this.getY() +1);
		this.setX(this.getX() +1);
		this.setLast_statement(Last_statement.DOWNRIGHT);
	}
	
	 /**
     * move the element to the Down and the Left
     *  
     * @return nothing
       */
	public void moveDownLeft() {
		this.setY(this.getY() +1);
		this.setX(this.getX() -1);
		this.setLast_statement(Last_statement.DOWNLEFT);
	}
	
	 /**
     * move the element to Left 
     *  
     * @return nothing
       */
	public void moveLeft() {
		this.setX(this.getX() -1);
		this.setLast_statement(Last_statement.LEFT);
	}
	 /**
     * move the element to the right
     *    
     * @return nothing
       */
	public void moveRight() {
		this.setX(this.getX() +1);
		this.setLast_statement(Last_statement.RIGHT);
	}
	
	public void doNothing() {
		this.setLast_statement(Last_statement.NOP);
	}
	
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public boolean isAlive() {
		return alive;
	}
	
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	public void respawn() {
		this.alive = true;
	}
	
	public Last_statement getLast_statement() {
		return last_statement;
	}
	
	public void setLast_statement(Last_statement last_statement) {
		this.last_statement = last_statement;
	}
}
