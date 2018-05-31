package mobile;

import java.util.ArrayList;
/**
 * <h1>The Class Kyracj is a enemies of the player</h1>
 *
 * @author Frost
 * @version 1.0
 */

public class Kyracj extends Motion {
	
	//** Constant SPRITE **/
	private static final Sprite SPRITEMONSTER1 = new Sprite("monster_1.png", "D");
	private int x;
	private int y;
	private Last_statement last_statement;
	
	public Kyracj() {
		super(final int x, final int y, final Sprite SPRITEMONSTER1, Property.BLOCKING_WITH_ACTION); 
		SPRITEMONSTER1.loadImage();
	}
	
	/*
     * (non-Javadoc)
     * @see model.mobile#move(ArrayList<?> map, ArrayList<?> mob)
     */
	
	public void move() {
			if (this.last_statement == UP) {
				super.moveUp();
			}
			else {
				super.moveDown();
			}
		}
	}
	
	 /*
     * (non-Javadoc)
     * @see model.mobile#die()
     */
	public void die() {
		super.die();
	}
}
