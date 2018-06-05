package model.mobileLess;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.motionLess.MotionLess;
import model.motionLess.MotionLessFactory;

public class MotionLessFactoryTest {
	
	MotionLess[][] motionLess;

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
	public void testLoadFile() throws Exception {
		MotionLessFactory.loadFile();
	}

	@Test
	public void testGetMotionLess() {
		MotionLessFactory.setMotionLess(motionLess);
		MotionLess[][] expectedOutcome = MotionLessFactory.getMotionLess();
		assertEquals(motionLess, expectedOutcome);
		}

	@Test
	public void testSetMotionLess() {
		MotionLessFactory.setMotionLess(motionLess);
		assertEquals(motionLess, MotionLessFactory.getMotionLess());
	}

}
