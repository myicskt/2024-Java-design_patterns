package org.factory.demo1;

public class RocketEnemyShip extends EnemyShip{

    public RocketEnemyShip(){
        setName("rocket");
        setDamage(100.00);
    }
    @Override
    public void specialpower() {

        System.out.println("ROcket enemy specific factionality.");
    }
}
