package model.dao;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/**
 * Test all the method from the Package Model.DAO 
 * @author Pierre Baudot
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ AbstractDAOTest.class, LorannBDDConnectorTest.class, MapDAOTest.class })
public class AllTests {

}
