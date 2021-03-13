package com.wisekingdavid;

import java.util.*;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static List<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("HipHop");
        album.addSong("sad day", 2.3);
        album.addSong("my lover", 3.04);
        album.addSong( "it's on you", 4.55);
        album.addSong( "Yesterday dream", 4.1);
        album.addSong( "good friday", 4.2);
        album.addSong("sunny day", 5.3);
        albums.add(album);

        /////////////////////////////////////////////////////////////////////

        album = new Album("Blues");
        album.addSong("what a day", 6.3);
        album.addSong("lovely day", 4.04);
        album.addSong("it's with you", 4.55);
        album.addSong("New day for us", 4.1);
        album.addSong("just another day", 4.2);
        albums.add(album);


         List<Songs> playlist = new ArrayList<Songs>();

        albums.get(0).addSongToPlaylist(3, playlist);
        albums.get(1).addSongToPlaylist(2, playlist);
        albums.get(1).addSongToPlaylist(5, playlist);
        albums.get(0).addSongToPlaylist(6, playlist);
        albums.get(0).addSongToPlaylist(1, playlist);
        albums.get(1).addSongToPlaylist(4, playlist);

        playPlaylist(playlist);
    }

    private static void playPlaylist(List<Songs> playlist) {
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<Songs> playlistIterator = playlist.listIterator();
        if (playlist.size() > 0){

            System.out.println("Now playing " + playlistIterator.next().toString());
            printControls();

        }else {
            System.out.println("Playlist is empty");
        }

        while (!quit){
            System.out.println("Enter control number: ");
            int todo = scan.nextInt();
            scan.nextLine();

            switch (todo){
                case 0:
                    System.out.println("Closing playlist...");
                    quit = true;
                    break;

                case 1:
                    if (!goingForward) {
                        if (playlistIterator.hasNext()) {
                            playlistIterator.next();
                        }
                        goingForward = true;
                    }

                    if (playlistIterator.hasNext()){
                        System.out.println("Now playing " + playlistIterator.next().toString());
                    }else {
                        System.out.println("End of songs in playlist");
                        goingForward = false;
                    }
                    break;

                case 2:

                    if (goingForward) {
                        if (playlistIterator.hasPrevious()) {
                            playlistIterator.previous();
                        }
                        goingForward = true;
                    }

                    if (playlistIterator.hasPrevious()){
                        System.out.println("Now playing " + playlistIterator.previous().toString());
                    }else {
                        System.out.println("Start of songs in playlist");
                        goingForward = true;
                    }
                    break;

                case 3:
                    if (goingForward) {
                        if (playlistIterator.hasPrevious()) {
                            System.out.println("Now playing " + playlistIterator.previous().toString());
                            goingForward = false;
                        }else {
                            System.out.println("Start of songs in playlist");
                        }
                    }

                    if (playlistIterator.hasNext()){
                        System.out.println("Now playing " + playlistIterator.next().toString());
                        goingForward = true;
                    }else {
                        System.out.println("End of songs in playlist");

                    }
                    break;

                case 4:
                    if (playlist.size() > 0){
                        playlistIterator.remove();

                        if (playlistIterator.hasNext()){
                            System.out.println("Now playing " + playlistIterator.next().toString());
                        }else if (playlistIterator.hasPrevious()){
                            System.out.println("Now playing " + playlistIterator.previous().toString());
                        }
                    }

                    break;

                case 5:
                    printSongsInPlaylist(playlist);
                    break;

                case 6:
                    printControls();
                    break;

            }
        }
    }

    private static void printSongsInPlaylist(List<Songs> playlist) {

        for (Songs songs : playlist) {

            System.out.println(songs.toString());

        }
    }

    private static void printControls() {
        System.out.println();
        System.out.println("Enter #0 to exit playlist");
        System.out.println("Enter #1 to play next song");
        System.out.println("Enter #2 to play previous song");
        System.out.println("Enter #3 to replay current song");
        System.out.println("Enter #4 to delete current song");
        System.out.println("Enter #5 to print songs in playlist");
        System.out.println("Enter #6 to show control option");
    }
}
