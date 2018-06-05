package model.mobileLess;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.motionLess.WallCorner;

public class WallCornerTest {

	private WallCorner wallcorner;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.wallcorner = new WallCorner();
	}

	@After
	public void tearDown() throws Exception {
	}
	/**
 	*Test if there is a WallCorner 
 	*/
	@Test
	public void testWallCorner() {
		assertNotNull(this.wallcorner);
	}

}
