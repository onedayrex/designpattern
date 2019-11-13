package com.git.onedayrex.designpattern.decorator;

/**
 * 装饰者抽象类，主要有一个抽象实例
 */
public abstract class AnimalDecorator extends AnimalComponent{
    private AnimalComponent animalComponent;


    public AnimalDecorator(AnimalComponent animalComponent) {
        this.animalComponent = animalComponent;
    }

    @Override
    public void function() {
        this.animalComponent.function();
    }
}
