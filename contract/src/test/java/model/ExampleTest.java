package model;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @author Nathan Beer nathan.beer@viacesi.fr
 * @version 1.0
 * @since jre1.8.0_131
 */
public class ExampleTest {
    private Example example;

    /**
     * 
     * @throws Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * 
     * @throws Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * 
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        this.example = new Example(1, "Example test");
    }

    /**
     * 
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    
    @Test
    public void testGetId() {
        final int expected = 1;
        assertEquals(expected, this.example.getId());
    }

    @Test
    public void testGetName() {
        final String expected = "Example test";
        assertEquals(expected, this.example.getName());
    }

    @Test
    public void testSetName() {
        String expected = "Example test";
        assertEquals(expected, this.example.getName());
        expected = "Example test modified";
        this.example.setName(expected);
        assertEquals(expected, this.example.getName());
    }

    @Test
    public void testToString() {
        final String expected = "1 : Example test";
        assertEquals(expected, this.example.toString());
    }

}
