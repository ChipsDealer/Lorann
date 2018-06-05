package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.HUD;

public class HUDTest {

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

	@Test
	public void testSetScore() {
		HUD.setScore(200);
		assertEquals(200, HUD.getScore());
	}

	@Test
	public void testGetScore() {
		HUD.setScore(0);
		int expectedOutcome = HUD.getScore();
		assertEquals(0, expectedOutcome);
		
	}

	@Test
	public void testSetLifes() {
		HUD.setLifes(11);
		assertEquals(11, HUD.getLifes());
	}

	@Test
	public void testGetLifes() {
		HUD.setLifes(11);
		int expectedOutcome = HUD.getLifes();
		assertEquals(11, expectedOutcome);
	}

	@Test
	public void testAddScore() {
		HUD.setScore(200);
		HUD.addScore();
		int expectedOutcome = HUD.getScore();
		assertEquals(400, expectedOutcome);
	}

	@Test
	public void testLessScore() {
		HUD.setScore(200);
		HUD.lessScore();
		int expectedOutcome = HUD.getScore();
		assertEquals(0, expectedOutcome);
	}

	@Test
	public void testAddLifes() {
		HUD.setLifes(11);
		HUD.addLifes();
		int expectedOutcome = HUD.getLifes();
		assertEquals(12, expectedOutcome);
	}

	@Test
	public void testLessLifes() {
		HUD.setLifes(11);
		HUD.lessLifes();
		int expectedOutcome = HUD.getLifes();
		assertEquals(10, expectedOutcome);
	}

	@Test
	public void testIsGameRunning() {
		boolean expectedOutcome = HUD.isGameRunning();
		assertNotNull(expectedOutcome);
	}

	@Test
	public void testSetGameRunning() {
		HUD.setGameRunning(true);
		assertEquals(true, HUD.isGameRunning());
	}

	@Test
	public void testGetMapX() {
		HUD.setMapX(15);
		int expectedOutcome = HUD.getMapX();
		assertEquals(15, expectedOutcome);
	}

	@Test
	public void testSetMapX() {
		HUD.setMapX(15);
		assertEquals(15, HUD.getMapX());
	}

	@Test
	public void testGetMapY() {
		HUD.setMapY(15);
		int expectedOutcome = HUD.getMapY();
		assertEquals(15, expectedOutcome);
	}

	@Test
	public void testSetMapY() {
		HUD.setMapY(15);
		assertEquals(15, HUD.getMapY());
	}

}
