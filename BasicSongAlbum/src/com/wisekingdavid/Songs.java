package com.wisekingdavid;

public class Songs {
    private String songName;
    private double songDuration;

    public Songs(String songName, double songDuration) {
        this.songName = songName;
        this.songDuration = songDuration;
    }

    public String getSongName() {
        return songName;
    }

    public double getSongDuration() {
        return songDuration;
    }

    @Override
    public String toString() {
        return songName + " : " + songDuration + " mins";
    }
}
