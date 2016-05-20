package com.ip.view2.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by genius on 5/20/2016.
 */
public class RelationTest {

    Relation testRelation= new Relation("testSource","testDestination","testType");
    @Test
    public void getSource() {
        assertNotNull(testRelation.getSource());
        assertEquals("testSource",testRelation.getSource());
        assertEquals("testSource1",testRelation.getSource());
    }

    @Test
    public void setSource() {
        assertEquals("testSource",testRelation.getSource());
        testRelation.setSource("testSource1");
        assertNotNull(testRelation.getSource());
        assertEquals("testSource1",testRelation.getSource());
        assertEquals("testSource",testRelation.getSource());
    }

    @Test
    public void getDestination() {
        assertNotNull(testRelation.getDestination());
        assertEquals("testDestination",testRelation.getDestination());
        assertEquals("testDestination1",testRelation.getDestination());
    }

    @Test
    public void setDestination() {
        assertEquals("testDestination",testRelation.getDestination());
        testRelation.setDestination("testDestion1");
        assertNotNull(testRelation.getDestination());
        assertEquals("testDestination1",testRelation.getDestination());
        assertEquals("testDestination",testRelation.getDestination());

    }

    @Test
    public void getType() {
        assertNotNull(testRelation.getType());
        assertEquals("testType",testRelation.getType());
        assertEquals("testType1",testRelation.getType());

    }

    @Test
    public void setType() {
        assertEquals("testType",testRelation.getType());
        testRelation.setType("testType1");
        assertNotNull(testRelation.getType());
        assertEquals("testType1",testRelation.getType());
        assertEquals("testType",testRelation.getType());

    }

}