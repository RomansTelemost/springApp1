package ru.rom.springcource;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component("classicalMusicBean")
public class ClassicalMusic implements Music {

    private List<String> songs = new ArrayList<>();

    @PostConstruct
    public void doMyInit() {
        System.out.println("ClassicalMusic doMyInit");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("ClassicalMusic doMyDestroy");
    }

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
