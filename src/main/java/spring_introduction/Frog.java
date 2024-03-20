package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("frogBean")
@Scope("prototype")
public class Frog implements Pet
{
    public Frog()
    {
        System.out.println("Frog : bean is created");
    }

    @Override
    public void voice()
    {
        System.out.println("Kwa Kwa");
    }

    public void init()
    {
        System.out.println("Frog: init method");
    }

    private void destroy()
    {
        System.out.println("Frog: destroy method");
    }
}
