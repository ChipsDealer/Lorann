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
	}

	
	@Test
	public void testGetProcedureMotion() {
		//modelfacade.
	}

	@Test
	public void testGetProcedureMotionLess() {
	}

	@Test
	public void testCreateMap() throws Exception {
		//assertNotNull(modelfacade.createMap());
	}

	@Test
	public void testLoadMap() {
	}

	@Test
	public void testGetLifes() {
		int expectedOutcome = modelfacade.getLifes();
		assertEquals(11, expectedOutcome);
	}

	@Test
	public void testGetScore() {
		int expectedOutcome = modelfacade.getScore();
		assertEquals(0, expectedOutcome);
	}

	@Test
	public void testGetMotionLess() {
	}
	

	@Test
	public void testGetMotion() {
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
		modelfacade.moveMobile();
	}

	@Test
	public void testMoveLorann() {
		modelfacade.moveLorann("test");
	}

	@Test
	public void testIsGameRunning() {
		boolean expectedOutcome = modelfacade.isGameRunning();
		assertEquals(true, expectedOutcome);
	}

	@Test
	public void testIsLorannAlive() {
		boolean expectedOutcome = modelfacade.isLorannAlive();
		assertEquals(false, expectedOutcome);
	}

//	@Test
//	public void testConvertMotionLessMap() {
//		String[][] expectedOutcome = modelfacade.convertMotionLessMap();
//		assertEquals( ,expectedOutcome);
//	}
//
//	@Test
//	public void testConvertMotionMapImages() {
//		String[] expectedOutcome = modelfacade.convertMotionMapImages();
//		assertEquals(, expectedOutcome);
//	}

	@Test
	public void testConvertMotionMapDimension() {
	}

	@Test
	public void testRespawn() {
		modelfacade.respawn();
		assertEquals(0, modelfacade.getScore());
		assertEquals(10, modelfacade.getLifes());
	}

	@Test
	public void testLorannAction() {
		modelfacade.lorannAction(true);
		boolean expectedOutcome = modelfacade.getLorannAction();
		assertEquals(true, expectedOutcome);
	}

	@Test
	public void testGetLorannAction() {
		boolean expectedOutcome = modelfacade.getLorannAction();
		assertEquals(true, expectedOutcome);
	}

}
