package ActivityDiagram;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by stfn-PC on 23-May-16.
 */
public class ChainTest {
    Chain c;
    List<Step> s;
    @Test
    public void getStepsList() throws Exception {
        System.out.print("Testare getStepsList ");
        try {
            s=new ArrayList<>();
            s.add(new Step());
            String str1="Request service";
            String str2="activity";
            String str3="Customer";
            s.get(0).setName(str1);
            s.get(0).setType(str2);
            s.get(0).setBelongingNamespace(str3);
            String str11 = s.get(0).getName();
            String str22 = s.get(0).getType();
            String str33 = s.get(0).getBelongingNamespace();
            assertTrue("- Test failed", str1 == str11 && str2==str22 && str3==str33);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void setStepsList() throws Exception {
        System.out.print("Testare setStepsList ");
        try {
            s=new ArrayList<>();
            s.add(new Step());
            String str1="Request service";
            String str2="activity";
            String str3="Customer";
            s.get(0).setName(str1);
            s.get(0).setType(str2);
            s.get(0).setBelongingNamespace(str3);
            assertTrue("- Test failed", str1 == s.get(0).getName() && str2==s.get(0).getType() && str3==s.get(0).getBelongingNamespace());
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

}