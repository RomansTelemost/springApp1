package ru.rom.springcource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("classicalMusicBean")
public class ClassicalMusic implements Music {

    private List<String> songs = new ArrayList<>();

    public ClassicalMusic() {
        songs.add("class s 1");
        songs.add("class s 2");
        songs.add("class s 3");
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }

    @Override
    public String getSong() {
        return "ClassicalMusic";
    }
}
