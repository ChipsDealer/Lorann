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

	@Test
	public void testSpriteStringChar() {
	}

	@Test
	public void testSpriteChar() {
	}

	@Test
	public void testGetId() {
		sprite.setId('c');
		char expectedOutcome = sprite.getId();
		assertEquals('c', expectedOutcome);
		
	}
	
	@Test
	public void testSetId() {
		sprite.setId('c');
		assertEquals('c', sprite.getId());
	}

	@Test
	public void testGetPathImage() {
		sprite.setPathImage("test.png");
		String expectedOutcome = sprite.getPathImage();
		assertEquals("test.png", expectedOutcome);
	}

	@Test
	public void testSetPathImage() {
		sprite.setPathImage("test.png");
		assertEquals("test.png", sprite.getPathImage());
	}

}
