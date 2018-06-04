package model.motionLess;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;


/**
 * <h1>A factory to create all static elements.</h1>
 *
 * @author Léo thommes leo.thommes@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_131
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
	
	/**
	 * The String for txt file location.
	 */
	private static String fileMotionLess = "C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\motionLess.txt";
    
	/**
     * Gets the good MotionLess from file symbol.
     *
     * @param fileSymbol
     *            the file symbol
     * @return the from file symbol
     */
    public static Point loadFile() throws Exception
    {
    	
        String line;
        char fileSymbol;
        Point position = new Point();
		
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
        }
		
        MotionLessFactory.motionLess = new MotionLess[position.y][position.x];
        
        for (int i=0; i<position.y; i++)
        {
        	for (int j = 0; j < position.x; j++)
        	{
        		line = buff.readLine();
        		/** Convert String to char. */
        		fileSymbol = line.charAt(0);
        		switch (fileSymbol)
        		{
	        		case '@':
		        		{
		        			MotionLessFactory.motionLess[i][j] = MotionLessFactory.ENERGICBUBBLE;
		        		}
		        	break;
		        	
	        		case 'C':
		        		{
		        			MotionLessFactory.motionLess[i][j] = MotionLessFactory.TREASURE;
		        		}
		        	break;
		        		
	        		case '#':
		        		{
		        			MotionLessFactory.motionLess[i][j] = MotionLessFactory.BADDOOR;
		        		}
		        	break;
		        		
	        		case 'O':
		        		{
		        			MotionLessFactory.motionLess[i][j] = MotionLessFactory.KINDDOOR;
		        		}
		        	break;
		        	
	        		case '-':
		        		{
		        			MotionLessFactory.motionLess[i][j] = MotionLessFactory.LATERALBONE;
		        		}
	        		break;
		        	
	        		case '|':
		        		{
		        			MotionLessFactory.motionLess[i][j] = MotionLessFactory.VERTICALBONE;
		        		}
	        		break;
			        	
	        		case 'X':
		        		{
		        			MotionLessFactory.motionLess[i][j] = MotionLessFactory.WALLCORNER;
		        		}
	        		break;
	        		
	        		case '_':
		        		{
		        			MotionLessFactory.motionLess[i][j] = MotionLessFactory.BASICGROUND;
		        		}
	        		break;
	        		
	        		default:
		        		{
		        			MotionLessFactory.motionLess[i][j] = MotionLessFactory.BASICGROUND;
		        		}
        		}
        	}
        }
        buff.close();
        return position;
    }
	
	/**
	 * Getter and setter for motion less table.
	 */
    public static MotionLess[][] getMotionLess() {
		return motionLess;
	}


	public static void setMotionLess(MotionLess[][] motionLess) {
		MotionLessFactory.motionLess = motionLess;
	}
	 
	
	
}
