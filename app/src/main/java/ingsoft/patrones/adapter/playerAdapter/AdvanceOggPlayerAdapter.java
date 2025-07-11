package ingsoft.patrones.adapter.playerAdapter;

import ingsoft.patrones.adapter.OggPlayer;

public class AdvanceOggPlayerAdapter implements AdvanceMediaPlayerAdapter{
    final OggPlayer oggPlayer= new OggPlayer();

    @Override
    public String play(String fileName) {
        return oggPlayer.playOgg(fileName);
    }
}
