package model.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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

	@Test
	public void testGetInstance() {
		LorannBDDConnector expectedOutcome = lorannBDDConnector.getInstance();
		assertNotEquals(null, expectedOutcome);
	}

	@Test
	public void testExecuteQuery() {
		ResultSet expectedOutcome = lorannBDDConnector.executeQuery("test");
			assertEquals(null, expectedOutcome);
	}

	@Test
	public void testPrepareCall() {
		CallableStatement expectedOutcome = lorannBDDConnector.prepareCall("test");
		assertEquals(null, expectedOutcome);
	}

	@Test
	public void testExecuteUpdate() {
		int expectedOutcome = lorannBDDConnector.executeUpdate("test");
		assertEquals(0, expectedOutcome);
	}

	@Test
	public void testGetConnection() {
		lorannBDDConnector.setConnection(connection);
		Connection expectedOutcome = lorannBDDConnector.getConnection();
		assertEquals(connection, expectedOutcome);
	}

	@Test
	public void testSetConnection() {
		lorannBDDConnector.setConnection(connection);
		assertEquals(connection, lorannBDDConnector.getConnection());
	}

	@Test
	public void testGetStatement() {
		lorannBDDConnector.setStatement(statement);
		Statement expectedOutcome = lorannBDDConnector.getStatement();
		assertEquals(statement, expectedOutcome);
	}

	@Test
	public void testSetStatement() {
		lorannBDDConnector.setStatement(statement);
		assertEquals(statement, lorannBDDConnector.getStatement());
	}

}
