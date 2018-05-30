package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Example;

/**
 * <h1>The Class ExampleDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class MapDAO extends AbstractDAO {
	
    /*
     * Define id's value to change the Map
     */
    private static String mapNumber = "one";
    
    /** The sql example by id. */
    private static String sqlProcedureMotion = "call findMap" + mapNumber + "_Motion";

    /** The sql example by name. */
    private static String sqlProcedureMotionLess = "call findMap" + mapNumber + "_MotionLess";

    /** The id column index. */
    private static int    idColumnIndex    = 1;

    /** The name column index. */
    private static int    nameColumnIndex  = 2;

    /**
     * Gets the example by id.
     *
     * @param id
     *            the id
     * @return the example by id
     * @throws SQLException
     *             the SQL exception
     */
    public static Example getExampleById(final int id) throws SQLException {
        final CallableStatement callStatement = prepareCall(procedure1);
        Example example = null;
        callStatement.setInt(1, id);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(idColumnIndex), result.getString(nameColumnIndex));
            }
            result.close();
        }
        return example;
    }

    /**
     * Gets the example by name.
     *
     * @param name
     *            the name
     * @return the example by name
     * @throws SQLException
     *             the SQL exception
     */
    public static Example getExampleByName(final String name) throws SQLException {
        final CallableStatement callStatement = prepareCall(procedure2);
        Example example = null;

        callStatement.setString(1, name);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();
            if (result.first()) {
                example = new Example(result.getInt(idColumnIndex), result.getString(nameColumnIndex));
            }
            result.close();
        }
        return example;
    }
    /*

    /**
     * Gets the all examples.
     *
     * @return the all examples
     * @throws SQLException
     *             the SQL exception
     *
    public static List<Example> getAllExamples() throws SQLException {
        final ArrayList<Example> examples = new ArrayList<Example>();
        final CallableStatement callStatement = prepareCall(sqlAllExamples);
        if (callStatement.execute()) {
            final ResultSet result = callStatement.getResultSet();

            for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) {
                examples.add(new Example(result.getInt(idColumnIndex), result.getString(nameColumnIndex)));
            }
            result.close();
        }
        return examples;
    }
    */
    
    
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
