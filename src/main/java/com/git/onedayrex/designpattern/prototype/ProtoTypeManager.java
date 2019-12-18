package com.git.onedayrex.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class ProtoTypeManager {
    private Map<String, Shape> map = new HashMap<>();

    public ProtoTypeManager() {
        map.put("circle", new Circle());
        map.put("square", new Square());
    }

    /**
     * 通过key获取对应的实例再进行复制
     * @param key
     * @return
     */
    public Shape getShape(String key) {
        Shape shape = map.get(key);
        if (shape == null) {
            return null;
        }
        return (Shape) shape.clone();
    }
}
