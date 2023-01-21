package org.example.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayerAutowired {

    private RapMusic rapMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayerAutowired(RapMusic rapMusic, RockMusic rockMusic) {
        this.rapMusic = rapMusic;
        this.rockMusic = rockMusic;
    }


    public String playMusic() {
        return "playing: " + rapMusic.getSong();
    }

}
