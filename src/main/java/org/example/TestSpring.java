package org.example;

import org.example.music.Music;
import org.example.music.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "ApplicationContext.xml");

        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());

        Music musicBean = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(musicBean);
        musicPlayer.playMusic();

        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer2.playMusic();

        MusicPlayer musicPlayer3 = context.getBean("musicPlayer3", MusicPlayer.class);
        musicPlayer3.playMusic();
        System.out.println(musicPlayer3.getName());
        System.out.println(musicPlayer3.getVolume());

        MusicPlayer musicPlayer4 = context.getBean("musicPlayer4", MusicPlayer.class);
        musicPlayer4.playMusic();
        System.out.println(musicPlayer4.getName());
        System.out.println(musicPlayer4.getVolume());
        context.close();

        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext(
                "ApplicationContextMusicArrayList.xml");
        MusicPlayer musicPlayer5 = context2.getBean("musicPlayerArrayList", MusicPlayer.class);
        musicPlayer5.playMusicList();
        System.out.println(musicPlayer5.getName());
        System.out.println(musicPlayer5.getVolume());

        context.close();
    }
}
