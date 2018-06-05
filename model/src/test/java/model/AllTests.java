package model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Test all the method from the package Model
 * @author Pierre Baudot
 * 
 */
@RunWith(Suite.class)
@SuiteClasses({ downLoadImageTest.class, HUDTest.class, ModelFacadeTest.class, SpriteTest.class })
public class AllTests {

}
