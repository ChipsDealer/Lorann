package view;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PanelTest {

	private Panel panel;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.panel = new Panel(new int[5][5], new String[5], new String[5][5], 0, 0, 0, 0);
	}

	@After
	public void tearDown() throws Exception {
	}
	/**
	 * Test if there is all the information on the Panel
	 */
	@Test
	public void testPanel() {
		assertNotNull(this.panel);
		assertEquals(0, this.panel.getLife());
		assertEquals(0, this.panel.getScore());
	}
	/**
	 * Test if we can Get the Score
	 */
	@Test
	public void testGetScore() {
		assertEquals(0, this.panel.getScore());
	}
	/**
	 * Test if we can Set the Score
	 */
	@Test
	public void testSetScore() {
		this.panel.setScore(50);
		assertEquals(50, this.panel.getScore());
	}
	/**
	 * Test if we can Get the Life
	 */
	@Test
	public void testGetLife() {
		assertEquals(0, this.panel.getLife());
	}
	/**
	 * Test if we can Set the Life
	 */
	@Test
	public void testSetLife() {
		this.panel.setLife(50);
		assertEquals(50, this.panel.getLife());
	}
	/**
	 * Test if we can Get the Motion Map Dimension
	 */
	@Test
	public void testGetmotionMapDimension() {
		assertNotNull(this.panel.getmotionMapDimension());
	}
	/**
	 * TEst if we can Set the motion Map Dimension
	 */
	@Test
	public void testSetmotionMapDimension() {
		this.panel.setmotionMapDimension(new int[5][5]);
		assertNotNull(this.panel.getmotionMapDimension());
	}
	/**
	 * Test if we can Get the MotionLess Map
	 */
	@Test
	public void testGetMotionlessMap() {
		assertNotNull(this.panel.getMotionlessMap());
	}
	/**
	 * Test if we can Set the MotionLess Map
	 */
	@Test
	public void testSetMotionlessMap() {
		this.panel.setMotionlessMap(new String[6][6]);
		assertNotNull(this.panel.getmotionMapDimension());
	}
	/**
	 * Test if we can Get the Motion Map Images
	 */
	@Test
	public void testGetMotionMapImages() {
		assertNotNull(this.panel.getMotionMapImages());
	}
	/**
	 * Test if we can Set motion Map Images
	 */
	@Test
	public void testSetMotionMapImages() {
		this.panel.setMotionMapImages(new String[5]);
		assertNotNull(this.panel.getMotionMapImages());
	}
	/**
	 * Test the method Paint COmponent Graphics
	 */
	@Test
	public void testPaintComponentGraphics() {
		try {
			int motionMapDimension[][] = {};
			String motionMapImages[] = {};
			String motionlessMap[][] = {};
			this.panel = new Panel(motionMapDimension, motionMapImages, motionlessMap, 0, 0, 0, 0);
			this.panel.repaint();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
