package org.template;

public class Soccer extends Game{
    @Override
    public void initialise() {
        System.out.println("Loading the configuration and setting for soccer.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Finished loading the configuration of soccer.");
    }

    @Override
    public void startPlay() {

        System.out.println("Starting to play soccer application.");

    }

    @Override
    public void endPlay() {
        System.out.println("ending playing soccer");

    }
}
