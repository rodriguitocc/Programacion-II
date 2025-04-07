package pract7;

public class Main {
    public static void main(String[] args) {
        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3, 7);   // Número fijo: 7
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3, 4);         // Número fijo: 4 (par)
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3, 5);     // Número fijo: 5 (impar)

        System.out.println("---- Juego 1 ----");
        juego1.juega();

        System.out.println("\n---- Juego Par ----");
        juego2.juega();

        System.out.println("\n---- Juego Impar ----");
        juego3.juega();
    }
}
