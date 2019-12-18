package com.git.onedayrex.designpattern.prototype;

public class Circle implements Shape{
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void countArea() {
        int r = 2;
        System.out.println("圆的面积为：" + r * r * 3.14159);
    }
}
