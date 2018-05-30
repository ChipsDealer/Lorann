package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {
	
	/** The image.*/
	private Image image;
	
	/** The image path. */
	private String pathImage;
	
	/** The console Image. */
	private char id;
	
	/** Image loaded. */
	private Boolean imageLoaded;
	
	
	public Sprite(final String pathImage, final char id) {
		this.setPathImage(pathImage);
		this.setId(id);

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
	 * Instantiates a new sprite
	 * 
	 * @return the image
	 */
	public final Image getImage() {
		return this.image;
	}
	
	/**
     * Loads image.
     *
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */	
	public final void loadImage() throws IOException{
		this.setImage(ImageIO.read(new File("images/" + this.getPathImage())));
	}

	public final char getId() {
		return this.id;
	}

	
	/**
	 * Instantiates a new sprite
	 * 
	 * @return the image
	 */
	private final void setImage (final Image image) {
		this.image= image;
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
	
	
	
	
	public final boolean isImageLoaded() {
		return this.imageLoaded;
	}
	
	public final void setImageLoaded(final boolean isImageLoaded) {
		this.imageLoaded=isImageLoaded;
	}

	

	
}
