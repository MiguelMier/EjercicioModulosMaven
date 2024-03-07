package es.babel.game;


public class AhorcadoGame {

    private final String palabras[] = {"JAVA", "SPRING", "ORDENADOR", "TECLADO", "CONTROLLER", "BABELGROUP"};

    private String palabraDescubrir;
    private StringBuilder palabraDescubierta;
    private int intentosRestantes;

    private final static int INTENTOS = 8;

    public AhorcadoGame() {
        palabraDescubrir = seleccionarPalabraAleatoria();
        palabraDescubierta = new StringBuilder("_".repeat(palabraDescubrir.length()));
        this.intentosRestantes = INTENTOS;
    }

    public void adivinarLetra(char letra){
        if(palabraDescubrir.contains(String.valueOf(letra))){
            for(int i=0;i < palabraDescubrir.length(); i++){
                if(palabraDescubrir.charAt(i) == letra){
                    palabraDescubierta.setCharAt(i, letra);
                }
            }
        }
        else{
            intentosRestantes--;
        }
    }

    public void adivinarPalabra(String palabra) {
        if (palabra.equalsIgnoreCase(palabraDescubrir)) {
            palabraDescubierta = new StringBuilder(palabraDescubrir);
        } else {
            intentosRestantes--;
        }
    }

    public boolean isJuegoGanado() {
        return palabraDescubierta.toString().equalsIgnoreCase(palabraDescubrir);
    }

    public boolean isJuegoTerminado() {
        return isJuegoGanado() || intentosRestantes == 0;
    }

    private String seleccionarPalabraAleatoria() {
        int indice = (int) (Math.random() * palabras.length);
        return palabras[indice];
    }

    public String getPalabraDescubrir() {
        return palabraDescubrir;
    }

    public StringBuilder getPalabraDescubierta() {
        return palabraDescubierta;
    }

    public int getIntentosRestantes() {
        return intentosRestantes;
    }
}
