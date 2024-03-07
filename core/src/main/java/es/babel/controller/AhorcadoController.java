package es.babel.controller;


import es.babel.services.AhorcadoService;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class AhorcadoController {

    private AhorcadoService service;

    public void iniciar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al juego del ahorcado.");
        System.out.println("Desea jugar una nueva partida o salir?");
        System.out.println("1. Jugar");
        System.out.println("2. Salir");
        int numero = scanner.nextInt();
        if(numero == 1){
            iniciarJuego();
        }
        else{

        }
    }

    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);

        service = new AhorcadoService();

        while (service.getIntentosRestantes() > 0 && !service.isJuegoTerminado()) {
            System.out.println("Palabra: " + service.getPalabraDescubierta());
            System.out.println("Intentos restantes: " + service.getIntentosRestantes());

            System.out.print("Introduce una letra: ");
            String input = scanner.nextLine().trim().toUpperCase();

            if (input.length() == 1) {
                service.adivinarLetra(input.charAt(0));
            } else if (input.length() > 1) {
                service.adivinarPalabra(input);
            }
        }

        if (service.isJuegoGanado()) {
            System.out.println("¡Felicidades! Has ganado. La palabra es: " + service.getPalabraDescubierta());
        } else {
            System.out.println("Lo siento, has perdido. La palabra era: " + service.getPalabraDescubrir());
        }
    }
}