package es.babel.services;

public interface IAhorcadoService {

    void adivinarLetra(char letra);
    void adivinarPalabra(String palabra);
    boolean isJuegoGanado();
    boolean isJuegoTerminado();
    String getPalabraDescubierta();
    String getPalabraDescubrir();
    int getIntentosRestantes();
}
