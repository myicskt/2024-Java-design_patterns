package org.template;

public class Tennis extends Game{
    @Override
    public void initialise() {
        System.out.println("Loading the configuration and setting for Tennis.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Finished loading the configuration of Tennis.");
    }

    @Override
    public void startPlay() {

        System.out.println("Starting to play Tennis application.");

    }

    @Override
    public void endPlay() {
        System.out.println("ending playing Tennis");

    }
}
