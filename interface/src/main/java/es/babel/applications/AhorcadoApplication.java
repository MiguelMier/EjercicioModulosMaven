package es.babel.applications;

import es.babel.controller.AhorcadoController;
import org.springframework.stereotype.Component;

@Component
public class AhorcadoApplication {

    private AhorcadoController controller;

    public AhorcadoApplication(AhorcadoController controller) {
        this.controller = controller;
    }

    public void iniciarJuego(){
        controller.iniciar();
    }
}
