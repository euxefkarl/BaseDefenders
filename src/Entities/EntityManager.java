package Entities;

import Components.Components;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class EntityManager {
    
    private final Map<Integer, Entity> entities = new ConcurrentHashMap<>();
    private final AtomicInteger entity_id = new AtomicInteger(0);

    public int createEntity(Entity entity) {
        int id = entity_id.getAndIncrement();
        entities.put(id, entity);
        return id;
    }

    public void destroyEntity(int entity_id){
        entities.remove(entity_id);
    }

    public <T extends Components> void addComponent(int entity_id, T component){
        Entity entity = entities.get(entity_id);
        if(entity != null){
            entity.addComponent(component);
        }
        else{
            throw new IllegalArgumentException("Entity with ID " + entity_id + " does not exist.");
        }
    }
}


