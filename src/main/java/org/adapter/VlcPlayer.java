package org.adapter;

public class VlcPlayer implements AdvanceMediaPlayer{


    @Override
    public void playVlc(String file) {
        System.out.println("Vlc player plays: "+ file );
    }

    @Override
    public void playMp4(String file) {

    }
}
