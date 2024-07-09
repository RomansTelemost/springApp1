package ru.rom.springcource;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "RockMusic";
    }
}
