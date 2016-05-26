package ActivityDiagram;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by stfn-PC on 23-May-16.
 */
public class StepTest {
    Step s;
    String str;
    @Test
    public void getType() throws Exception {
        System.out.print("Testare getType ");
        try {
            str = "Type";
            s=new Step();
            s.setType(str);
            String str2 = s.getType();
            assertTrue("- Test failed", str == str2);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void setType() throws Exception {
        System.out.print("Testare setType ");
        try{
            str="testType";
            s=new Step();
            s.setType(str);
            assertTrue("- Test failed", s.getType() == str);
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
            str = "Name";
            s=new Step();
            s.setName(str);
            String str2 = s.getName();
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
            s=new Step();
            s.setName(str);
            assertTrue("- Test failed", s.getName() == str);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getBelongingNamespace() throws Exception {
        System.out.print("Testare getBelongingNamespace( ");
        try {
            str = "Namespace";
            s=new Step();
            s.setBelongingNamespace(str);
            String str2 = s.getBelongingNamespace();
            assertTrue("- Test failed", str == str2);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void setBelongingNamespace() throws Exception {
        System.out.print("Testare setBelongingNamespace ");
        try{
            str="testNamespace";
            s=new Step();
            s.setBelongingNamespace(str);
            assertTrue("- Test failed", s.getBelongingNamespace() == str);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

}