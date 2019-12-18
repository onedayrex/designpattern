package com.git.onedayrex.designpattern.prototype;

/**
 * protoType原型模式，通过复制实例方式来创建新的实例，java中通过实现Cloneable接口来进行浅拷贝
 */
public class RealizeType implements Cloneable{
    private String userName;

    private int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
