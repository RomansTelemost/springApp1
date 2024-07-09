package ru.rom.springcource;

import org.springframework.stereotype.Component;

@Component("classMusicBean")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "ClassicalMusic";
    }
}
