package pract7;
public class Juego {
    protected int numeroDeVidas;
    protected int record;

    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }

    public void reiniciaPartida() {
        System.out.println("Partida reiniciada.");
    }

    public void actualizaRecord() {
        record++;
        System.out.println("¡Nuevo récord! Record actual: " + record);
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        System.out.println("Vida perdida. Vidas restantes: " + numeroDeVidas);
        return numeroDeVidas > 0;
    }
}

