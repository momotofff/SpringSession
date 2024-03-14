package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.Person;
import spring_introduction.Pet;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("\n" + "-----next test-----" + "\n" + "Создание Pets из beans" + "\n");

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet3 = context.getBean("Pet1", Pet.class);
        pet3.voice();
        Pet pet4 = context.getBean("Pet2", Pet.class);
        pet4.voice();

        System.out.println("\n" + "-----next test-----" + "\n" + "Создание Person из beans с внедрением зависимости с помощью конструктора" + "\n");

        Person person1 = context.getBean("Person1", Person.class);
        person1.dialogPetAndPerson();

        System.out.println("\n" + "-----next test-----" + "\n" + "Создание Person из beans с внедрением зависимости с помощью сеттера" + "\n");

        Person person2 = context.getBean("Person2", Person.class);
        person2.dialogPetAndPerson();

        System.out.println("\n" + "-----next test-----" + "\n");

        Person person3 = context.getBean("Person3", Person.class);
        person3.dialogPetAndPerson();

        System.out.println("\n" + "-----next test-----" + "\n" + "Создание Person из beans с внедрением зависимости из properties файла" + "\n");

        Person person4 = context.getBean("Person4", Person.class);
        person4.dialogPetAndPerson();
    }
}
