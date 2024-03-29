package org.factory.demo1;

public class BlueRayShip extends EnemyShip{

    public BlueRayShip(){
        setName("blue Ray");
        setDamage(250.00);
    }

    @Override
    public void specialpower() {
        System.out.println("BlueROck enemy specific factionality.");
    }
}
