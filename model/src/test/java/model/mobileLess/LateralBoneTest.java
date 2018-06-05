package model.mobileLess;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.motionLess.LateralBone;

public class LateralBoneTest {

	private LateralBone lateralbone;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.lateralbone = new LateralBone();
	}

	@After
	public void tearDown() throws Exception {
	}
	/**
	 * Test if there is a LateralBone
	 */
	@Test
	public void testLateralBone() {
		assertNotNull(this.lateralbone);
	}

}
