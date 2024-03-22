package lessonMaterials2;

import org.springframework.stereotype.Component;

@Component("classical")
public class ClassicalMusic2 implements IMusic2
{
    @Override
    public String getSong()
    {
        return "Symphony №6";
    }

}
