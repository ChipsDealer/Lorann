package model.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.dao.MapDAO;

public class MapDAOTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		MapDAO.getMapNumber();
		MapDAO.CreateMap();
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
		try {
			MapDAO.getMotionMapTxt();
		} catch (SQLException e) {
			fail();
		}
	}

	@Test
	public void testGetMotionLessMapTxt() throws Exception {
		try {
			MapDAO.getMotionLessMapTxt();
		} catch (SQLException e) {
			fail();
		}
	}

	@Test
	public void testGetSpriteTxt() throws Exception {
		try {
			MapDAO.getSpriteTxt();
		} catch (SQLException e) {
			fail();
		}
	}

	@Test
	public void testCreateMap() throws Exception {
		try {
			MapDAO.CreateMap();
		} catch (SQLException e) {
			fail();
		}
	}

}
