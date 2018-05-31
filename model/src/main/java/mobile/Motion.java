package mobile;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * <h1>The Class Motion is a generic class for every motion Element</h1>
 *
 * @author Frost
 * @version 1.0
 */
public abstract class Motion {
	
	/** position of the motion element in x**/
	private int x;
	/** position of the motion element in y**/
	private int y;
	/** statement of motion element : dead or alive**/
	private boolean alive;
	//** Last_movement of the motion element **/
	private Last_statement last_statement;
	
	
	public Motion(int x, int y, Sprite sprite, Property property) {
		
	
	}
	 /**
     * delete a motion element
     * @return nothing
     */
	public void die() {
		
	}
	 /**
     * move the element 
     *
     * @param map 
     *            map with motion element
     * @param mob
     * 			  map with motion less element      
     * @return nothing
       */
	public abstract void move(ArrayList<?> map, ArrayList<?> mob);

	 /**
     * move the element to the Up
     *
     * @param map 
     *            map with motion element
     * @param mob
     * 			  map with motion less element      
     * @return boolean
       */
	public boolean moveUp(ArrayList<?> map, ArrayList<?> mob) {
		return true;
	}
	
	 /**
     * move the element to the Up and the Right (diagonal)
     *
     * @param map 
     *            map with motion element
     * @param mob
     * 			  map with motion less element      
     * @return boolean
       */
	public boolean moveUpRight(ArrayList<?> map, ArrayList<?> mob) {
		return true;
	}
	
	 /**
     * move the element to the Up and the Left
     *
     * @param map 
     *            map with motion element
     * @param mob
     * 			  map with motion less element      
     * @return boolean
       */
	public boolean moveUpLeft(ArrayList<?> map, ArrayList<?> mob) {
		return true;
	}
	
	 /**
     * move the element the Down
     *
     * @param map 
     *            map with motion element
     * @param mob
     * 			  map with motion less element      
     * @return boolean
       */
	public boolean moveDown(ArrayList<?> map, ArrayList<?> mob) {
		return true;
	}
	
	 /**
     * move the element to the Down and the Right
     *
     * @param map 
     *            map with motion element
     * @param mob
     * 			  map with motion less element      
     * @return boolean
       */
	public boolean moveDownRight(ArrayList<?> map, ArrayList<?> mob) {
		return true;
	}
	
	 /**
     * move the element to the Down and the Left
     *
     * @param map 
     *            map with motion element
     * @param mob
     * 			  map with motion less element      
     * @return boolean
       */
	public boolean moveDownLeft(ArrayList<?> map, ArrayList<?> mob) {
		return true;
	}
	
	 /**
     * move the element to Left 
     *
     * @param map 
     *            map with motion element
     * @param mob
     * 			  map with motion less element      
     * @return boolean
       */
	public boolean moveLeft(ArrayList<?> map, ArrayList<?> mob) {
		return true;
	}
	 /**
     * move the element to the right
     *
     * @param map 
     *            map with motion element
     * @param mob
     * 			  map with motion less element      
     * @return boolean
       */
	public boolean moveRight(ArrayList<?> map, ArrayList<?> mob) {
		return true;
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
	
	public Last_statement getLast_statement() {
		return last_statement;
	}
	
	public void setLast_statement(Last_statement last_statement) {
		this.last_statement = last_statement;
	}
}

