package spring_introduction;

public class Person 
{
    private Pet pet;
    private String name;
    private int age = 0;

    public Person(Pet pet)
    {
        this.pet = pet;
    }

    public Person() {}
    
    public void dialogPetAndPerson()
    {
        System.out.println("salam my pet!");

        if (age > 0)
            System.out.println("мне " + age + " лет");
        if (name != null)
            System.out.println("Моё имя - " + name);

        pet.voice();
    }

    public void setPet(Pet pet)
    {
        this.pet = pet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
