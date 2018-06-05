package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Sprite;

public class SpriteTest {
	public Sprite sprite;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		sprite = new Sprite("image.png", 'c');
	}

	@After
	public void tearDown() throws Exception {
	}
	/**
	 * Test if the Srpite is not null
	 */
	@Test
	public void testSpriteStringChar() {
		assertNotNull(this.sprite);
	}
	/**
	 * Test the method SpriteChar
	 */
	@Test
	public void testSpriteChar() {
		assertNotNull(new Sprite('c'));
	}
	/**
	 * Test if we can get the Id
	 */
	@Test
	public void testGetId() {
		sprite.setId('c');
		char expectedOutcome = sprite.getId();
		assertEquals('c', expectedOutcome);
		
	}
	/**
	 * Test if we can Set Id
	 */
	@Test
	public void testSetId() {
		sprite.setId('c');
		assertEquals('c', sprite.getId());
	}
	/**
	 * Test if we can Get the Path Image
	 */
	@Test
	public void testGetPathImage() {
		sprite.setPathImage("test.png");
		String expectedOutcome = sprite.getPathImage();
		assertEquals("test.png", expectedOutcome);
	}
	/**
	 * Test if we can Set the path Image
	 */
	@Test
	public void testSetPathImage() {
		sprite.setPathImage("test.png");
		assertEquals("test.png", sprite.getPathImage());
	}

}
