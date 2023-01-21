package org.example.music;

import org.springframework.stereotype.Component;

@Component("someRockMusic")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "This is Rock";
    }
}
