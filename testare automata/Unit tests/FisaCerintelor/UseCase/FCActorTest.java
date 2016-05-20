package FisaCerintelor.UseCase;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by genius on 5/19/2016.
 */
public class FCActorTest {
    @Test
    public void setName()
    {
        FCActor test = new FCActor();
        test.setName("test1");
        assertEquals(test.name,"test1");
        test.setName("test1");
        assertEquals(test.name,"test2");
    }

    @Test
    public void getName()
    {
        FCActor test = new FCActor();
        test.setName("test1");
        assertEquals(test.getName(),"test1");
        test.setName("test1");
        assertEquals(test.getName(),"test2");
    }

}

