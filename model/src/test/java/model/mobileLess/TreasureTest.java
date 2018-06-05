package model.mobileLess;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.motionLess.Treasure;

public class TreasureTest {

	private Treasure treasure;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.treasure = new Treasure();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTreasure() {
		assertNotNull(this.treasure);
	}

}
