package ru.rom.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer() {
    }

    @Autowired
    public MusicPlayer(ClassicalMusic music1, RockMusic music2) {
        this.classicalMusic = music1;
        this.rockMusic = music2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic(Genre genre) {
        if (Genre.CLASSICAL.equals(genre)) {
            System.out.println(
                    classicalMusic.getSongs().get(
                            (int)Math.round(Math.random()*2)
                    )
            );
            return;
        }
        System.out.println(
                rockMusic.getSongs().get(
                        (int)Math.round(Math.random()*2)
                )
        );
    }
}
