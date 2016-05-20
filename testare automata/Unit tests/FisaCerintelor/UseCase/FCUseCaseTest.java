package FisaCerintelor.UseCase;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by genius on 5/19/2016.
 */
public class FCUseCaseTest {
    FCUseCase test = new FCUseCase();
    @Test
    public void setTitle() {
        test.setTitle("test1");
       /* assertNull(test);*/
        assertEquals(test.title,"test1");
        test.setTitle("test1");
        assertNotNull(test);
        assertEquals(test.title,"test2");
    }

    @Test
    public void setObjectiveAndContext() {
        assertNotNull(test);
        test.setObjectiveAndContext("test1");
        assertEquals(test.objectiveAndContext,"test1");
        test.setObjectiveAndContext("test1");
        assertEquals(test.objectiveAndContext,"test2");

    }

    @Test
    public void setActors() {
        test.setActors(test.actors);
        assertNull(test);
        assertNotNull(test);
    }

    @Test
    public void setSteps() {
        test.setSteps(test.steps);
        assertNull(test);
        assertNotNull(test);
    }

    @Test
    public void setExtensions() {
        test.setExtensions(test.extensions);
        assertNull(test);
        assertNotNull(test);
    }

    @Test
    public void setRelationships() {
        test.setRelationships(test.relationships);
        assertNull(test);
        assertNotNull(test);
    }

    @Test
    public void getTitle() {
        test.setTitle("test1");
        assertNotNull(test);
        assertEquals(test.getTitle(),"test1");
        test.setTitle("test1");
        assertNotNull(test);
        assertEquals(test.getTitle(),"test2");
    }

    @Test
    public void getObjectiveAndContext() {
        test.setObjectiveAndContext("test1");
        assertNotNull(test);
        assertEquals(test.getObjectiveAndContext(),"test1");
        test.setObjectiveAndContext("test1");
        assertNotNull(test);
        assertEquals(test.getObjectiveAndContext(),"test2");
    }

    @Test
    public void getActors() {
        assertNull(test.actors);
        FCActor testActor = new FCActor();
        List<FCActor> testActors = new ArrayList<>();
        testActors.add(testActor);
        test.setActors(testActors);
        assertNotNull(test.actors);
        assertTrue(test.actors.contains(testActor));
    }

    @Test
    public void getSteps() {
        assertNull(test.steps);
        Step testStep = new Step();
        List<Step> testSteps = new ArrayList<>();
        testSteps.add(testStep);
        test.setSteps(testSteps);
        assertNotNull(test.steps);
        assertTrue(test.steps.contains(testStep));
    }

    @Test
    public void getExtensions() {
        assertNull(test.extensions);
        Extension testExtension = new Extension();
        List<Extension> testExtensions= new ArrayList<>();
        testExtensions.add(testExtension);
        test.setExtensions(testExtensions);
        assertNotNull(test.extensions);
        assertTrue(test.extensions.contains(testExtension));

    }

    @Test
    public void getRelationships() {
        assertNull(test.relationships);
        FCRelationship  testRelationship = new FCRelationship ();
        List<FCRelationship> testRelationships= new ArrayList<>();
        testRelationships.add(testRelationship);
        test.setRelationships(testRelationships);
        assertNotNull(test.relationships);
        assertTrue(test.relationships.contains(testRelationship));

    }

}