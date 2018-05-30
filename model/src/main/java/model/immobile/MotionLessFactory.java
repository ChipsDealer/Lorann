package model.immobile;

import java.util.ArrayList;

/**
 * <h1>A factory to create MotionlessElements objects.</h1>
 * @author Léo Thommes
 * @version 1.0 
 */

public abstract class MotionLessFactory {
	
	/** All the Constant. */
	
	/** The Constant EnergicBubble. */
	private static final EnergicBubble ENERGICBUBBLE = new EnergicBubble();
	
	/** The Constant BasicGround. */
	private static final BasicGround BASICGROUND = new BasicGround();
	
	/** The Constant Treasure. */
	private static final Treasure TREASURE = new Treasure();
	
	/** The Constant BadDoor. */
	private static final BadDoor BADDOOR = new BadDoor();
	
	/** The Constant KindDoor. */
	private static final KindDoor KINDDOOR = new KindDoor();
	
	/** The Constant LateralBone. */
	private static final LateralBone LATERALBONE = new LateralBone();
	
	/** The Constant VerticalBone. */
	private static final VerticalBone VERTICALBONE = new VerticalBone();
	
	/** The Constant WallCorner. */
	private static final WallCorner WALLCORNER = new WallCorner();

	/**
     * The motionless elements is an array of all possible MotionlessElement.
     */
	private static MotionLess[] motionLess = {
			ENERGICBUBBLE,
			TREASURE,
			BADDOOR,
			KINDDOOR,
			LATERALBONE,
			VERTICALBONE,
			WALLCORNER,
			BASICGROUND
	};
	
	/*
    * Creates a new MotionlessElements object.
    *
    * @return the motionless element
    */
	
	public static MotionLess createEnergicBubble() {
		return ENERGICBUBBLE;
	}
	
	/*
	    * Creates a new MotionlessElements object.
	    *
	    * @return the motionless element
	    */
		
	public static MotionLess createBASICGROUND() {
			return BASICGROUND;
	}
	
	/*
	    * Creates a new MotionlessElements object.
	    *
	    * @return the motionless element
	    */
		
	public static MotionLess createTreasure() {
			return TREASURE;
	}
		
	/*
		    * Creates a new MotionlessElements object.
		    *
		    * @return the motionless element
		    */
			
	public static MotionLess createBadDoor() {
				return BADDOOR;
	}	
	
	
	/*
	    * Creates a new MotionlessElements object.
	    *
	    * @return the motionless element
	    */
		
	public static MotionLess createKindDoor() {
			return KINDDOOR;
	}
	
	
	/*
	    * Creates a new MotionlessElements object.
	    *
	    * @return the motionless element
	    */
		
	public static MotionLess createLateralBone() {
			return LATERALBONE;
	}
	
	/*
	    * Creates a new MotionlessElements object.
	    *
	    * @return the motionless element
	    */
		
	public static MotionLess createVerticalBone() {
			return VERTICALBONE;
	}
	
	
	/*
	    * Creates a new MotionlessElements object.
	    *
	    * @return the motionless element
	    */
		
	public static MotionLess createWallCorner() {
			return WALLCORNER;
	}
	
	/**
     * Gets the good MotionLess from file symbol.
     *
     * @param fileSymbol
     *            the file symbol
     * @return the from file symbol
     */
    public static MotionLess getFromFileSymbol(final char fileSymbol) {
        for (final MotionLess motionLess : motionLess) {
            if (motionLess.getSprite().getId() == fileSymbol) {
                return motionLess;
            }
        }
        return BASICGROUND;
    }
	
	
	/**
	public void loadFile(ArrayList<T> map) {
		
	}
	*/
	
	
	 
	
	
}
