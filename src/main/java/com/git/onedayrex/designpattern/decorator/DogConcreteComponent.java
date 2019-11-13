package com.git.onedayrex.designpattern.decorator;

/**
 * 实际构建角色实现
 */
public class DogConcreteComponent extends AnimalComponent{
    @Override
    public void function() {
        System.out.println("sprk");
    }
}
