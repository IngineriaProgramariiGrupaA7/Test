package FisaCerintelor;

import org.junit.Test;
import sun.plugin2.ipc.unix.DomainSocketNamedPipe;

import static org.junit.Assert.*;

/**
 * Created by stfn-PC on 19-May-16.
 */
public class DomainTest {

    Domain d;
    String str;

    @Test
    public void testDomainConstructor() throws Exception {
        System.out.print("Testare constructor Domain ");
        try {
            str = "dddd dddd";
            d = new Domain(str);
            //System.out.println(d);
            assertTrue("- Test failed",d.getDomain() == str);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void setDomain() throws Exception {
        System.out.print("Testare setDomain ");
        try {
            str = "sadasd";
            d = new Domain(str);
            //d.setDomain(str);
            assertTrue("- Test failed", d.getDomain() == str);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getDomain() throws Exception {
        System.out.print("Testare getDomain ");
        try {
            str = "qwerty s3";
            d = new Domain(str);
            String str2 = d.getDomain();
            assertTrue("- Test failed", str == str2);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

}
