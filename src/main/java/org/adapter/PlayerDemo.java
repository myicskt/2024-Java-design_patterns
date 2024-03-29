package org.adapter;

public class PlayerDemo {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "supertar.mp3");
        player.play("mp4", "filename.mp4");
        player.play("vlc", "vlcfile.vlc");
        player.play("avi", "alongme.avi");
    }


}
