package com.git.onedayrex.designpattern.prototype;

/**
 * 原型管理模式，通过原型管理器，来get到对应的拷贝对象
 */
public interface Shape extends Cloneable{

    public Object clone();

    public void countArea();
}
