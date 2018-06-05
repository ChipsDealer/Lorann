package controller;

import static org.junit.Assert.*;
import java.awt.event.KeyListener;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.IModel;
import view.IView;
/**
 * <h1>The Class ControllerFacadeTest provides a test of the ControllerFacade </h1>
 *
 * @author Nathan Beer nathan.beer@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_131
 */
public class ControllerFacadeTest {

	private IView view;
	private IModel model;
	private ControllerFacade controller;

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}


	@Before
	public void setUp() throws Exception {
		this.view = new IView() {
			
			@Override
			public void showDisplay(int[][] motionMapDimension, String[] motionMapImages, String[][] motionlessMap, int score,
					int life) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void endGame(boolean bool) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void displayMessage(String message) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void createDisplay(int[][] motionMapDimension, String[] motionMapImages, String[][] motionlessMap, int score,
					int life, int width, int length) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void closeGame() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void addListener(KeyListener listener) {
				// TODO Auto-generated method stub
				
			}
		};
		this.model = new IModel() {
			
			@Override
			public void setMapY(int mapY) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setMapX(int mapY) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void respawn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void moveMobile() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void moveLorann(String dir) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void lorannAction(boolean bool) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void loadMap() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean isLorannAlive() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isGameRunning() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int getScore() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public void getProcedureMotionLess() throws Exception {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void getProcedureMotion() throws Exception {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public int getMapY() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getMapX() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean getLorannAction() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int getLifes() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public void createMap() throws Exception {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public String[] convertMotionMapImages() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int[][] convertMotionMapDimension() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String[][] convertMotionLessMap() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		this.controller = new ControllerFacade(view, model);
	}

	@After
	public void tearDown() throws Exception {
	}
	/**
	 * Test the Controller Facade can be build
	 */
	@Test
	public void testControllerFacade() {
		assertNotNull(this.view);
		assertNotNull(this.model);
	}
	/**
	 * Test if the Controller start
	 */
	@Test
	public void testStart() {
		try {
			this.controller.start();
		} catch (Exception e) {
			fail();
		}
	}
	/**
	 * Test if the Controller.runGame is running
	 */
	@Test
	public void testRunGame() {
		try {
			this.controller.runGame();
			assertNotNull(this.controller.getModel().isGameRunning());
		} catch (Exception e) {
			fail();
		}
	}
	/**
	 * Test if the View his correctly get from the controller
	 */

	@Test
	public void testGetView() {
		assertNotNull(this.controller.getView());
	}
	/**
	 *  Test if the Model his correcly get from the Model
	 */
	@Test
	public void testGetModel() {
		assertNotNull(this.controller.getModel());
	}
	
	/**
	 * Test if the Key Typed from the controller is null
	 */
	@Test
	public void testKeyTyped() {
		try {
			this.controller.keyTyped(null);
		} catch (Exception e) {
		}
	}

}
