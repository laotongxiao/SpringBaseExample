package com.test01;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 实现二例作用域模型
 */
public class MyScope implements Scope {
    private Map<String, Object> map1 = new ConcurrentHashMap<String, Object>();
    private Map<String, Object> map2 = new ConcurrentHashMap<String, Object>();
    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        if(!map1.containsKey(name)){
            Object o = objectFactory.getObject();
            map1.put(name, o);
            return o;
        }
        if(!map2.containsKey(name)){
            Object o = objectFactory.getObject();
            map2.put(name, o);
            return o;
        }
        int i = new Random().nextInt(2);
        if(i == 0){
            return map1.get(name);
        }else {
            return map2.get(name);
        }
    }

    @Override
    public Object remove(String name) {
        if(map1.containsKey(name)){
            Object o = map1.get(name);
            map1.remove(name);
            return o;
        }
        if(map2.containsKey(name)){
            Object o = map2.get(name);
            map2.remove(name);
            return o;
        }
        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
