package org.example;

import org.example.music.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "ApplicationContextAnnotation.xml");


        Music musicBean = context.getBean("someRockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(musicBean);
        musicPlayer.playMusic();

//        Music musicBean2 = context.getBean("rapMusic", RapMusic.class);
//        MusicPlayer musicPlayer2 = new MusicPlayer(musicBean2);
//        musicPlayer2.playMusic();

        System.out.println("----------------------------");
//
//        MusicPlayerAutowired musicPlayerAutowired = context.getBean("musicPlayerAutowired", MusicPlayerAutowired.class);
//        musicPlayerAutowired.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
