package lessonMaterials;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer
{
    private List<Music> musics = new ArrayList<>();
    private String name;
    private int volume;
    public MusicPlayer()
    {
        System.out.println("Отработал конструктор по умолчанию");
    }

    public MusicPlayer(Music music)
    {
        System.out.println("Отработал конструктор с параметром");
        musics.add(music);
    }

    public void playMusic()
    {
        for (int i = 0; i < musics.size(); ++i)
        {
            System.out.println("Playing: " + musics.get(i).getSong());
        }
    }

    public void setMusics(List<Music> musicList) {
        this.musics = musicList;
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
    public void init()
    {
        System.out.println("Отработал медод Init");
    }

    private void destroy()
    {
        System.out.println("Отработал метод Destroy");
    }
}
