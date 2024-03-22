package lessonMaterials2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("player")
public class MusicPlayer2
{
    @Autowired
    @Qualifier("rock")
    private List<IMusic2> musics = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer2()
    {
        System.out.println("Отработал конструктор по умолчанию : MusicPlayer2");
    }

    //@Autowired
    public MusicPlayer2(IMusic2 music)
    {
        System.out.println("Отработал конструктор с параметром : MusicPlayer2");
        musics.add(music);
    }

    public void playMusic()
    {
        for (int i = 0; i < musics.size(); ++i)
        {
            System.out.println("Playing: " + musics.get(i).getSong());
        }
    }

    public void setMusics(List<IMusic2> musicList) {
        this.musics = musicList;
    }

    //@Autowired
    public void setMusic(IMusic2 iMusic2) {
        this.musics.add(iMusic2);
    }

    public List getMusics()
    {
        return musics;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private void init()
    {
        System.out.println("Отработал медод Init");
    }

    private void destroy()
    {
        System.out.println("Отработал метод Destroy");
    }
}
