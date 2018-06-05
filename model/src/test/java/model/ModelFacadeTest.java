package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.ModelFacade;

public class ModelFacadeTest {
	
	ModelFacade modelfacade;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		modelfacade = new ModelFacade();
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * The Constructor.
	 * Nothing to test.
	 */
	@Test
	public void testModelFacade() {
		assertNotNull(this.modelfacade);
	}

	
	@Test
	public void testGetProcedureMotion() {
		try {
			this.modelfacade.getProcedureMotion();
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	public void testGetProcedureMotionLess() {
		try {
			this.modelfacade.getProcedureMotionLess();
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	public void testCreateMap() throws Exception {
		try {
			this.modelfacade.createMap();
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	public void testLoadMap() {
		try {
			this.modelfacade.loadMap();
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	public void testGetLifes() {
		int expectedOutcome = modelfacade.getLifes();
		assertEquals(11, expectedOutcome);
	}

	@Test
	public void testGetScore() {
		modelfacade = new ModelFacade();
		int expectedOutcome = modelfacade.getScore();
		assertEquals(200, expectedOutcome);
	}

	@Test
	public void testGetMotionLess() {
		assertNull(this.modelfacade.getMotionLess());
	}
	

	@Test
	public void testGetMotion() {
		assertNull(this.modelfacade.getMotion());
	}

	@Test
	public void testGetMapY() {
		modelfacade.setMapY(10);
		int expectedOutcome = modelfacade.getMapY();
		assertEquals(10, expectedOutcome);
	}

	@Test
	public void testSetMapY() {
		modelfacade.setMapY(10);
		assertEquals(10, modelfacade.getMapY());
	}

	@Test
	public void testGetMapX() {
		modelfacade.setMapX(10);
		int expectedOutcome = modelfacade.getMapX();
		assertEquals(10, expectedOutcome);
	}

	@Test
	public void testSetMapX() {
		modelfacade.setMapX(10);
		assertEquals(10, modelfacade.getMapX());
	}

	@Test
	public void testMoveMobile() {
		try {
			modelfacade.moveMobile();
			fail();
		} catch (NullPointerException e) {
		}
	}

	@Test
	public void testMoveLorann() {
		try {
			modelfacade.moveLorann("nop");
			fail();
		} catch (NullPointerException e) {
		}
	}

	@Test
	public void testIsGameRunning() {
		boolean expectedOutcome = modelfacade.isGameRunning();
		assertEquals(true, expectedOutcome);
	}

	@Test
	public void testIsLorannAlive() {
		try {
			this.modelfacade.isLorannAlive();
			fail();
		} catch (Exception e) {
		}
	}

	@Test
	public void testRespawn() {
		modelfacade.respawn();
		assertEquals(0, modelfacade.getScore());
		assertEquals(10, modelfacade.getLifes());
	}

	@Test
	public void testLorannAction() {
		try {
			this.modelfacade.lorannAction(true);
			fail();
		} catch (Exception e) {
		}
	}

	@Test
	public void testGetLorannAction() {
		try {
			this.modelfacade.getLorannAction();
			fail();
		} catch (Exception e) {
		}
	}

}
