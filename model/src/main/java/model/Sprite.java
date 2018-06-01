package model;


public class Sprite {
	
	/** The image path. */
	private String pathImage;
	
	/** The console Image. */
	private char id;
	
	public Sprite(final String pathImage, final char string) { /// <--char à la place de string zin le débile 
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

	public final char getId() {
		return this.id;
	}
	
	private void setId(final char id) {
		this.id = id;
	}
	
	public final String getPathImage() {
		return this.pathImage;
	}
	
	public final void setPathImage(String pathImage) {
		this.pathImage = pathImage;
	}	
}