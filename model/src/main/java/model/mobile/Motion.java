package model.mobile;

import model.*;
import model.motionLess.MotionLess;

/**
 * <h1>The Class Motion allows the movements for all motion elements.</h1>
 *
 * @author Pierre Baudot pierre.baudot@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_131
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
	
	/**
	 * The Constructor.
	 * 
	 * @param x
	 * @param y
	 * @param sprite
	 * @param property
	 */
	public Motion(final int x, final int y, final Sprite sprite, final Property property) {
		super(sprite, property);
		this.setX(x);
		this.setY(y);
		this.setSprite(sprite);
		this.setProperty(property);
		this.setLast_statement(Last_statement.NOP);
	
	}
	 /**
     * Delete this motion element
     */
	public void die() {
		this.alive = false;
		this.setX(0);
		this.setY(0);
	}
	 /**
     * This abstract method allow to move the element.
     * 
     * @param motion
     * @param motionLess
     */
	public abstract void move(Motion motion[], MotionLess motionLess[][]);
	

	/**
	 * This method allows to move the motion elements.
	 * 
	 * @param motion
	 * @param motionLess
	 * @param dir
	 */
	public abstract void move(Motion motion[], MotionLess motionLess[][], String dir);
	

	/**
	 * This method allows to move Up.
	 */
	public void moveUp() {
		this.setY(this.getY() -1);
		this.setLast_statement(Last_statement.UP);
	}
	
	 /**
     * Move the element to the Up and the Right (diagonal).
     * 
     */
	public void moveUpRight() {
		this.setY(this.getY() -1);
		this.setX(this.getX() +1);
		this.setLast_statement(Last_statement.UPRIGHT);
	}
	
	 /**
     * Move the element to the Up and the Left.
     *    
     */
	public void moveUpLeft() {
		this.setY(this.getY() -1);
		this.setX(this.getX() -1);
		this.setLast_statement(Last_statement.UPLEFT);
	}
	

	/**
	 * This method allows to move down.
	 */
	public void moveDown() {
		this.setY(this.getY() +1);
		this.setLast_statement(Last_statement.DOWN);
	}
	

	/**
	 * This method allows to move down and right.
	 */
	public void moveDownRight() {
		this.setY(this.getY() +1);
		this.setX(this.getX() +1);
		this.setLast_statement(Last_statement.DOWNRIGHT);
	}

	/**
	 * This method allows to move down and left.
	 */
	public void moveDownLeft() {
		this.setY(this.getY() +1);
		this.setX(this.getX() -1);
		this.setLast_statement(Last_statement.DOWNLEFT);
	}
	
	/**
	 * This method allows to move left.
	 */
	public void moveLeft() {
		this.setX(this.getX() -1);
		this.setLast_statement(Last_statement.LEFT);
	}

	/**
	 * This method allows to move right.
	 */
	public void moveRight() {
		this.setX(this.getX() +1);
		this.setLast_statement(Last_statement.RIGHT);
	}
	
	/**
	 * This method do nothing.
	 */
	public void doNothing() {
	}
	
	/**
	 * Getter of x
	 * 
	 * @return x
	 */
	public int getX() {
		return x;
	}
	/**
	 * Setter of X
	 * 
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * Getter of y
	 * 
	 * @return y
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Setter of y
	 * 
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Getter of alive
	 * 
	 * @return alive
	 */
	public boolean isAlive() {
		return alive;
	}
	
	/**
	 * Setter of alive
	 * 
	 * @param alive
	 */
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	/**
	 * It used to respawn Lorann and to reload the maps
	 */
	public void respawn() {
		this.alive = true;
	}
	
	/**
	 * Getter of last_statement
	 * 
	 * @return last_statement
	 */
	public Last_statement getLast_statement() {
		return last_statement;
	}
	
	/**
	 * Setter of last_statement
	 * 
	 * @param last_statement
	 */
	public void setLast_statement(Last_statement last_statement) {
		this.last_statement = last_statement;
	}
}
