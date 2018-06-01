package model.mobile;



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;


/**
 * <h1>The Class mobileFactory instantiate every motion element </h1>
 *
 * @author Frost
 * @version 1.0
 */
public abstract class MotionFactory {
	
	/** The String read in file. */
    private String line;
	/** The Constant fileMotion. */
    protected static String fileMotion = "D:\\WorkspaceEclipse\\lecturefichier\\src\\lecturefichier\\Motion.txt"; //<-- modif
    private static final Lorann LORANN = new Lorann(0,0);
    private static final Arrbarr ARRBARR = new Arrbarr(0,0);
    private static final Kyracj KYRACJ = new Kyracj(0,0);
    private static final Maarcg MAARCG = new Maarcg(0,0);
    private static final Cargyv CARGYV = new Cargyv(0,0);
    private static final Spell SPELL = new Spell(0,0);
    
	
	/** All the Constant. */

    private static Motion[] motion = {
			LORANN,
			KYRACJ,
			CARGYV,			
			ARRBARR,
			MAARCG,
			SPELL
	};

    
	public void loadFile() throws Exception
	{
		
		char fileSymbol;
    	String tabMotionSettings[] = new String[1];
    	@SuppressWarnings("unused")
		String tabMotionLess[];
	
        InputStream flux = new FileInputStream(fileMotion); 
        InputStreamReader read = new InputStreamReader(flux);
        BufferedReader buff = new BufferedReader(read);
        
        for (int i=0; i<1; i++){
        	line = buff.readLine();
        	tabMotionSettings[i] = line;       	
        }
                
    	int tabLenth = Integer.parseInt(tabMotionSettings[0]);        
        for (int i=0; i<tabLenth/3; i++)
        {
        		line = buff.readLine();
        		fileSymbol = line.charAt(0);
        		
        		line = buff.readLine();
        		int posX = line.charAt(0);
        		
        		line = buff.readLine();
        		int posY = line.charAt(0);

        		for (int k = 0; k < 5; k++) 
        		{
        			if (MotionFactory.motion[k].getSprite().getId() == fileSymbol) 
        			{
        				MotionFactory.motion[k].setX(posX);
        				MotionFactory.motion[k].setY(posY);
        				MotionFactory.motion[k].setAlive(true);

        			}
        		}
        }	        
        buff.close();
	}
	
	
	public static Motion[] getMotion() {
		return motion;
	}


	public static void setMotion(Motion[] motion) {
		MotionFactory.motion = motion;
	}
	
	
	
	
}
