package Entities;

import Components.Components;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Entity {
    private final Map<Class<? extends Components>, Components> components = new ConcurrentHashMap<>();

    public <T extends Components> void addComponent(T comp){
        if(comp == null) throw new IllegalArgumentException("Component cannot be null");
        components.put(comp.getClass(), comp);
    }
    @SuppressWarnings("unchecked")
    public <T extends Components> T getComponent(Class<T> componentClass){
        return (T) components.get(componentClass);
    }
    public void removeComponent(Class<? extends Components> componentClass){
        components.remove(componentClass);
    }
    public boolean hasComponent(Class<? extends Components> componentClass){
        return components.containsKey(componentClass);
    }
}

