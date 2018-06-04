package view;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class WindowTest {
	
	private Window window;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		int motionMapDimension[][] = {};
		String motionMapImages[] = {};
		String motionlessMap[][] = {};
		this.window = new Window(0, 0, motionMapDimension, motionMapImages, motionlessMap, 10, 10);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWindowIntIntIntArrayArrayStringArrayStringArrayArrayIntInt() {
		assertEquals(0, this.window.getWidthMap());
		assertEquals(0, this.window.getLengthMap());
		assertEquals("Lorann Java 1.0", this.window.getTitle());
		assertNotNull(this.window.getPanel());
	}

	@Test
	public void testGetWidthMap() {
		assertEquals(0, this.window.getWidthMap());
	}

	@Test
	public void testSetWidthMap() {
		this.window.setWidthMap(50);
		assertEquals(50, this.window.getWidthMap());
	}

	@Test
	public void testGetLengthMap() {
		assertEquals(0, this.window.getLengthMap());
	}

	@Test
	public void testSetLengthMap() {
		this.window.setLengthMap(50);
		assertEquals(50, this.window.getLengthMap());
	}

	@Test
	public void testGetPanel() {
		assertNotNull(this.window.getPanel());
	}

	@Test
	public void testSetPanel() {
		int motionMapDimension[][] = {};
		String motionMapImages[] = {};
		String motionlessMap[][] = {};
		this.window.setPanel(new Panel(motionMapDimension, motionMapImages, motionlessMap, 0, 0, 0, 0));
		assertNotNull(this.window.getPanel());
	}

}
