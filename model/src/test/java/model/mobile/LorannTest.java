package model.mobile;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Sprite;
import model.mobile.Lorann;
import model.mobile.Motion;
import model.motionLess.MotionLess;

public class LorannTest {
	Lorann lorann;
	Motion motion[];
	MotionLess motionLess[][];
	Sprite sprite;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		lorann =  new Lorann(10, 10);
	}

	@After
	public void tearDown() throws Exception {
	}
	/**
	 * Test if Lorann Die
	 */
	@Test
	public void testDie() {
		boolean expectedOutcome = lorann.isAlive();
		assertEquals(false, expectedOutcome);
		}
	/**
	 * Test the method move Up
	 */
	@Test
	public void testMoveUp() {
		lorann.moveUp();
		Sprite expectedOutcome = lorann.getSprite();
		assertEquals(lorann.SPRITEU, expectedOutcome);
	}
	/**
	 * Test the movement to the up + right
	 */
	@Test
	public void testMoveUpRight() {
		lorann.moveUpRight();
		Sprite expectedOutcome = lorann.getSprite();
		assertEquals(lorann.SPRITEUR, expectedOutcome);
	}
	/**
	 * Test the movement to the Up + Left
	 */
	@Test
	public void testMoveUpLeft() {
		lorann.moveUpLeft();
		Sprite expectedOutcome = lorann.getSprite();
		assertEquals(lorann.SPRITEUL, expectedOutcome);
	}
	/**
	 * Test the movement to the Down
	 */
	@Test
	public void testMoveDown() {
		lorann.moveDown();
		Sprite expectedOutcome = lorann.getSprite();
		assertEquals(lorann.SPRITEB, expectedOutcome);
	}
	/**
	 * Test the Movement to the Down+ Right
	 */
	@Test
	public void testMoveDownRight() {
		lorann.moveDownRight();
		Sprite expectedOutcome = lorann.getSprite();
		assertEquals(lorann.SPRITEBR, expectedOutcome);
	}
	/**
	 * Test the movement to the Down + Left
	 */
	@Test
	public void testMoveDownLeft() {
		lorann.moveDownLeft();
		Sprite expectedOutcome = lorann.getSprite();
		assertEquals(lorann.SPRITEBL, expectedOutcome);
	}
	/**
	 * Test the movement to the left
	 */
	@Test
	public void testMoveLeft() {
		lorann.moveLeft();
		Sprite expectedOutcome = lorann.getSprite();
		assertEquals(lorann.SPRITEL, expectedOutcome);
	}
	/**
	 * Test the movement to the Right
	 */
	@Test
	public void testMoveRight() {
		lorann.moveRight();
		Sprite expectedOutcome = lorann.getSprite();
		assertEquals(lorann.SPRITER, expectedOutcome);
	}

	/**
	 * Test the method DoNothing
	 */
	@Test
	public void testDoNothing() {
		lorann.doNothing();
	}
	/**
	 * Test if Lorann is Alive
	 */
	@Test
	public void testLorann() {
		boolean expectedOutcome = lorann.isAlive();
		assertEquals(false, expectedOutcome);
	}
	/**
	 * Test if there is a Collision
	 */
	@Test
	public void testCollision() {
		try {
			this.lorann.collision(motion, motionLess);
		} catch (NullPointerException e) {
			assertNotNull(e);
		}
	}

}
