package org.example;

import lessonMaterials.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLesson
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springLesson.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName() + " " + musicPlayer.getVolume());
        context.close();
    }
}
