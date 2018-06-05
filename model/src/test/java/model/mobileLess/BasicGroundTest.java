package model.mobileLess;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.motionLess.BasicGround;

public class BasicGroundTest {

	private BasicGround basicground;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.basicground = new BasicGround();
	}

	@After
	public void tearDown() throws Exception {
	}
	/**
	 * Test if there is a BasicGround
	 */
	@Test
	public void testBasicGround() {
		assertNotNull(this.basicground);
	}

}
