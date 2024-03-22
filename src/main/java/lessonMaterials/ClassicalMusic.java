package lessonMaterials;

public class ClassicalMusic implements Music
{
    private ClassicalMusic()
    {
    }

    public ClassicalMusic getClassicalMusic()
    {
        return new ClassicalMusic();
    }

    //public ClassicalMusic() {}

    @Override
    public String getSong()
    {
        return "Symphony №6";
    }
}
