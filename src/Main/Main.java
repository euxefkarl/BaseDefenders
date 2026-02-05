package main;

import entities.Entity;
import entities.EntityManager;

public class Main {
    public static void main(String[] args) {
        EntityManager em = new EntityManager();
        Entity demo = em.createEntity();
        demo.addComponent(new components.Position(10, 10));
        demo.addComponent(new components.Sprite("/res/orc_down1"));
        System.out.println("Entity created with components Position x: " + em.getComponent(em.getEntityId(demo), components.Position.class).x) ;
        System.out.println("Entity created with components Sprite: " + em.getComponent(em.getEntityId(demo), components.Sprite.class).isLoaded());
    }
}
