package lessonMaterials2;

import org.springframework.stereotype.Component;

@Component("rock")
public class RockMusic2 implements IMusic2 {
    @Override
    public String getSong() {
        return "Hard rock hallelujah";
    }
}
