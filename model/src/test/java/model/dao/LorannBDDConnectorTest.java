package model.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.dao.LorannBDDConnector;

public class LorannBDDConnectorTest {
	LorannBDDConnector lorannBDDConnector;
	Statement statement;
	Connection connection;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		lorannBDDConnector = new LorannBDDConnector();
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * The constructor.
	 * Nothing to test.
	 */
	@Test
	public void testLorannBDDConnector() {
		
	}
	/**
	 * Test if we can get the Instance
	 */
	@Test
	public void testGetInstance() {
		LorannBDDConnector expectedOutcome = lorannBDDConnector.getInstance();
		assertNotEquals(null, expectedOutcome);
	}
	/**
	 * Test the method ExecuteQuery
	 */
	@Test
	public void testExecuteQuery() {
		ResultSet expectedOutcome = lorannBDDConnector.executeQuery("test");
			assertEquals(null, expectedOutcome);
	}
	/**
	 * Test the method PrepareCall
	 */
	@Test
	public void testPrepareCall() {
		CallableStatement expectedOutcome;
		assertNotNull(expectedOutcome = lorannBDDConnector.prepareCall("test"));
	}
	/**
	 * Test the metho ExecuteUpdate
	 */
	@Test
	public void testExecuteUpdate() {
		int expectedOutcome = lorannBDDConnector.executeUpdate("test");
		assertEquals(0, expectedOutcome);
	}
	/**
	 * Test if we can get The connetion from the BDD
	 */
	@Test
	public void testGetConnection() {
		lorannBDDConnector.setConnection(connection);
		Connection expectedOutcome = lorannBDDConnector.getConnection();
		assertEquals(connection, expectedOutcome);
	}
	/**
	 * Test if we set the connection from the Connection
	 */
	@Test
	public void testSetConnection() {
		lorannBDDConnector.setConnection(connection);
		assertEquals(connection, lorannBDDConnector.getConnection());
	}
	/**
	 * Test fi we can Get the Statement
	 */
	@Test
	public void testGetStatement() {
		lorannBDDConnector.setStatement(statement);
		Statement expectedOutcome = lorannBDDConnector.getStatement();
		assertEquals(statement, expectedOutcome);
	}
	/**
	 * Test if we can Set the Statements
	 */
	@Test
	public void testSetStatement() {
		lorannBDDConnector.setStatement(statement);
		assertEquals(statement, lorannBDDConnector.getStatement());
	}

}
