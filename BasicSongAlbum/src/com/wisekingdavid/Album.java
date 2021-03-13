package com.wisekingdavid;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String albumName;
    ArrayList<Songs> songs;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songs = new ArrayList<Songs>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public ArrayList<Songs> getSongs() {
        return songs;
    }

    public void printSongsInAlbum(){
        System.out.println("*** Album Title: " + this.albumName + " ***");
        System.out.println("*** Songs ***");
        for(int i=0; i < this.songs.size(); i++){

            System.out.println((i+1) + ". Title: " + this.songs.get(i).getSongName() +
                    ". Duration: " + this.songs.get(i).getSongDuration());
        }
    }

    public boolean addNewSongToAlbum(String songName , double songDuration){
        if(findSong(songName) == null){
            this.songs.add(new Songs(songName, songDuration));
            return true;
        }return false;
    }


    public Songs returnSongFromAlbum(String songName){
        for(int i = 0; i < this.songs.size(); i++){
            if(findSong(songName) == null){
                return this.songs.get(i);
            }
        }return null;
    }


    public void addSong(String songName , double songDuration){
        int songPosition = querySongs(songName);
        if (songPosition >= 0){
            System.out.println(songName + " already exist in album");
        }
        else {
            this.songs.add(new Songs(songName, songDuration));
        }
    }

    public boolean deleteSongFromAlbum(String songName ){
        Songs songToDelete = findSong(songName);
        if(songToDelete == null){
            System.out.println(songName + " not in album");
            return false;
        }
        this.songs.remove(songToDelete);
        System.out.println(songName + " is deleted");
        return true;
    }

    public boolean editSongInAlbum(String oldSong, Songs newSong){
        int searchPosition = querySongs(oldSong);

        System.out.println("Name: " + searchPosition);

        if(searchPosition >= 0){

            this.songs.set(searchPosition, new Songs(newSong.getSongName(), newSong.getSongDuration()));
            System.out.println(oldSong + " is modified");
            return true;

        }

        System.out.println(oldSong + " not in album");
        return false;


    }

    public boolean addSongToPlaylist(String songName, List<Songs> playlist){
        Songs songExist = findSong(songName);
        if (songExist != null){
            playlist.add(songExist);
            return true;
        }
        System.out.println(songName + " not available in album");
        return false;
    }

    public boolean addSongToPlaylist(int trackNumber, List<Songs> playlist){
        int songIndex = trackNumber-1;
        if (songIndex >= 0  & songIndex <= this.songs.size()){
            playlist.add(this.songs.get(songIndex));
            return true;
        }
        System.out.println(trackNumber + " not available in album");
        return false;
    }

    public void searchSong(String songName){
        Songs songExist = findSong(songName);
        if(songExist == null){
            System.out.println(songName + " not in album");
        }
        else{
            System.out.println("*** Song is available in album ***");
            System.out.println("Title: " + songExist.getSongName() + ". Duration: " + songExist.getSongDuration());
        }
    }

    private int querySongs(String songName) {
        for(int i = 0; i < this.songs.size(); i++ ){
            if(this.songs.get(i).getSongName().equals(songName)){
                return i;
            }
        }return -1;
    }

    private Songs findSong(String songName) {
        for(int i = 0; i < this.songs.size(); i++ ){
            if(this.songs.get(i).getSongName().equals(songName)){
                return this.songs.get(i);
            }
        }return null;
    }


}
