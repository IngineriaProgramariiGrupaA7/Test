package FisaCerintelor;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by genius on 5/19/2016.
 */
public class ActorAndObjectiveTest {
    ActorAndObjective test = new ActorAndObjective();
    @Test
    public void setName() {
        test.setName("test1");
        assertEquals(test.getName(),"test1");
        test.setName("test1");
        assertEquals(test.getName(),"test2");

    }

    @Test
    public void getName() {
        test.setName("test1");
        assertNotNull(test);
        assertEquals(test.getName(),"test1");
        test.setName("test1");
        assertNotNull(test);
        assertEquals(test.getName(),"test2");
    }

    @Test
    public void setObjective() {
        test.setObjective("test1");
        assertEquals(test.getObjective(),"test1");
        test.setObjective("test1");
        assertEquals(test.getObjective(),"test2");

    }

    @Test
    public void getObjective() {
        test.setObjective("test1");
        assertNotNull(test);
        assertEquals(test.getObjective(),"test1");
        test.setObjective("test1");
        assertNotNull(test);
        assertEquals(test.getObjective(),"test2");

    }

}