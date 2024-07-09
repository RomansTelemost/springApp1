package ru.rom.springcourse;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

//@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    private List<Music> musicList;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

//    public MusicPlayer() {
//    }

//    @Autowired
//    public MusicPlayer(ClassicalMusic music1, RockMusic music2) {
//        this.classicalMusic = music1;
//        this.rockMusic = music2;
//    }


    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
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

    public void playMusic() {
        System.out.println(
                musicList.get((int) Math.round(Math.random() * (musicList.size() - 1))
                )
        );
    }
}
