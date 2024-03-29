package org.factory.demo1;

import java.util.EmptyStackException;
import java.util.Scanner;

public class EnemyShipLauncher {
    public static void main(String[] args) {

        EnemyShip ship ;
        String input;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the U or R");
        input =sc.nextLine().toUpperCase();

        ship=ShipFactory.MakeShip(input);
        ship.specialpower();
        sc.close();

    }
}
