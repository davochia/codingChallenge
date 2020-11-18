package com.wisekingdavid;

public class Song {
    private String songName;
    private double songDuration;

    public Song(String songName, double songDuration) {
        this.songName = songName;
        this.songDuration = songDuration;
    }

    public String getSongName() {
        return songName;
    }

    public double getSongDuration() {
        return songDuration;
    }

    public Song createSong(String songName, double songDuration){
        return new Song(songName, songDuration);
    }
}
