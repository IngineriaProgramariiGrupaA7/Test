package FisaCerintelor;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by stfn-PC on 19-May-16.
 */
public class AuthorTest {
    Author a;
    String str;
    @Test
    public void testAuthorConstructor() throws Exception{
        System.out.print("Testare constructor Author ");
        try {
            str = "dddd dddd";
            a=new Author(str);
            assertTrue("- Test failed",a.getAuthor() == str);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void setAuthor() throws Exception {
        System.out.print("Testare setAuthor ");
        try {
            str = "Author";
            a=new Author(str);
            //d.setDomain(str);
            assertTrue("- Test failed", a.getAuthor() == str);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getAuthor() throws Exception {
        System.out.print("Testare getAuthor ");
        try {
            str = "Author";
            a=new Author(str);
            String str2 = a.getAuthor();
            assertTrue("- Test failed", str == str2);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

}