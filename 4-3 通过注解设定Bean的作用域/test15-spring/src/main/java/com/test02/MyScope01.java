package com.test02;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
@Component(value = "myScope01")
public class MyScope01 implements Scope {
    private Map<String, Object> map01 = new ConcurrentHashMap<String, Object>();
    private Map<String, Object> map02 = new ConcurrentHashMap<String, Object>();
    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        if(!map01.containsKey(name)){
            Object o = objectFactory.getObject();
            map01.put(name, o);
            return o;
        }
        if(!map02.containsKey(name)){
            Object o = objectFactory.getObject();
            map02.put(name, o);
            return o;
        }
        int i = new Random().nextInt(2);
        if(i == 0){
            return map01.get(name);
        }else {
            return map02.get(name);
        }
    }

    @Override
    public Object remove(String name) {
        if(map01.containsKey(name)){
            Object o = map01.get(name);
            map01.remove(name);
            return o;
        }
        if(map02.containsKey(name)){
            Object o = map02.get(name);
            map02.remove(name);
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
