package com.git.onedayrex.designpattern.prototype;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RealizeTypeTest {

    @Test
    public void clones() {
        RealizeType realizeType = new RealizeType();
        realizeType.setUserName("tom");
        realizeType.setAge(25);
        try {
            RealizeType realizeType1 = (RealizeType) realizeType.clone();
            Assert.assertFalse(realizeType==realizeType1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}