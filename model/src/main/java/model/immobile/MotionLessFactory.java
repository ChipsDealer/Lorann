package model.immobile;

import java.util.ArrayList;

public abstract class MotionLessFactory {
	
	/** All the Constant. */
	
	private static final EnergicBubble ENERGICBUBBLE = new EnergicBubble();
	private static final Treasure TREASURE = new Treasure();
	private static final BadDoor BADDOOR = new BadDoor();
	private static final KindDoor KINDDOOR = new KindDoor();
	private static final LateralBone LATERALBONE = new LateralBone();
	private static final VerticalBone VERTICALBONE = new VerticalBone();
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
	
	
	public void loadFile(ArrayList<T> map) {
		
	}
	
	
	 
	
	
}
