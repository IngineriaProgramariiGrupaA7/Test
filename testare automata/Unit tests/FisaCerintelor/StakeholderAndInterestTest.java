package FisaCerintelor;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by stfn-PC on 19-May-16.
 */
public class StakeholderAndInterestTest {
    StakeholderAndInterest s;
    String str;
    @Test
    public void setName() throws Exception {
        System.out.print("Testare setName ");
        try {
            str = "Nume";
            s= new StakeholderAndInterest();
            s.setName(str);
            assertTrue("- Test failed", s.getName() == str);
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
            str = "Nume";
            s=new StakeholderAndInterest();
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
    public void setInterest() throws Exception {
        System.out.print("Testare setInterest ");
        try {
            str = "Interes";
            s= new StakeholderAndInterest();
            s.setInterest(str);
            assertTrue("- Test failed", s.getInterest() == str);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void getInterest() throws Exception {
        System.out.print("Testare getInterest ");
        try {
            str = "Interes";
            s=new StakeholderAndInterest();
            s.setInterest(str);
            String str2 = s.getInterest();
            assertTrue("- Test failed", str == str2);
            System.out.println("- Testare incheiata");
        }
        catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }

}