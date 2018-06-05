package model.mobileLess;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.motionLess.BadDoor;

public class BadDoorTest {

	private BadDoor baddoor;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.baddoor = new BadDoor();
	}

	@After
	public void tearDown() throws Exception {
	}
	/***
	 * Test if there is a BadDoor
	 */
	@Test
	public void testBadDoor() {
		assertNotNull(this.baddoor);
	}

}
