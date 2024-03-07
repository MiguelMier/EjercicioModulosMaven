package es.babel;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AhorcadoApplication ahorcado = context.getBean(AhorcadoApplication.class);
        ahorcado.iniciarJuego();

    }
}
