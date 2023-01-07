package org.example;

import org.example.music.ClassicalMusic;
import org.example.music.JazzMusic;
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

        MusicPlayer musicPlayer6 = context.getBean("musicPlayer4", MusicPlayer.class);
        musicPlayer6.setVolume(12);
        System.out.println(musicPlayer4.getVolume());
        System.out.println(musicPlayer6.getVolume());

        ClassicalMusic classicalMusic = context.getBean("musicBeanInitAdnDestroy", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        ClassicalMusic classicalMusic2 = context.getBean("musicBeanTestInitMethodScopePrototype", ClassicalMusic.class);
        ClassicalMusic classicalMusic3 = context.getBean("musicBeanTestInitMethodScopePrototype", ClassicalMusic.class);

        JazzMusic jazzMusic = context.getBean("musicBeanFactoryMethod", JazzMusic.class);
        System.out.println(jazzMusic.getSong());

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
