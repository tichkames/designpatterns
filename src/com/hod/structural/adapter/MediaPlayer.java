package com.hod.structural.adapter;

//target
public interface MediaPlayer {
    void play(String audioType, String fileName);
}

class AudioPlayer implements MediaPlayer{
    @Override
    public void play(String audioType, String fileName){
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println(String.format("Playing audioType: %s, fileName: %s", audioType, fileName));
        }else{
            System.out.println("Invalid audioType");
        }
    }
}

//adaptee
interface AdvancedMediaPlayer{
    void loadFileName(String fileName);
    void listen();
}

//client
class VlcPlayer implements AdvancedMediaPlayer{
    private String fileName;

    public void loadFileName(String fileName){
        this.fileName = fileName;
        System.out.println(String.format("Setting fileName: %s", fileName));
    }

    public void listen(){
        if(fileName.substring(fileName.indexOf('.')+1).equalsIgnoreCase("vlc")) {
            System.out.println(String.format("Playing vlc %s", fileName));
        }else{
            System.out.println("Invalid audioType");
        }
    }
}

//client
class Mp4Player implements AdvancedMediaPlayer{
    private String fileName;

    public void loadFileName(String fileName){
        this.fileName = fileName;
        System.out.println(String.format("Setting fileName: %s", fileName));
    }

    public void listen(){
        if(fileName.substring(fileName.indexOf('.')+1).equalsIgnoreCase("mp4")) {
            System.out.println(String.format("Playing mp4 %s", fileName));
        }else{
            System.out.println("Invalid audioType");
        }
    }
}

//adapter
class AdvancedMediaPlayerAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMediaPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer){
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String audioType, String fileName){
        advancedMediaPlayer.loadFileName(fileName);
        advancedMediaPlayer.listen();
    }
}
