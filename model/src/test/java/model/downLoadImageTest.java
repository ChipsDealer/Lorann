package model;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class downLoadImageTest {
	
	/**
	 * Instanciate Object.
	 */
	downLoadImage downloadImage;

	/**
	 * <h2> Basic testing methods for JUnit4. </h2>
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Make composition.
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		downloadImage = new downLoadImage();
	}

	/**
	 * 
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method who download all sprites and return Url server.
	 * @throws FileNotFoundException
	 */
	@Test
	public void test() throws FileNotFoundException {
		String expectedOutcome = downloadImage.downloadSprites("http://vandeiheim.ovh/images/");
		assertEquals("http://vandeiheim.ovh/images/", expectedOutcome);
	}

}
