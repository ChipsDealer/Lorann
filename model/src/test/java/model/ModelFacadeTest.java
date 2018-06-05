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

	/**
	 * Test if the procedure notion didn't fail
	 */
	@Test
	public void testGetProcedureMotion() {
		try {
			this.modelfacade.getProcedureMotion();
		} catch (Exception e) {
			fail();
		}
	}
	/**
	 * Test if the procedure motionLess didn't fail
	 */
	@Test
	public void testGetProcedureMotionLess() {
		try {
			this.modelfacade.getProcedureMotionLess();
		} catch (Exception e) {
			fail();
		}
	}
	/**
	 * Test if the Creation of the map didn't fail
	 * @throws Exception
	 */
	@Test
	public void testCreateMap() throws Exception {
		try {
			this.modelfacade.createMap();
		} catch (Exception e) {
			fail();
		}
	}
	/**
	 * Test if the Loading of the map didn't fail
	 */
	@Test
	public void testLoadMap() {
		try {
			this.modelfacade.loadMap();
		} catch (Exception e) {
			fail();
		}
	}
	/**
	 * Test if we we can get lifes
	 */
	@Test
	public void testGetLifes() {
		int expectedOutcome = modelfacade.getLifes();
		assertEquals(11, expectedOutcome);
	}
	/**
	 * Test if we can Get Score
	 */
	@Test
	public void testGetScore() {
		modelfacade = new ModelFacade();
		int expectedOutcome = modelfacade.getScore();
		assertEquals(200, expectedOutcome);
	}
	/**
	 * Test if we can get the MotionLess
	 */
	@Test
	public void testGetMotionLess() {
		assertNull(this.modelfacade.getMotionLess());
	}
	
	/**
	 * Test if we can get the motion
	 */
	@Test
	public void testGetMotion() {
		assertNull(this.modelfacade.getMotion());
	}
	/**
	 * Test if we can get the Map on Y
	 */
	@Test
	public void testGetMapY() {
		modelfacade.setMapY(10);
		int expectedOutcome = modelfacade.getMapY();
		assertEquals(10, expectedOutcome);
	}
	/**
	 * Test if we can Set the Map on Y
	 */
	@Test
	public void testSetMapY() {
		modelfacade.setMapY(10);
		assertEquals(10, modelfacade.getMapY());
	}
	/**
	 * Test if we can Get the Map on X
	 */
	@Test
	public void testGetMapX() {
		modelfacade.setMapX(10);
		int expectedOutcome = modelfacade.getMapX();
		assertEquals(10, expectedOutcome);
	}
	/**
	 * Test if we can Set the Map on X
	 */
	@Test
	public void testSetMapX() {
		modelfacade.setMapX(10);
		assertEquals(10, modelfacade.getMapX());
	}
	/**
	 * Test if we can Move mobile element
	 */
	@Test
	public void testMoveMobile() {
		try {
			modelfacade.moveMobile();
			fail();
		} catch (NullPointerException e) {
		}
	}
	/**
	 * Test if we can move Lorann
	 */
	@Test
	public void testMoveLorann() {
		try {
			modelfacade.moveLorann("nop");
			fail();
		} catch (NullPointerException e) {
		}
	}
	/**
	 * Test if the game is running
	 */
	@Test
	public void testIsGameRunning() {
		boolean expectedOutcome = modelfacade.isGameRunning();
		assertEquals(true, expectedOutcome);
	}
	/**
	 * Test if Lorann is Alive
	 */
	@Test
	public void testIsLorannAlive() {
		try {
			this.modelfacade.isLorannAlive();
			fail();
		} catch (Exception e) {
		}
	}
	/**
	 * Test if we can Respawn
	 */
	@Test
	public void testRespawn() {
		modelfacade.respawn();
		assertEquals(0, modelfacade.getScore());
		assertEquals(10, modelfacade.getLifes());
	}
	/**
	 * Test if Lorann can do an Action
	 */
	@Test
	public void testLorannAction() {
		try {
			this.modelfacade.lorannAction(true);
			fail();
		} catch (Exception e) {
		}
	}
	/**
	 * Test if we can get Sortilege
	 */
	@Test
	public void testGetLorannAction() {
		try {
			this.modelfacade.getLorannAction();
			fail();
		} catch (Exception e) {
		}
	}

}
