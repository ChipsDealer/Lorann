package model.mobileLess;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.motionLess.VerticalBone;

public class VerticalBoneTest {

	private VerticalBone verticalbone;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.verticalbone = new VerticalBone();
	}

	@After
	public void tearDown() throws Exception {
	}
	/**
	 * TEst if there is a VerticalBone
	 */

	@Test
	public void testVerticalBone() {
		assertNotNull(this.verticalbone);
	}

}
