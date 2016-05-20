package FisaCerintelor.UseCase;

import FisaCerintelor.UseCase.Extension;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Created by stfn-PC on 19-May-16.
 */
public class ExtensionTest {

    Extension e;
    String str;

    @Test
    public void testExtensionConstructor() throws Exception {
        System.out.print("Testare constructor Extension ");
        try {
            e=new Extension();
            assertTrue("Test failed",e.getStepTitle() == null && e.getExtensionTitle()==null && e.getDescription()==null);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void setStepTitle() throws Exception {
        System.out.print("Testare setStepTitle ");
        try{
            str="testTitle";
            e=new Extension();
            e.setStepTitle(str);
            assertTrue("- Test failed", e.getStepTitle() == str);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void setExtensionTitle() throws Exception {
        System.out.print("Testare setExtensionTitle ");
        try{
            str="testTitle";
            e=new Extension();
            e.setExtensionTitle(str);
            assertTrue("- Test failed", e.getExtensionTitle() == str);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void setDescription() throws Exception {
        System.out.print("Testare setDescription");
        try{
            str="testdescription";
            e=new Extension();
            e.setDescription(str);
            assertTrue("- Test failed", e.getDescription() == str);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getStepTitle() throws Exception {
        System.out.print("Testare getStepTitle ");
        try {
            str = "StepTitle1";
            e = new Extension();
            e.setStepTitle(str);
            String str2 = e.getStepTitle();
            assertTrue("- Test failed", str == str2);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }


    @Test
    public void getExtensionTitle() throws Exception {
        System.out.print("Testare getExtensionTitle ");
        try {
            str = "StepTitle2";
            e = new Extension();
            e.setExtensionTitle(str);
            String str2 = e.getExtensionTitle();
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
            str = "description";
            e = new Extension();
            e.setDescription(str);
            String str2 = e.getDescription();
            assertTrue("- Test failed", str == str2);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

}