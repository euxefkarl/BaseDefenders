package entities;

import components.Components;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class EntityManager {
    
    private final Map<Integer, Entity> entities = new ConcurrentHashMap<>();
    private final AtomicInteger entity_id = new AtomicInteger(0);

    public Entity createEntity() {
        Entity new_entity = new Entity();
        int id = entity_id.getAndIncrement();
        entities.put(id, new_entity);
        return new_entity;
    }

    public void destroyEntity(int entity_id){
        entities.remove(entity_id);
    }

    public Map<Integer, Entity> getEntities(){
        return entities;
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


