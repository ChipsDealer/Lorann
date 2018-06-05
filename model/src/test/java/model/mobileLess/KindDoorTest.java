package model.mobileLess;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.motionLess.KindDoor;

public class KindDoorTest {

	private KindDoor kinddoor;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.kinddoor = new KindDoor();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testKindDoor() {
		assertNotNull(this.kinddoor);
	}

}
