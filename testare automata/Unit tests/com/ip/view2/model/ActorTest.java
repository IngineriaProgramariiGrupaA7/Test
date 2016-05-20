package com.ip.view2.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by genius on 5/20/2016.
 */
public class ActorTest {

    Actor testActor=new Actor("testId","testGroup");
    @Test
    public void getId() {
        assertNotNull(testActor.getId());
        assertEquals("testId",testActor.getId());
        assertEquals("testGroup",testActor.getId());
    }

    @Test
    public void setId() {
        testActor.setId("testId1");
        assertNotNull(testActor.getId());
        assertEquals("testId1",testActor.getId());
        assertEquals("testGroup",testActor.getId());
    }

}