package pract7;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;
    protected Scanner scanner = new Scanner(System.in);

    public JuegoAdivinaNumero(int numeroDeVidas, int numeroAAdivinar) {
        super(numeroDeVidas);
        this.numeroAAdivinar = numeroAAdivinar;
    }

    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }

    public void juega() {
        reiniciaPartida();
        System.out.println("Jugador visible, intenta adivinar el número entre 0 y 10:");

        while (true) {
            int intento = scanner.nextInt();

            if (!validaNumero(intento)) {
                System.out.println("Número fuera de rango. Intenta nuevamente.");
                continue;
            }

            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord();
                break;
            } else {
                if (quitaVida()) {
                    if (intento > numeroAAdivinar) {
                        System.out.println("Muy alto. Intenta de nuevo.");
                    } else {
                        System.out.println("Muy bajo. Intenta de nuevo.");
                    }
                } else {
                    System.out.println("¡Sin vidas! Fin del juego.");
                    break;
                }
            }
        }
    }
}
