package lessonMaterials2;

import org.springframework.stereotype.Component;

@Component("pop")
public class PopMusic2 implements IMusic2
{
    @Override
    public String getSong() {
        return "Toxic";
    }
}
