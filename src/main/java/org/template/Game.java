package org.template;

public abstract class Game {

    public  abstract void initialise();
    public abstract void  startPlay();
    public abstract void endPlay();


//template
    public final void play(){
        initialise();
        startPlay();
        endPlay();

    }
}
