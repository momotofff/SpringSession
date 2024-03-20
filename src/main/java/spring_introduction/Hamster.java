package spring_introduction;

public class Hamster implements Pet
{
    @Override
    public void voice()
    {
        System.out.println("piu piu");
    }

    public Hamster()
    {
        System.out.println("hamster bin is created");
    }

    public void init()
    {
        System.out.println("Hamster: init method");
    }

    private void destroy()
    {
        System.out.println("Hamster: destroy method");
    }
}
