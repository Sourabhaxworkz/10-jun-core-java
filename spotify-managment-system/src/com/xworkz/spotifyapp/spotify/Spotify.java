package com.xworkz.spotifyapp.spotify;

import com.xworkz.spotifyapp.songs.Songs;

public class Spotify {
    Songs songs;
    public Spotify(Songs songs){
        System.out.println("Spotify Constructor is invoked");
        System.out.println("Number of Parameters :1");
        System.out.println("Type of Parameters:Song type");
    }

    public void openSongs(){
        System.out.println("Song Details");
        if(songs!=null)
            this.songs.songsDetails();
        else System.out.println("No Songs found");
        System.out.println("end of Songs Details");
    }
}
