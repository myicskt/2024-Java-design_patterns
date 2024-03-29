package org.factory.demo1;

public class UFOEnemyShip extends EnemyShip{


    public UFOEnemyShip(){
        setName("UFO ship");
        setDamage(200.00);
    }
    @Override
    public void specialpower() {

        System.out.println("UFO specific functionality in the object.");

    }
}
