package com.company.introduction_to_oop.hm1;

import java.util.Arrays;

public class Radiostation {

    String name;
    int frequency;
    String format;
    String[] songs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String[] getSongs() {
        return songs;
    }

    public void setSongs(String[] songs) {
        this.songs = songs;
    }

    public void playSong() {
        System.out.println("playSong");
    }

    public void onAir() {
        System.out.println("onAir");
    }

    public void startAd() {
        System.out.println("startAd");
    }

    public void addSong(String song) {
        for (int i = 0; i < this.songs.length; i++) {
            if (songs[i] == null) {
                songs[i] = song;
                return;
            }
        }
        System.out.println("Unable to add song, no space left");
    }

    public static void main(String[] args) {
        Radiostation radiostation = new Radiostation();
        radiostation.setSongs(new String[10]);
        radiostation.setFrequency(10);
        radiostation.setFormat("pop");
        radiostation.setName("nrj");
        radiostation.onAir();
        radiostation.startAd();
        radiostation.playSong();
        radiostation.addSong("song1");
        radiostation.addSong("song2");
        System.out.println(Arrays.toString(radiostation.songs));
        for (String s : radiostation.songs) {
            radiostation.addSong("song");
        }
        System.out.println(Arrays.toString(radiostation.songs));
    }
}
