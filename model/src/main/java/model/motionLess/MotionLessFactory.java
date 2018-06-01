package model.motionLess;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

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
	private static MotionLess[][] motionLess;
	private static String fileMotionLess = "D:\\WorkspaceEclipse\\lecturefichier\\src\\lecturefichier\\MotionLess.txt";


    
	

	/*
    public static MotionLess getFromFileSymbol(final char fileSymbol) {
        for (final MotionLess motionLess : motionLess) {
            if (motionLess.getSprite().getId() == fileSymbol) {
                return motionLess;
            }
        }
        return BASICGROUND;
    }
    
    */
    
	/**
     * Gets the good MotionLess from file symbol.
     *
     * @param fileSymbol
     *            the file symbol
     * @return the from file symbol
     */
    public Point loadFile() throws Exception
    {
    	
    	String tabMotionLessSettings[] = new String[2];
        String tabMotionLess[];
        String line;
        char fileSymbol;
        Point position;
    	int x,y;
		
        InputStream flux = new FileInputStream(fileMotionLess); 
        InputStreamReader read = new InputStreamReader(flux);
        BufferedReader buff = new BufferedReader(read);
		
		for (int i=0; i<2; i++)
		{
        	line = buff.readLine();
        	if ( i == 0)
        	{
        		position.x = Integer.parseInt(line);
        	}
        	else
        	{
        		position.y = Integer.parseInt(line);
        	}
        	//tabMotionLessSettings[i] = line;       	
        }
        
        for (int i=0; i<position.y; i++)
        {
        	for (int j = 0; j < position.x; j++)
        	{
        		line = buff.readLine();
        		/** Convert String to char. */
        		fileSymbol = line.charAt(0);
        		
        		for (int k = 0; k < ) 
        		{
        			if (motionLess.getSprite().getId() == fileSymbol) 
        			{
        				return motionLess;
        				
        			}
        		}
        	}
    		
        }
        buff.close();
    return BASICGROUND;


    }
	
	
    public static MotionLess[][] getMotionLess() {
		return motionLess;
	}


	public static void setMotionLess(MotionLess[][] motionLess) {
		MotionLessFactory.motionLess = motionLess;
	}
	 
	
	
}
