package FisaCerintelor.UseCase;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by stfn-PC on 19-May-16.
 */
public class StepTest {

    Step s;
    String str;

    @Test
    public void testStepTestConstructor() throws Exception{
        System.out.print("Testare constructor Step ");
        try {
            s=new Step();
            assertTrue("Test failed",s.getDescription()==null && s.getTitleAction()==null);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void setTitleAction() throws Exception {
        System.out.print("Testare setTitleAction ");
        try{
            str="testTitle";
            s=new Step();
            s.setTitleAction(str);
            assertTrue("- Test failed", s.getTitleAction() == str);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void setDescription() throws Exception {
        System.out.print("Testare setDescription ");
        try{
            str="testDescription";
            s=new Step();
            s.setDescription(str);
            assertTrue("- Test failed", s.getDescription() == str);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getTitleAction() throws Exception {
        System.out.print("Testare getTitleAction ");
        try {
            str = "Titlu";
            s=new Step();
            s.setTitleAction(str);
            String str2 = s.getTitleAction();
            assertTrue("- Test failed", str == str2);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getDescription() throws Exception {
        System.out.print("Testare getDescription ");
        try {
            str = "Description";
            s=new Step();
            s.setDescription(str);
            String str2 = s.getDescription();
            assertTrue("- Test failed", str == str2);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

}