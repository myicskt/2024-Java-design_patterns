package org.adapter;

public class MP4Player implements AdvanceMediaPlayer   {


    @Override
    public void playVlc(String file) {

    }

    @Override
    public void playMp4(String file) {
        System.out.println("MP4 player is playing "+file);

    }
}
