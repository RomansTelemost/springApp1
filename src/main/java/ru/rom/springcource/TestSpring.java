package ru.rom.springcource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

//        ClassicalMusic classicalMusic = context.getBean("classMusicBean", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());
//
//        RockMusic rockMusic = context.getBean("rockMusic", RockMusic.class);
//        System.out.println(rockMusic.getSong());

        context.close();
    }
}
