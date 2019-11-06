package com.git.onedayrex.designpattern.strategy.impl;

import com.git.onedayrex.designpattern.strategy.service.Animal;

/**
 * 具体策略角色实现
 * 狗
 */
public class Dog implements Animal {
    @Override
    public String bark() {
        return "wang";
    }
}
