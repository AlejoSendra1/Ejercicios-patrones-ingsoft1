package ingsoft.patrones.adapter;

import ingsoft.patrones.adapter.playerAdapter.AdvanceMediaPlayerAdapter;
import ingsoft.patrones.adapter.playerAdapter.AdvanceMp3PlayerAdapter;
import ingsoft.patrones.adapter.playerAdapter.AdvanceOggPlayerAdapter;
import ingsoft.patrones.adapter.playerAdapter.AdvanceWavPlayerAdapter;

import java.util.HashMap;

public class AudioPlayer implements MediaPlayer {
  private HashMap<String,AdvanceMediaPlayerAdapter> filePlayers = new HashMap<>();

  public AudioPlayer(){
    filePlayers.put("ogg",new AdvanceOggPlayerAdapter());
    filePlayers.put("wav",new AdvanceWavPlayerAdapter());
    filePlayers.put("mp3",new AdvanceMp3PlayerAdapter());
  }

  @Override
  public String play(String audioType, String fileName) {

    AdvanceMediaPlayerAdapter playerToUse = filePlayers.get(audioType);
    if (playerToUse != null) {
      return playerToUse.play(fileName);
    } else {
      return "Invalid media. " + audioType + " format not supported";
    }
  }
}
