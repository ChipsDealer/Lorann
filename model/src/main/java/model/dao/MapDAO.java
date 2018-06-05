package model.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.CallableStatement;
import java.sql.ResultSet;

import model.Example;

/**
 * <h1>The Class MapDAO.</h1>
 *
 * @author Léo Thommes leo.thommes@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_131
 */

public abstract class MapDAO extends AbstractDAO {
	
    /**
     * Define id's value to change the Map
     */
    private static String mapNumber;
    
    /** The sql for motion. */
    private static String sqlProcedureMotion = "call Motion" + MapDAO.mapNumber;

    /** The sql for motionless. */
    private static String sqlProcedureMotionLess = "call MotionLess" + MapDAO.mapNumber;
    
    /** The sql for sprites. */
    private static String sqlProcedureSprite = "call Sprites";
    
    /** The sql for the mapNumber. */
    private static String sqlProcedureMapNumber = "call MapNumber";
    
    /**
     * Get the motion map from the BDD and write into a .txt file
     * 
     * @throws Exception
     */
    public static void getMotionMapTxt() throws Exception {
    	
    	int lineCount = 0;
        
        FileWriter fstream = new FileWriter("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\motion.txt");
        BufferedWriter out = new BufferedWriter(fstream);

        final CallableStatement callStatement = prepareCall(sqlProcedureMotion);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            
            /**
             * Place cursor at the last row of result.
             */
            result.last();
            
            
            lineCount = result.getRow()*3;

            /**
             * Write the number of lines as int in txt file.
             */
            	for(int i=0; i<1; i++) {
                    out.write(lineCount + "\n");
                    System.out.println("Completed writing lines count into text file");
                    
            	}
            	
            	/**
            	 * Place cursor before first row.
            	 */
            	result.beforeFirst();
            	
            	/**
            	 * Write all element as String in txt file.
            	 */
                while (result.next()) {
                out.write(result.getString("Element") + "\n");
                out.write(result.getInt("X") + "\n");
                out.write(result.getInt("Y") + "\n");

                System.out.println("Completed writing String into text file");
            }

            
            result.close();
            out.close();
            callStatement.close();
        }
       
    }
    
    /**
     * Get the motionLess map from the BDD and write into a .txt file
     * 
     * @throws Exception
     */
    public static void getMotionLessMapTxt() throws Exception {
        
        FileWriter fstream = new FileWriter("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\motionLess.txt");
        BufferedWriter out = new BufferedWriter(fstream);

        final CallableStatement callStatement = prepareCall(sqlProcedureMotionLess);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            

            /**
             * Write the map dimension as int in txt file.
             */
            	result.first();
            	for(int i=0; i<2; i++) {
                    out.write(result.getInt("Element") + "\n");
                    
                    System.out.println("Completed writing Dimension into text file");
                    result.next();
            	}
            	
            	/**
            	 * Write all element as String in txt file.
            	 */
            	result.previous();
                while (result.next()) {
                out.write(result.getString("Element") + "\n");

                    System.out.println("Completed writing String into text file");
            }
            
            result.close();
            out.close();
            callStatement.close();
        }

    }
    
    /**
     * Get the sprites from the BDD and write into a .txt file
     * 
     * @throws Exception
     */
    public static void getSpriteTxt() throws Exception {
    	        
        FileWriter fstream = new FileWriter("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\listSprites.txt");
        BufferedWriter out = new BufferedWriter(fstream);

        final CallableStatement callStatement = prepareCall(sqlProcedureSprite);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            	
            	/**
            	 * Write all element as String in txt file.
            	 */
                while (result.next()) {
                out.write(result.getString("Sprite") + "\n");

                System.out.println("Completed writing String into text file");
            }

            
            result.close();
            out.close();
            callStatement.close();
        }
       
    }
    
    
    /**
     * Get the mapNumber from the BDD
     * 
     * @throws Exception
     */
    public static int getMapNumber() throws Exception {
    	        
        final CallableStatement callStatement = prepareCall(sqlProcedureMapNumber);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            result.first();
            int mapnumber = result.getInt("id");
            result.close();
            callStatement.close();
            return mapnumber;
        }
        return 1;
       
    }
    
    
    /**
     * This method allows to create the map.
     * 
     * @throws Exception
     */
    public static void CreateMap() throws Exception {
    	MapDAO.mapNumber = "" + MapDAO.getMapNumber();
    	MapDAO.sqlProcedureMotion = "call Motion" + MapDAO.mapNumber;
    	MapDAO.sqlProcedureMotionLess = "call MotionLess" + MapDAO.mapNumber;
    	File dir = new File("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Roaming\\Lorann\\");
    	dir.mkdir();
    	MapDAO.getSpriteTxt();
    	MapDAO.getMotionLessMapTxt();
    	MapDAO.getMotionMapTxt();
    }
    
}
