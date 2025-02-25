package ru.rom.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

//@Configuration
//@ComponentScan("ru.rom.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public PopMusic popMusic() {
        return new PopMusic();
    }

    @Bean
    public List<Music> musicList() {
        List<Music> musicList = new ArrayList<>();
        musicList.add(classicalMusic());
        musicList.add(rockMusic());
        musicList.add(popMusic());
        return musicList;
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

}
