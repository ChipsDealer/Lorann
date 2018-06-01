package model.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * <h1>The Class MapDAO.</h1>
 *
 * @author Léo Thommes leo.thommes@viacesi.fr
 * @version 1.0
 */
public abstract class MapDAO extends AbstractDAO {

    /*
     * Define id's value to change the Map
     */
    private static String mapNumber = "1";

    /** The sql example by id. */
    public static String sqlProcedureMotion = "call Motion " + mapNumber;

    /** The sql example by name. */
    public static String sqlProcedureMotionLess = "call MotionLess " + mapNumber;

    /** The id column index. */
    public static int    idColumnIndex    = 1;

    /** The name column index. */
    public static int    nameColumnIndex  = 2;

    /**
     * Gets the example by id.
     *
     * @param id
     *            the id
     * @return the example by id
     * @throws SQLException
     *             the SQL exception
     */


		 
		 public void getMotionLessBDD(String Procedure) throws SQLException {
		        final CallableStatement callStatement = prepareCall(Procedure);
		        if (callStatement.execute()) {
		            ResultSet result = callStatement.getResultSet();
		            
		            String fileName = "./Map/MotionLess.txt";
			        try {
			            // Assume default encoding.
			            FileWriter fileWriter = new FileWriter(fileName);

			            // Always wrap FileWriter in BufferedWriter.
			            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

		            while(result.next()) {
		                bufferedWriter.write(result.getString("Element"));
		            }
		            bufferedWriter.close();
		            result.close();
		            
			        }catch(IOException e) {
			            System.out.println(e.getMessage());
			        }
		        
		        }
		 }

		 
		 public void getMotionBDD(String Procedure) throws SQLException {
		        final CallableStatement callStatement = prepareCall(Procedure);
		        ResultSet resultSet = null;
		        
		        if (callStatement.execute()) {
		            ResultSet result = callStatement.getResultSet();           
		            String fileName = "./Map/Motion.txt";
		            
			        try {
			        	
			            // Assume default encoding.
			            FileWriter fileWriter = new FileWriter(fileName);
			            
			            // Always wrap FileWriter in BufferedWriter.
			            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			            
			            while(result.next()) {
			            	bufferedWriter.write(result.getString("Element"), result.getInt("X"), result.getInt("Y"));
			            }
			            bufferedWriter.close();
			            result.close();
				        }catch(Exception ex) {
				            System.out.println("Error writing to file"+ fileName + "'");
				        }
		        }
		 }	 
		 
		 
		 


    public ResultSet getProcedureMotion(String id) {
		return null;

    }

    public ResultSet getProcedureMotionLess(String id) {
  		return null;

      }


    public void CreateMap() {

    }

    public void CreateMapMotionLess() {

    }

    public void CreateMapMotion() {

    }



}
