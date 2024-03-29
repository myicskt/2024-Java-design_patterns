package org.adapter;

public class MediaAdapter  implements  MediaPlayer{


    AdvanceMediaPlayer advanceMediaPlayer;

    public  MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("Vlc")){
            advanceMediaPlayer= new VlcPlayer();
        }else if(audioType.equalsIgnoreCase("MP4")){
            advanceMediaPlayer= new MP4Player();

        }

    }


    @Override
    public void play(String audioType, String file) {
        if(audioType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer.playMp4(file);
        }else if (audioType.equalsIgnoreCase("Vlc")){

            advanceMediaPlayer.playVlc(file);
        }

    }
}
