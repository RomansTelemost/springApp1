package ru.rom.springcourse;

import java.util.ArrayList;
import java.util.List;

//@Component
public class RockMusic implements Music {

    private List<String> songs = new ArrayList<>();

    public RockMusic() {
        songs.add("rock s 1");
        songs.add("rock s 2");
        songs.add("rock s 3");
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }

    @Override
    public String getSong() {
        return "RockMusic";
    }
}
