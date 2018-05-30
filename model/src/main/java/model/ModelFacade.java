package model;

import java.sql.SQLException;
import java.util.List;

import com.mysql.cj.api.mysqla.result.Resultset;

import model.dao.MapDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Léo Thommes leo.thommes@cesi.fr
 * @version 1.0
 */
public final class ModelFacade implements IModel {
	
	public MapDAO mapDao = new MapDAO();

    /**
     * Instantiates a new model facade.
     */
    public ModelFacade() {
        super();
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleById(int)
     */
    @Override
    public Example getExampleById(final int id) throws SQLException {
        return ExampleDAO.getExampleById(id);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleByName(java.lang.String)
     */
    @Override
    public Example getExampleByName(final String name) throws SQLException {
        return ExampleDAO.getExampleByName(name);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getAllExamples()
     */
    @Override
    public List<Example> getAllExamples() throws SQLException {
        return ExampleDAO.getAllExamples();
    }

	@Override
	public Resultset getProcedureMotion(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resultset getProcedureMotionLess(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void CreateMap() {
		// TODO Auto-generated method stub
		
	}

}
