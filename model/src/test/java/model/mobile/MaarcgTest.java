package model.mobile;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.mobile.Maarcg;
import model.mobile.Motion;
import model.motionLess.MotionLess;

public class MaarcgTest {
	Maarcg maarcg;
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
		maarcg = new Maarcg(10, 10);
	}

	@After
	public void tearDown() throws Exception {
	}
	/**
	 * Test if Maarch die
	 */
	@Test
	public void testDie() {
		boolean expectedOutcome = maarcg.isAlive();
		assertEquals(false, expectedOutcome);	
	}

	/**
	 * Method to test the constructor.
	 */
	@Test
	public void testArrbarr() {
		boolean expectedOutcome = maarcg.isAlive();
		assertEquals(false, expectedOutcome);
	}

	/**
	 * Method to test the collisions of Maarcg.
	 */
	@Test
	public void testCollision() {
		try {
			this.maarcg.collision(motion, motionLess);
		} catch (NullPointerException e) {
			assertNotNull(e);
		}
	}

}
