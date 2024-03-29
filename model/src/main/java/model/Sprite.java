package model;

/**
 * <h1>The Class Spite provides the path and the id of the element's images</h1>
 *
 * @author Nathan Beer nathan.beer@viacesi.fr, L�o Thommes leo.thommes@cesi.fr, Pierre Baudot pierre.baudot@viacesi.fr
 * @version 1.0
 * @since jdk1.8.0_171
 */
public class Sprite {
	
	/** The image path. */
	private String pathImage;
	
	/** The console Image. */
	private char id;
	
	/**
	 * The constructor.
	 * Instanciate a new sprite
	 * 
	 * @param pathImage
	 * 			The image path
	 * @param string
	 * 			the id
	 */
	public Sprite(final String pathImage, final char string) {
		this.setPathImage(pathImage);
		this.setId(string);
	}
	
	/**
     * Instantiates a new sprite.
     *
     * @param id
     *            the character
     */
	public Sprite(final char id) {
		this("noimage.jpg", id);
	}

	/**
	 * The getter of the image id
	 * 
	 * @return id
	 */
	public final char getId() {
		return this.id;
	}
	
	/**
	 * The setter of the image id
	 * 
	 * @param id
	 */
	public void setId(final char id) {
		this.id = id;
	}
	
	/**
	 * The getter of the image path
	 * 
	 * @return pathImage
	 */
	public final String getPathImage() {
		return this.pathImage;
	}
	
	/**
	 * The setter og the image path
	 * 
	 * @param pathImage
	 */
	public final void setPathImage(String pathImage) {
		this.pathImage = pathImage;
	}	
}