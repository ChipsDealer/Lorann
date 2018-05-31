package mobile;

import java.util.ArrayList;
/**
 * <h1>The Class Lorann is a enemies of the player</h1>
 *
 * @author Frost
 * @version 1.0
 */

public class Lorann extends Motion{

	/** All the constant SPRITE **/
	private static final Sprite SPRITEB = new Sprite("lorann_b.png", "L");
	private static final Sprite SPRITEBL = new Sprite("lorann_bl.png", "L");
	private static final Sprite SPRITEBR = new Sprite("lorann_br.png", "L");
	private static final Sprite SPRITEL = new Sprite("lorann_l.png", "L");
	private static final Sprite SPRITER = new Sprite("lorann_r.png", "L");
	private static final Sprite SPRITEU = new Sprite("lorann_u.png", "L");
	private static final Sprite SPRITEUL = new Sprite("lorann_ul.png", "L");
	private static final Sprite SPRITEUR = new Sprite("lorann_ur.png", "L");
	
	
	public Lorann() {
		super(final int x, final int y, final Sprite SPRITEL, Property.BLOCKING_WITHOUT_ACTION); 
		SPRITEB.loadImage();
		SPRITEBL.loadImage();
		SPRITEBR.loadImage();
		SPRITER.loadImage();
		SPRITEU.loadImage();
		SPRITEUL.loadImage();
		SPRITEUR.loadImage();
	}

	/*
     * (non-Javadoc)
     * @see model.mobile#move(ArrayList<?> map, ArrayList<?> mob)
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
		this.setSprite(SPRITEL);
	}
	
	 /*
     * (non-Javadoc)
     * @see model.mobile#die()
     */
	public void die() {
		super.die();
	}

}
