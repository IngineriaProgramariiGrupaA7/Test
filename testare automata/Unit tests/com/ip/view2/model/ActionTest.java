package com.ip.view2.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by genius on 5/20/2016.
 */
public class ActionTest {

    Action testAction=new Action();
    @Test
    public void getDescription() {
        testAction.setDescription("testDescription");
        assertNotNull(testAction);
        assertEquals("testDescription",testAction.getDescription());
        assertEquals("testDescription1",testAction.getDescription());
    }

    @Test
    public void setDescription() {
        String testDescription="testDescription";
        testAction.setDescription(testDescription);
        assertNotNull(testAction);
        assertEquals("testDescription",testAction.getDescription());
        assertEquals("testDescription1",testAction.getDescription());
    }

    @Test
    public void getId() {
        testAction.setId("testId");
        assertNotNull(testAction.getId());
        assertEquals("testId",testAction.getId());
        assertEquals("testGroup",testAction.getId());

    }

    @Test
    public void setId() {
        testAction.setId("testId");
        assertNotNull(testAction.getId());
        assertEquals("testId",testAction.getId());
        assertEquals("testGroup",testAction.getId());

    }

}