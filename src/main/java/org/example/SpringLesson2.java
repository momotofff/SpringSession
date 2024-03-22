package org.example;

import lessonMaterials2.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLesson2
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springLesson2.xml");
        MusicPlayer2 musicPlayer2 = context.getBean("player", MusicPlayer2.class);
        musicPlayer2.playMusic();
        context.close();
        System.out.println();

        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("springLesson2.xml");

        Computer computer = context1.getBean("pc", Computer.class);
        System.out.println(computer.toString());


    }
}
