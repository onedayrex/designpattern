package com.git.onedayrex.designpattern.prototype;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProtoTypeManagerTest {

    @Test
    public void getShape() {
        ProtoTypeManager protoTypeManager = new ProtoTypeManager();
        Shape circle = protoTypeManager.getShape("circle");
        Shape square = protoTypeManager.getShape("square");
        circle.countArea();
        square.countArea();
    }
}