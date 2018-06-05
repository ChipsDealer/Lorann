package model.mobile;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.mobile.Arrbarr;
import model.mobile.Motion;
import model.motionLess.MotionLess;

public class ArrbarrTest {
	Arrbarr arrbarr;
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
		arrbarr = new Arrbarr(10, 10);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDie() {
		boolean expectedOutcome = arrbarr.isAlive();
		assertEquals(false, expectedOutcome);
	}

	@Test
	public void testMoveMotionArrayMotionLessArrayArray() {
	}

	/**
	 * Nothing to test.
	 */
	@Test
	public void testMoveMotionArrayMotionLessArrayArrayString() {
	}

	@Test
	public void testArrbarr() {
		boolean expectedOutcome = arrbarr.isAlive();
		assertEquals(false, expectedOutcome);
	}

	@Test
	public void testCollision() {
		boolean expectedOutcome = arrbarr.collision(motion, motionLess);
		assertNotNull(expectedOutcome);
	}

}
