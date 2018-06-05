package model.mobile;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.mobile.Cargyv;
import model.mobile.Motion;
import model.motionLess.MotionLess;

public class CargyvTest {
	Cargyv cargyv;
	Motion motion[];
	MotionLess motionLess[][];
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cargyv =  new Cargyv(10, 10);
	}

	@After
	public void tearDown() throws Exception {
	}
	/**
	 * Test if Cargyv can die
	 */
	@Test
	public void testDie() {
		boolean expectedOutcome = cargyv.isAlive();
		assertEquals(false, expectedOutcome);	
		}

	/**
	 * Method to test the constructor.
	 */
	@Test
	public void testCargyv() {
		boolean expectedOutcome = cargyv.isAlive();
		assertEquals(false, expectedOutcome);
	}

	/**
	 * Method to test the collisions.
	 */
	@Test
	public void testCollision() {
		try {
			this.cargyv.collision(motion, motionLess);
		} catch (NullPointerException e) {
			assertNotNull(e);
		}
	}

}
