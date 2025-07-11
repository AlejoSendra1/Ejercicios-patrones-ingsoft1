package ingsoft.patrones.adapter.playerAdapter;

import ingsoft.patrones.adapter.Mp3Player;

public class AdvanceMp3PlayerAdapter implements AdvanceMediaPlayerAdapter{
    final Mp3Player mp3Player= new Mp3Player();

    @Override
    public String play(String fileName) {
        return mp3Player.playMp3(fileName);
    }
}
