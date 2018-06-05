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

	/**
	 * Test if the Score is correctly set at 200
	 */
	@Test
	public void testSetScore() {
		HUD.setScore(200);
		assertEquals(200, HUD.getScore());
	}
	/**
	 * test if the Score is correctly set at 0
	 */
	@Test
	public void testGetScore() {
		HUD.setScore(0);
		int expectedOutcome = HUD.getScore();
		assertEquals(0, expectedOutcome);
		
	}
	/**
	 *Test if the Lifes is correctly set at 11	 
	 */
	@Test
	public void testSetLifes() {
		HUD.setLifes(11);
		assertEquals(11, HUD.getLifes());
	}
	/**
	 * Test if the lifes is correctly get at 11
	 */
	@Test
	public void testGetLifes() {
		HUD.setLifes(11);
		int expectedOutcome = HUD.getLifes();
		assertEquals(11, expectedOutcome);
	}
	/**
 	*Test if we correctly add 200 at the Score 
 	*/
	@Test
	public void testAddScore() {
		HUD.setScore(200);
		HUD.addScore();
		int expectedOutcome = HUD.getScore();
		assertEquals(400, expectedOutcome);
	}
	/**
	 * Tesst if we correctly substract 200 at the Score
	 */
	@Test
	public void testLessScore() {
		HUD.setScore(200);
		HUD.lessScore();
		int expectedOutcome = HUD.getScore();
		assertEquals(0, expectedOutcome);
	}
	/**
	 * Test if we correctly add lifes
	 */

	@Test
	public void testAddLifes() {
		HUD.setLifes(11);
		HUD.addLifes();
		int expectedOutcome = HUD.getLifes();
		assertEquals(12, expectedOutcome);
	}
	/**
	 *  Test if we correctly substract Lifes
	 */

	@Test
	public void testLessLifes() {
		HUD.setLifes(11);
		HUD.lessLifes();
		int expectedOutcome = HUD.getLifes();
		assertEquals(10, expectedOutcome);
	}
	/**
	 * Test if The game is  correctly running
	 */
	@Test
	public void testIsGameRunning() {
		boolean expectedOutcome = HUD.isGameRunning();
		assertNotNull(expectedOutcome);
	}

	/**
	 * Test if the game is correctly set
	 */
	@Test
	public void testSetGameRunning() {
		HUD.setGameRunning(true);
		assertEquals(true, HUD.isGameRunning());
	}

	/**
	 * Test if the map on the X is correctly Get
	 */
	@Test
	public void testGetMapX() {
		HUD.setMapX(15);
		int expectedOutcome = HUD.getMapX();
		assertEquals(15, expectedOutcome);
	}
	/**
	 * Test if the map on the X is correctly Set 
	 */
	@Test
	public void testSetMapX() {
		HUD.setMapX(15);
		assertEquals(15, HUD.getMapX());
	}
	/**
	 * Test if the map on Y is correctly Get
	 */
	@Test
	public void testGetMapY() {
		HUD.setMapY(15);
		int expectedOutcome = HUD.getMapY();
		assertEquals(15, expectedOutcome);
	}
	/**
	 * Test if the map on the Y is correclty Set
	 */

	@Test
	public void testSetMapY() {
		HUD.setMapY(15);
		assertEquals(15, HUD.getMapY());
	}

}
