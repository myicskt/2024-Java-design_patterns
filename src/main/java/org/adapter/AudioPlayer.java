package org.adapter;

public class AudioPlayer implements MediaPlayer{


    @Override
    public void play(String audioType, String file) {
        MediaAdapter mediaAdapter;

        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("play mp3 audio");
        }else if (audioType.equalsIgnoreCase("mp4")||audioType.equalsIgnoreCase("VLC")){
          mediaAdapter = new MediaAdapter(audioType);
          mediaAdapter.play(audioType,file);
        }else {
            System.out.println("invalid file format not supported by player : " +audioType);
        }

    }
}
