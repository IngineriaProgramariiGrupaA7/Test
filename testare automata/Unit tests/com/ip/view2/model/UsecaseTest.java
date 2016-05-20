package com.ip.view2.model;

import com.sun.javafx.geom.Edge;
import org.junit.Test;
import org.omg.PortableInterceptor.USER_EXCEPTION;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by genius on 5/20/2016.
 */
public class UsecaseTest {

    Usecase testUsecase = new Usecase("blue");
    @Test
    public void addActor() {
        Actor testActor=new Actor();
        /*assertTrue(testUsecase.getActors().contains(testActor));*/
        testUsecase.addActor(testActor);
        assertNotNull(testUsecase.getActors());
        assertTrue(testUsecase.getActors().contains(testActor));
    }

    @Test
    public void addAction() {
        Action testAction=new Action();
        /*assertTrue(testUsecase.getActions().contains(testAction));*/
        testUsecase.addAction(testAction);
        assertNotNull(testUsecase.getActions());
        assertTrue(testUsecase.getActions().contains(testAction));

    }

    @Test
    public void getActors() {
        /*assertNull(testUsecase.getActors());*/
        Actor testActor = new Actor();
        List<Actor> testActors = new ArrayList<>();
        testActors.add(testActor);
        testUsecase.setActors(testActors);
        assertNotNull(testUsecase.getActors());
        assertTrue(testUsecase.getActors().contains(testActor));

    }

    @Test
    public void getActions() {
        /*assertNull(testUsecase.getActions());*/
        Action testAction = new Action();
        List<Action> testActions = new ArrayList<>();
        testActions.add(testAction);
        testUsecase.setActions(testActions);
        assertNotNull(testUsecase.getActions());
        assertTrue(testUsecase.getActions().contains(testAction));

    }

    @Test
    public void getEdges() {
        /*assertNull(testUsecase.getEdges());*/
        Relation testEdge = new Relation();
        List<Relation> testEdges = new ArrayList<>();
        testEdges.add(testEdge);
        testUsecase.setEdges(testEdges);
        assertNotNull(testUsecase.getEdges());
        assertTrue(testUsecase.getEdges().contains(testEdge));

    }

    @Test
    public void getColor() {
        /*assertNull(testUsecase.getColor());*/
        String testColor="brown";
        testUsecase.setColor(testColor);
        assertNotNull(testUsecase.getColor());
        assertTrue(testUsecase.getColor().contains(testColor));

    }

    @Test
    public void setColor() {
        String testColor="testColor";
        assertEquals("blue",testUsecase.getColor());
        testUsecase.setColor(testColor);
        assertNotNull(testUsecase.getColor());
        assertEquals(testUsecase.getColor(),"testColor");
        assertEquals(testUsecase.getColor(),"testColor1");

    }

    @Test
    public void setActors() {
        Actor testActor = new Actor();
        List<Actor> testActors = new ArrayList<>();
        testActors.add(testActor);
        testUsecase.setActors(testActors);
        assertNotNull(testUsecase.getActors());
        assertTrue(testUsecase.getActors().contains(testActor));
    }

    @Test
    public void setActions() {
        Action testAction = new Action();
        List<Action> testActions = new ArrayList<>();
        testActions.add(testAction);
        testUsecase.setActions(testActions);
        assertNotNull(testUsecase.getActions());
        assertTrue(testUsecase.getActions().contains(testAction));

    }

    @Test
    public void setEdges() {
        Relation testEdge = new Relation();
        List<Relation> testEdges = new ArrayList<>();
        testEdges.add(testEdge);
        testUsecase.setEdges(testEdges);
        assertNotNull(testUsecase.getEdges());
        assertTrue(testUsecase.getEdges().contains(testEdge));
    }

}