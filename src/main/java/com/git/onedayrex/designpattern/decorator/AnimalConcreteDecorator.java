package com.git.onedayrex.designpattern.decorator;

/**
 * 具体装饰实现
 */
public class AnimalConcreteDecorator extends AnimalDecorator{

    public AnimalConcreteDecorator(AnimalComponent animalComponent) {
        super(animalComponent);
    }

    @Override
    public void function() {
        System.out.println("eat");
        super.function();
    }
}
