package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.Frog;
import spring_introduction.Hamster;


public class Test2
{
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Hamster hamster = context.getBean("Pet", Hamster.class);
        hamster.voice();
        Hamster hamster1 = context.getBean("Pet", Hamster.class);
        hamster1.voice();

        context.close();

        System.out.println("\n" + "-----next test-----" + "\n" + "Создание Frog из Annotation" + "\n");

        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Frog frog1 = context1.getBean("frogBean", Frog.class);
        Frog frog2 = context1.getBean("frogBean", Frog.class);
        System.out.println(frog1 == frog2);
        frog1.voice();
        context1.close();


    }
}
