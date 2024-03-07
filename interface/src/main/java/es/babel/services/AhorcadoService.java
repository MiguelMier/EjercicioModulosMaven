package es.babel.services;

import es.babel.game.AhorcadoGame;
import org.springframework.stereotype.Service;

@Service
public class AhorcadoService implements IAhorcadoService{

    private AhorcadoGame ahorcadoGame;

    public AhorcadoService() {
        this.ahorcadoGame = new AhorcadoGame();
    }

    public void adivinarLetra(char letra) {
        ahorcadoGame.adivinarLetra(letra);
    }

    public void adivinarPalabra(String palabra) {
        ahorcadoGame.adivinarPalabra(palabra);
    }

    public boolean isJuegoGanado() {
        return ahorcadoGame.isJuegoGanado();
    }

    public boolean isJuegoTerminado() {
        return ahorcadoGame.isJuegoTerminado();
    }

    public String getPalabraDescubierta() {
        return ahorcadoGame.getPalabraDescubierta().toString();
    }

    public String getPalabraDescubrir(){
        return ahorcadoGame.getPalabraDescubrir();
    }

    public int getIntentosRestantes() {
        return ahorcadoGame.getIntentosRestantes();
    }

    public AhorcadoGame getAhorcadoGame() {
        return ahorcadoGame;
    }


}
