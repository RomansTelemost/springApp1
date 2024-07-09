package ru.rom.springcource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(Genre.CLASSICAL);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusicBean", ClassicalMusic.class);
        System.out.println(classicalMusic1.equals(classicalMusic2));
        context.close();
    }
}
