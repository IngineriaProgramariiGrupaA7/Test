package com.ip.view2.diagramgenerator;

import com.ip.view2.model.Action;
import com.ip.view2.model.Actor;
import com.ip.view2.model.Component;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by genius on 5/23/2016.
 */
public class NodeGeneratorTest {
    NodeGenerator testGenerator = new NodeGenerator();
    @Test
    public void generateNode() {
        Action testAction = new Action();
        Actor testActor = new Actor();
        testActor.setId("testId");
        testAction.setId("testId");
        testAction.setDescription("testDescription");
        String testNode1=testGenerator.generateNode(testAction);
        String testNode="{id: 'testId', label: 'testId', group:'actions', title: 'testDescription'}";
        assertEquals(testNode1,testNode);
        testNode1=testGenerator.generateNode(testActor);
        testNode="{id: 'testId', label: 'testId', group:'actors'}";
        assertEquals(testNode1,testNode);
    }

}

