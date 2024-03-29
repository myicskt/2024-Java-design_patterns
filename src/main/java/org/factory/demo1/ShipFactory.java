package org.factory.demo1;

public class ShipFactory {


    public static EnemyShip MakeShip(String c){
        EnemyShip ship ;

        if(c.equals("R")){
            ship = new RocketEnemyShip();
        }else if(c.equals("U")) {
            ship = new UFOEnemyShip();

        }
    else if(c.equals("B")) {
        ship = new BlueRayShip();

    }else {
            throw new IllegalArgumentException("Only U/R/B is allowed for the choice");
        }
        return ship;
    }

}
