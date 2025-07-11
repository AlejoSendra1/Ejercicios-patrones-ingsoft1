package ingsoft.patrones.adapter.playerAdapter;

import ingsoft.patrones.adapter.Mp3Player;
import ingsoft.patrones.adapter.WavPlayer;

public class AdvanceWavPlayerAdapter implements AdvanceMediaPlayerAdapter {
    final WavPlayer wavPlayer= new WavPlayer();

    @Override
    public String play(String fileName) {
        return wavPlayer.playWav(fileName);
    }
}
