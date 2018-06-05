package model.mobileLess;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.motionLess.EnergicBubble;

public class EnergicBubbleTest {

	private EnergicBubble energicbubble;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.energicbubble = new EnergicBubble();
	}

	@After
	public void tearDown() throws Exception {
	}
	/**
	 * Test if there is a EnergicBubble
	 */
	@Test
	public void testEnergicBubble() {
		assertNotNull(this.energicbubble);
	}

}
