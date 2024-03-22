package lessonMaterials2;

import lessonMaterials.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("pc")
public class Computer
{
    private int id;
    private MusicPlayer2 musicPlayer2;

    @Autowired
    public Computer(MusicPlayer2 musicPlayer2)
    {
        this.id = 1;
        this.musicPlayer2 = musicPlayer2;

        System.out.println("Отработал конструктор с параметром : Computer");
    }

    @Override
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder("Computer id: " + id + " ");
        musicPlayer2.playMusic();

        return  stringBuilder.toString();
    }
}
