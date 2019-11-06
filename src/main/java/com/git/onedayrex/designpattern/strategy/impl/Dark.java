package com.git.onedayrex.designpattern.strategy.impl;

import com.git.onedayrex.designpattern.strategy.service.Animal;

/**
 * 具体策略角色实现
 * 鸭子
 */
public class Dark implements Animal {

    @Override
    public String bark() {
        return "ga";
    }
}
