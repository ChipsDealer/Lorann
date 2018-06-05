package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;

/**
 * <h1>The Class AbstractDAO.</h1>
 * 
 * @author Léo Thommes leo.thommes@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_131
 */
public abstract class AbstractDAO {

    /**
     * Execute query.
     *
     * @param query
     *            The sql query
     * @return ResultSet
     * 			The result set
     */
    protected static ResultSet executeQuery(final String query) {
        return LorannBDDConnector.getInstance().executeQuery(query);
    }

    /**
     * Execute update.
     *
     * @param query
     *            The sql query
     * @return int
     * 			The number of changed lines
     */
    protected static int executeUpdate(final String query) {
        return LorannBDDConnector.getInstance().executeUpdate(query);
    }

    /**
     * Prepare call.
     *
     * @param query
     *            The sql query
     * @return CallableStatement
     * 			The callable statement
     */
    protected static CallableStatement prepareCall(final String query) {
        return LorannBDDConnector.getInstance().prepareCall(query);
    }
}

