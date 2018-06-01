package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import model.dao.MapDAO;
import model.mobile.MotionFactory;
import model.motionLess.MotionLessFactory;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Léo Thommes leo.thommes@cesi.fr
 * @version 1.0
 */
public final class ModelFacade implements IModel {
	
	
	/** The Constant MotionLessFactory. */
	public static MotionLessFactory motionlessfactory;
	
	/** The Constant MotionFactory. */
	public static MotionFactory motionfactory;
	
	/** The Constant MapDAO. */
	public static MapDAO mapDao;
	
	
	/** The ArrayList MotionFactory. */
	public ArrayList<MotionFactory> mapMotion;
	
	/** The ArrayList MotionLessFactory. */
	public ArrayList<MotionLessFactory> mapMotionLess;
	
	
    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
    }

    /*
    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleById(int)
     *
    @Override
    public Example getExampleById(final int id) throws SQLException {
        return ExampleDAO.getExampleById(id);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleByName(java.lang.String)
     *
    @Override
    public Example getExampleByName(final String name) throws SQLException {
        return ExampleDAO.getExampleByName(name);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getAllExamples()
     *
    @Override
    public List<Example> getAllExamples() throws SQLException {
        return ExampleDAO.getAllExamples();
    }

    */
    
	@Override
	public ResultSet getProcedureMotion(final String id){
		return mapDao.getProcedureMotion(id);
	}

	@Override
	public ResultSet getProcedureMotionLess(final String id){
		return mapDao.getProcedureMotionLess(id);
	}

	@Override
	public void CreateMap() {
		
	}

}
