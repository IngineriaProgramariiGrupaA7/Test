package ActivityDiagram;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by stfn-PC on 23-May-16.
 */
public class NamespaceTest {
    Namespace n;
    String str;
    @Test
    public void getName() throws Exception {
        System.out.print("Testare getName ");
        try {
            str = "Name";
            n=new Namespace();
            n.setName(str);
            String str2 = n.getName();
            assertTrue("- Test failed", str == str2);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void setName() throws Exception {
        System.out.print("Testare setName ");
        try{
            str="testName";
            n=new Namespace();
            n.setName(str);
            assertTrue("- Test failed", n.getName() == str);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

}