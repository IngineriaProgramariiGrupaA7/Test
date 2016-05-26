package ActivityDiagram;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by stfn-PC on 23-May-16.
 */
public class BlockTest {
    Block b;
    String str;
    List<Chain> c;
    @Test
    public void getType() throws Exception {
        System.out.print("Testare getType ");
        try {
            str = "Type";
            b=new Block();
            b.setType(str);
            String str2 = b.getType();
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
            str="test";
            b=new Block();
            b.setType(str);
            assertTrue("- Test failed", b.getType() == str);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getChainsCount() throws Exception {
        System.out.print("Testare getChainsCount ");
        try {
            b=new Block();
            Integer s=2;
            b.setChainsCount(s);
            Integer c = b.getChainsCount();
            assertTrue("- Test failed", s == c);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void setChainsCount() throws Exception {
        System.out.print("Testare setChainsCount ");
        try{
            b=new Block();
            Integer s=2;
            b.setChainsCount(s);
            assertTrue("- Test failed", b.getChainsCount() == s);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getChainsList() throws Exception {
        System.out.print("Testare getChainsList ");
        try {
            c=new ArrayList<>();
            c.add(new Chain());
            String str1="Request service";
            String str2="activity";
            String str3="Customer";
            String str11,str22,str33;
            List<Step> stepsList = new ArrayList<>();
            stepsList.add(new Step());
            stepsList.get(0).setType(str2);
            stepsList.get(0).setName(str1);
            stepsList.get(0).setBelongingNamespace(str3);
            c.get(0).setStepsList(stepsList);
            str11=c.get(0).getStepsList().get(0).getName();
            str22=c.get(0).getStepsList().get(0).getType();
            str33=c.get(0).getStepsList().get(0).getBelongingNamespace();
            assertTrue("- Test failed", str1 == str11 && str2==str22 && str3==str33);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void setChainsList() throws Exception {
        System.out.print("Testare setChainsList ");
        try {
            c=new ArrayList<>();
            c.add(new Chain());
            String str1="Request service";
            String str2="activity";
            String str3="Customer";
            List<Step> stepsList = new ArrayList<>();
            stepsList.add(new Step());
            stepsList.get(0).setType(str2);
            stepsList.get(0).setName(str1);
            stepsList.get(0).setBelongingNamespace(str3);
            c.get(0).setStepsList(stepsList);
            assertTrue("- Test failed", str1 == c.get(0).getStepsList().get(0).getName() && str2==c.get(0).getStepsList().get(0).getType() && str3==c.get(0).getStepsList().get(0).getBelongingNamespace());
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

}