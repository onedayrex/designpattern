package com.git.onedayrex.designpattern.strategy.service;

import com.git.onedayrex.designpattern.strategy.impl.Dark;
import com.git.onedayrex.designpattern.strategy.impl.Dog;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    @Test
    public void bark() {
        Animal dark = new Dark();
        Animal dog = new Dog();
        Assert.assertEquals(dark.bark(),"ga");
        Assert.assertEquals(dog.bark(),"wang");
    }

}