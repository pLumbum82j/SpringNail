package org.example.music;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "This is Rap";
    }
}
