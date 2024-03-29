package org.facede;

public class SmartHOmeFacade {



    private Lighting lighting;
    private  MusicSystem musicSystem;
    private Temprature temprature;


    public SmartHOmeFacade(Lighting lig, MusicSystem mus, Temprature tem){
        this.lighting=lig;
        this.musicSystem= mus;
        this.temprature= tem;
    }

    public void startEveningRoutine(){
        lighting.turnOn();
        musicSystem.playmusic();
        temprature.setTemp(22);

    }


    public void stopEveningRoutine(){
        lighting.turnOff();
        musicSystem.stopmusic();


    }

}
