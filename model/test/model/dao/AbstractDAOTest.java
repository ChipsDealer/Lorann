package model.dao;

import static org.junit.Assert.*;

import java.sql.CallableStatement;
import java.sql.ResultSet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.dao.AbstractDAO;
import model.dao.LorannBDDConnector;

public class AbstractDAOTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method to execute sql query.
	 */
	@Test
	public void testExecuteQuery() {
		ResultSet expectedOutcome = AbstractDAO.executeQuery("test");
		assertEquals(LorannBDDConnector.getInstance().executeQuery("test"), expectedOutcome);
	}

	/**
	 * Test method to update BDD Data.
	 */
	@Test
	public void testExecuteUpdate() {
		int expectedOutcome = AbstractDAO.executeUpdate("test");
		assertEquals(LorannBDDConnector.getInstance().executeUpdate("test"), expectedOutcome);
	}

	/**
	 * Test method to prepare call sql.
	 */
	@Test
	public void testPrepareCall() {
		CallableStatement expectedOutcome = AbstractDAO.prepareCall("test");
		assertEquals(LorannBDDConnector.getInstance().prepareCall("test"), expectedOutcome);
	}

}
