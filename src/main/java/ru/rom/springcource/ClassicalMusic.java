package ru.rom.springcource;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    public void initMethod() {
        System.out.println("initMethod ClassicalMusic " + this.toString());
    }

    public static ClassicalMusic fabricMethod() {
        System.out.println("fabricMethod ClassicalMusic");
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "ClassicalMusic";
    }
}
