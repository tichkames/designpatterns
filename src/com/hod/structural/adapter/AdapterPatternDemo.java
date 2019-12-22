package com.hod.structural.adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        MediaPlayer mp = new AudioPlayer();

        mp.play("mp3", "macheso.mp3");

        mp = new AdvancedMediaPlayerAdapter(new Mp4Player());
        mp.play("mp4", "ammara.mp4");

        mp = new AdvancedMediaPlayerAdapter(new VlcPlayer());
        mp.play("mkv", "joker.mkv");
    }
}
