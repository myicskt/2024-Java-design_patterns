package org.factory.demo1;

public abstract class EnemyShip {


    private  String name;
    private Double damage;

    public abstract void specialpower();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDamage() {
        return damage;
    }

    public void setDamage(Double damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "EnemyShip{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                '}';
    }
}
