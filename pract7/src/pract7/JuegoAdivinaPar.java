package pract7;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {

    public JuegoAdivinaPar(int numeroDeVidas, int numeroAAdivinar) {
        super(numeroDeVidas, numeroAAdivinar);

        if (!validaNumero(numeroAAdivinar)) {
            throw new IllegalArgumentException("El número debe ser par y entre 0 y 10.");
        }
    }

    @Override
    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10 && numero % 2 == 0) {
            return true;
        } else {
            System.out.println("Número inválido (debe ser par y entre 0 y 10).");
            return false;
        }
    }
}
