package ingsoft.patrones.adapter;

public class Mp3Player implements AdvancedMediaPlayer {
  @Override
  public String playWav(String fileName) {
    return "Invalid media. " + " format not supported";
  }

  @Override
  public String playOgg(String fileName) {
    return "Invalid media. " + " format not supported";
  }

  @Override
  public String playMp3(String fileName) {
    return "Playing mp3 file. Name: " + fileName;
  }
}
