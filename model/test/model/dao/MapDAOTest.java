package model.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.dao.MapDAO;

public class MapDAOTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetMotionMapTxt() throws Exception {
		MapDAO.getMotionMapTxt();
	}

	@Test
	public void testGetMotionLessMapTxt() throws Exception {
		MapDAO.getMotionLessMapTxt();
	}

	@Test
	public void testGetSpriteTxt() throws Exception {
		MapDAO.getSpriteTxt();
	}

	@Test
	public void testCreateMap() throws Exception {
		MapDAO.CreateMap();
	}

}
