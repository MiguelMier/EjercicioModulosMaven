package es.babel;

import es.babel.applications.AhorcadoApplication;
import es.babel.configuration.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.StringUtils;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AhorcadoApplication ahorcado = context.getBean(AhorcadoApplication.class);
        ahorcado.iniciarJuego();

        /**
        String input = "hola, mundo!";
        String capitalized = StringUtils.capitalize(input);

        System.out.println("Original: " + input);
        System.out.println("Capitalized: " + capitalized);*/
    }
}