package org.example.music;

import org.example.music.MusicPlayerAutowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayerAutowired musicPlayerAutowired;

    @Autowired
    public Computer(MusicPlayerAutowired musicPlayerAutowired) {
        this.id = 1;
        this.musicPlayerAutowired = musicPlayerAutowired;
    }

    @Override
    public String toString() {
        return "Computer" + id + " " + musicPlayerAutowired.playMusic();
    }
}
