package model;


public abstract class Element {
	
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

	protected void setProperty(final Property property) {
		this.property = property;
	}

	protected final void setSprite(final Sprite sprite) {
		this.sprite = sprite;
	}
	
	
	
	
	
}
