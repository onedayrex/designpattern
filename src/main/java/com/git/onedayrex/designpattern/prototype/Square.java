package com.git.onedayrex.designpattern.prototype;

public class Square implements Shape{
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
        int a = 2;
        System.out.println("正方形的面积为：" + a * a);
    }
}
