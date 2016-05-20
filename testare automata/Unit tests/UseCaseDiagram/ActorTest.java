package UseCaseDiagram;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by stfn-PC on 19-May-16.
 */
public class ActorTest {
    Actor a;
    String str;
    @Test
    public void setName() throws Exception {
        System.out.print("Testare setName ");
        try {
            str = "Actor";
            a=new Actor();
            a.setName(str);
            assertTrue("- Test failed", a.getName() == str);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getName() throws Exception {
        System.out.print("Testare getName ");
        try {
            str = "Author";
            a=new Actor();
            a.setName(str);
            String str2 = a.getName();
            assertTrue("- Test failed", str == str2);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

}