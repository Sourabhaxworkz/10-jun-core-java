package com.xworkz.spotifyapp;

import com.xworkz.spotifyapp.songs.Songs;
import com.xworkz.spotifyapp.spotify.Spotify;

public class SpotifyRunner {
    public static void main(String[] args) {
        System.out.println("main Started");
        Songs songs = new Songs();
        songs.songsName="Kavithe Kavithe";
        songs.artishName="Rajesh Krishnan";
        songs.albumName="Galipatta";

        Spotify spotify = new Spotify(songs);
        songs.songsDetails();
        System.out.println("Main ended");
    }
}
