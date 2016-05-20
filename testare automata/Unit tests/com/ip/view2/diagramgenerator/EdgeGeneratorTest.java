package com.ip.view2.diagramgenerator;

import com.ip.view2.model.Relation;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by genius on 5/23/2016.
 */
public class EdgeGeneratorTest {
    EdgeGenerator testGenerator = new EdgeGenerator();
    Relation testRelation= new Relation();

    @Test
    public void generateEdge() throws Exception {
        String testColor="testColor";
        testRelation.setSource("testSource");
        testRelation.setDestination("testDestination");
        testRelation.setType("association");
        String testEdge="{from: 'testSource', to: 'testDestination', color: 'testColor'}";
        String testGenerate=testGenerator.generateEdge(testRelation,testColor);
        assertEquals(testEdge,testGenerate);
        testRelation.setType("uniassociation");
        testEdge="{from: 'testSource', to: 'testDestination', color: 'testColor', arrows: {to: true}}";
        testGenerate=testGenerator.generateEdge(testRelation,testColor);
        assertEquals(testEdge,testGenerate);
        testRelation.setType("generalization");
        testEdge="{from: 'testSource', to: 'testDestination', color: 'testColor', arrows: {empty: true, to: true}}";
        testGenerate=testGenerator.generateEdge(testRelation,testColor);
        assertEquals(testEdge,testGenerate);
        testRelation.setType("include");
        testEdge="{from: 'testSource', to: 'testDestination', color: 'testColor', label: '<<include>>', dashes: true, arrows: {to: true}}";
        testGenerate=testGenerator.generateEdge(testRelation,testColor);
        assertEquals(testEdge,testGenerate);
        testRelation.setType("extend");
        testEdge="{from: 'testSource', to: 'testDestination', color: 'testColor', label: '<<extend>>', dashes: true, arrows: {to: true}}";
        testGenerate=testGenerator.generateEdge(testRelation,testColor);
        assertEquals(testEdge,testGenerate);


    }

}