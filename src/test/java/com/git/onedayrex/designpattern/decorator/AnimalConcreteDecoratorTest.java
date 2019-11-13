package com.git.onedayrex.designpattern.decorator;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalConcreteDecoratorTest {

    @Test
    public void function() {
        DogConcreteComponent dogConcreteComponent = new DogConcreteComponent();
        AnimalConcreteDecorator animalConcreteDecorator = new AnimalConcreteDecorator(dogConcreteComponent);
        animalConcreteDecorator.function();
    }
}