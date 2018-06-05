package view;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ViewFacadeTest {

	private ViewFacade view;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.view = new ViewFacade();
	}

	@After
	public void tearDown() throws Exception {
	}
	/**
	 * Test if can Create Display
	 */
	@Test
	public void testCreateDisplay() {
		this.view.createDisplay(new int[5][5], new String[5], new String[5][5], 100, 11, 0, 0);
		assertNotNull(this.view.getWindow());
	}
	/**
	 * Test if we can Display a Message
	 */
	@Test
	public void testDisplayMessage() {
		try {
			this.view.displayMessage("test");
		}
		catch (Exception e)
		{
			fail();
		}
		
	}
	/**
	 * TEst if we can Get a Window
	 */
	@Test
	public void testGetWindow() {
		this.view.createDisplay(new int[5][5], new String[5], new String[5][5], 100, 11, 0, 0);
		assertNotNull(this.view.getWindow());
	}
	/**
	 * Test if we can Set a Window
	 */
	@Test
	public void testSetWindow() {
		this.view.setWindow(new Window(0, 0, new int[5][5], new String[5], new String[5][5], 10, 10));
		assertNotNull(this.view.getWindow());
	}
	/**
	 * Test if can Add a Listener
	 */
	@Test
	public void testAddListener() {
		this.view.createDisplay(new int[5][5], new String[5], new String[5][5], 100, 11, 0, 0);
		this.view.addListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		assertNotNull(this.view.getWindow().getKeyListeners());;
	}
	/**
	 * Test tif this is the end of the game
	 */
	@Test
	public void testEndGame() {
		try {
			this.view.endGame(true);
			this.view.endGame(false);
		}
		catch (Exception e)
		{
			fail();
		}
	}
	/**
	 * Test the method CloseGame
	 */
	@Test
	public void testCloseGame() {
		try {
			this.view.createDisplay(new int[5][5], new String[5], new String[5][5], 100, 11, 0, 0);
			this.view.closeGame();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
