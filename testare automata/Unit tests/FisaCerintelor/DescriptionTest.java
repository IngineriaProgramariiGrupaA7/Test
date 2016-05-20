package FisaCerintelor;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by genius on 5/19/2016.
 */
public class DescriptionTest {

    Description test;
    @Test
    public void setDescription() {
        test.setDescription("test1");
        assertEquals(test.getDescription(),"test1");
        test.setDescription("test1");
        assertEquals(test.getDescription(),"test2");

    }

    @Test
    public void getDescription() {
        test.setDescription("test1");
        assertEquals(test.getDescription(),"test1");
        test.setDescription("test1");
        assertNotNull(test);
        assertEquals(test.getDescription(),"test2");

    }

}