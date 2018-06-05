package model;


/**
 * <h1>The Class is the main class for all elements.</h1>
 *
 * @author Léo thommes leo.thommes@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_131
 */

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
     * @param property
     *            the permeability
     */
	public Element(final Sprite sprite, final Property property){
		this.setSprite(sprite);
		this.setProperty(property);
	}
	
	/**
	 * Getter of the sprite
	 * 
	 * @return sprite
	 */
	public final Sprite getSprite() {
		return this.sprite;
	}

	/**
	 * Getter of the property
	 * 
	 * @return property
	 */
	public final Property getProperty() {
		return this.property;
	}

	/**
	 * Setter of the Property
	 *
	 * @param property
	 */
	protected void setProperty(final Property property) {
		this.property = property;
	}

	/**
	 * Setter of the Sprite
	 * 
	 * @param sprite
	 */
	protected final void setSprite(final Sprite sprite) {
		this.sprite = sprite;
	}
	
	
	
	
	
}
