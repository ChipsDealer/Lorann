package model;

import java.awt.Image;

public class Element {
	
	/** The sprite. */
	private Sprite sprite;
	
	/** The property. */
	private Property property;
	
	/**
     * Instantiates a new element.
     *
     * @param sprite
     *            the sprite
     * @param permeability
     *            the permeability
     */
	public Element(final Sprite sprite, final Property property){
		this.setSprite(sprite);
		this.setProperty(property);
	}
	
	public final Sprite getSprite() {
		return this.sprite;
	}

	public final Property getProperty() {
		return this.property;
	}

	private void setProperty(final Property property) {
		this.property = property;
	}

	private final void setSprite(final Sprite sprite) {
		this.sprite = sprite;
	}
	
	public final Image getImage() {
		return this.getSprite().getImage();
	}
	
	
	
}
