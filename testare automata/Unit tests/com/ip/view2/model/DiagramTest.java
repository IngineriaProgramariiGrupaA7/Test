package com.ip.view2.model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by genius on 5/20/2016.
 */
public class DiagramTest {

    Diagram testDiagram=new Diagram();
    @Test
    public void getUsecases() {
        assertNotNull(testDiagram.getUsecases());
        Usecase testUsecase= new Usecase();
        List<Usecase> testUsecases = new ArrayList<>();
        testUsecases.add(testUsecase);
        testDiagram.setUsecases(testUsecases);
        assertNotNull(testDiagram.getUsecases());
        assertEquals(testUsecases,testDiagram.getUsecases());
    }

    @Test
    public void setUsecases() {
        Usecase testUsecase= new Usecase();
        List<Usecase> testUsecases = new ArrayList<>();
        testUsecases.add(testUsecase);
        testDiagram.setUsecases(testUsecases);
        assertNotNull(testDiagram.getUsecases());
        assertTrue(testDiagram.getUsecases().contains(testUsecase));

    }


    @Test
    public void getRandomColor() {
        String testColor;
        testColor=testDiagram.getRandomColor();
        assertTrue(testDiagram.colors.contains(testColor));
        /** Acces la lista de culori + color.remove(index) modifica lista statica */
    }

}