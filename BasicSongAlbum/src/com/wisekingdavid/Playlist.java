package com.wisekingdavid;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Playlist {
    private String playlistName;
    private LinkedList<Songs> songList;
    private ArrayList<Album> albums;


    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.songList = new LinkedList<Songs>();
        this.albums = new ArrayList<Album>();
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public LinkedList<Songs> getSongList() {
        return songList;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public boolean addAlbum(String album){
         if (findAlbum(album) == null){
             this.albums.add(new Album(album));
             return true;
         }
         return false;
    }

    public boolean addSongsToAlbum(String albumName, String songName, double songDuration){
        Album albumExist = findAlbum(albumName);
        if (albumExist != null){
            albumExist.addSong(songName, songDuration);
            return true;
        }return false;
    }

    public void listSongsInAlbum(){
            if (this.albums != null){
                for(int i = 0; i < this.albums.size(); i++) {
                    System.out.println("[" + (i + 1) + "] Album name: " + this.albums.get(i).getAlbumName());

                    ArrayList<Songs> songs = this.albums.get(i).getSongs();


                    System.out.println("*** Songs ***");
                    for (int j = 0; j < songs.size(); j++) {

                        System.out.println((j + 1) + ". " + songs.get(j).getSongName() + " -> " + songs.get(j).getSongDuration() + " mins");
                    }
                }
        }
        else {
                System.out.println("No album found");
            }
    }

    private String queryAlbumName(String albumName) {
        for (int i = 0; i < this.albums.size(); i++){
            if(this.albums.get(i).getAlbumName().equals(albumName)){
                return this.albums.get(i).getAlbumName();
            }
        }return null;
    }

    private int queryAlbumPosition(String albumName) {
        for (int i = 0; i < this.albums.size(); i++){
            if(this.albums.get(i).getAlbumName().equals(albumName)){
                return this.albums.indexOf(i);
            }
        }return -1;
    }

    private Album findAlbum(String albumName) {
        for (int i = 0; i < this.albums.size(); i++){
            if(this.albums.get(i).getAlbumName().equals(albumName)){
                return this.albums.get(i);
            }
        }return null;
    }


    public void showSongsInPlaylist(LinkedList<Songs> song){
        Iterator<Songs> songIterator = song.iterator();

        while(songIterator.hasNext()){
            System.out.println(songIterator.next());
        }
    }

}
