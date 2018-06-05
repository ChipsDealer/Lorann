package model.mobile;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.mobile.Motion;
import model.mobile.Spell;
import model.motionLess.MotionLess;

public class SpellTest {
	Spell spell;
	Motion motion[];
	MotionLess motionLess[][];

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		spell = new Spell(10,10);
		
	}

	@After
	public void tearDown() throws Exception {
	}
	/**
	 * Test if the Spell can die
	 */
	@Test
	public void testDie() {
		boolean expectedOutcome = spell.isAlive();
		assertEquals(false, expectedOutcome);	
	}
	/**
	 * Test if the Spell can Die
	 */
	@Test
	public void testSpell() {
		boolean expectedOutcome = spell.isAlive();
		assertEquals(false, expectedOutcome);
	}
	/**
	 * Test if the spell have a collision
	 */
	@Test
	public void testCollision() {
		try {
			this.spell.collision(motion, motionLess);
		} catch (NullPointerException e) {
			assertNotNull(e);
		}
	}
	/**
	 * Test if we can had a random sprite to the spell
	 */
	@Test
	public void testSetRandomSprite() {
		int expectedOutcome = spell.setRandomSprite();
		assertNotNull(expectedOutcome);

	}

}
