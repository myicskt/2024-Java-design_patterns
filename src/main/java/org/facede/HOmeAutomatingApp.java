package org.facede;

public class HOmeAutomatingApp {
    public static void main(String[] args) throws InterruptedException {


    Lighting light = new Lighting();
    MusicSystem music = new MusicSystem();
    Temprature temp = new Temprature();

    SmartHOmeFacade system = new SmartHOmeFacade(light, music, temp);


    system.startEveningRoutine();
    Thread.sleep(1000);

    system.stopEveningRoutine();
    }



}
