## Consigna

Implementar el patrón de diseño Adapter para permitir a la clase `AudioPlayer` reproducir archivos de audio de tipo MP3, WAV y OGG.

Los tests del archivo `AudioPlayerTest.java` deben pasar.

## Resolución

La resolución del ejercicio se planteó Considerando los "AdvancedMediaPlayer" como clases predefinidas, las cuales no podian modificarse.

En la resolucion se considero simplemente la creacion, e implementacion de las clases correspondientes, de una interface "AdvanceMediaPlayerAdapter" de forma que esta sea utilizada como un wrapper que sabe el metodo a llamar para cada reproductor especifico 