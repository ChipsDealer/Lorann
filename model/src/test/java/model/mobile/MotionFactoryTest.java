package model.mobile;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.mobile.Motion;
import model.mobile.MotionFactory;

public class MotionFactoryTest {

	Motion[] motion;
	
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
	 * Test the method LoadFile
	 * @throws Exception
	 */
	@Test
	public void testLoadFile() throws Exception {
		MotionFactory.loadFile();
	}
	/**
	 * Test The method GetMotion
	 */

	@Test
	public void testGetMotion() {
		MotionFactory.setMotion(motion);
		Motion[] expectedOutcome = MotionFactory.getMotion();
		assertEquals(motion, expectedOutcome);
	}
	/**
	 * Test The method SetMotion
	 */
	@Test
	public void testSetMotion() {
		MotionFactory.setMotion(motion);
		assertEquals(motion, MotionFactory.getMotion());
	}

}
