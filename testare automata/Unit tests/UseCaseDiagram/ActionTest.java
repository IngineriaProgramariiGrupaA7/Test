package UseCaseDiagram;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by genius on 5/19/2016.
 */
public class ActionTest {
    Action test;

    @Test
    public void setName() {
        test.setName("test1");
        assertEquals(test.name,"test1");
        test.setName("test1");
        assertEquals(test.name,"test2");

    }

    @Test
    public void setDescription() {
        test.setDescription("test1");
        assertEquals(test.name,"test1");
        test.setDescription("test1");
        assertEquals(test.name,"test2");
    }

    @Test
    public void getName() {
        test.setName("test1");
        assertEquals(test.getName(),"test1");
        test.setName("test1");
        assertNotNull(test);
        assertEquals(test.getName(),"test2");
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