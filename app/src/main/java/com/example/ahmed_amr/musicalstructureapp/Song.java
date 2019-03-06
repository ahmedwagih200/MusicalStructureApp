package com.example.ahmed_amr.musicalstructureapp;

public class Song {

    private String Song ;

    public String getSongSize() {
        return songSize;
    }

    private String songSize;

    public Song(String song,String size)
    {
        Song = song ;
        songSize =size;
    }

    public String getSong() {
        return Song;
    }

}
