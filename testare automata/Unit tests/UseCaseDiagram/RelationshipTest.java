package UseCaseDiagram;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by stfn-PC on 19-May-16.
 */
public class RelationshipTest {

    Relationship r;
    String str;

    @Test
    public void setType() throws Exception {
        System.out.print("Testare setType ");
        try{
            str="testType";
            r=new Relationship();
            r.setType(str);
            assertTrue("- Test failed", r.getType() == str);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void setFrom() throws Exception {
        System.out.print("Testare setFrom ");
        try{
            str="testFROM";
            r=new Relationship();
            r.setFrom(str);
            assertTrue("- Test failed", r.getFrom() == str);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void setTo() throws Exception {
        System.out.print("Testare setTo ");
        try{
            str="testTo";
            r=new Relationship();
            r.setTo(str);
            assertTrue("- Test failed", r.getTo() == str);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getType() throws Exception {
        System.out.print("Testare getType ");
        try {
            str = "TYPE";
            r=new Relationship();
            r.setType(str);
            String str2 = r.getType();
            assertTrue("- Test failed", str == str2);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getFrom() throws Exception {
        System.out.print("Testare getFrom ");
        try {
            str = "FROM";
            r=new Relationship();
            r.setFrom(str);
            String str2 = r.getFrom();
            assertTrue("- Test failed", str == str2);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getTo() throws Exception {
        System.out.print("Testare getTo ");
        try {
            str = "TestTo";
            r=new Relationship();
            r.setTo(str);
            String str2 = r.getTo();
            assertTrue("- Test failed", str == str2);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

}