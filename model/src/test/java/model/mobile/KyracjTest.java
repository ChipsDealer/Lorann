package model.mobile;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.mobile.Kyracj;
import model.mobile.Motion;
import model.motionLess.MotionLess;

public class KyracjTest {
	Kyracj kyracj;
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
		kyracj = new Kyracj(10, 10);
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Method to test the live status.
	 */
	@Test
	public void testDie() {
		boolean expectedOutcome = kyracj.isAlive();
		assertEquals(false, expectedOutcome);	
	}

	/**
	 * Method to test the constructor.
	 */
	@Test
	public void testKyracj() {
		boolean expectedOutcome = kyracj.isAlive();
		assertEquals(false, expectedOutcome);
	}

	/**
	 * Method to test the collisions.
	 */
	@Test
	public void testCollision() {
		try {
			this.kyracj.collision(motion, motionLess);
		} catch (NullPointerException e) {
			assertNotNull(e);
		}
	}
}
