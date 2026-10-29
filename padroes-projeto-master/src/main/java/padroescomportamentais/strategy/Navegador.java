package padroescomportamentais.strategy;

public class Navegador {

    private float distanciaKm;
    private float velocidadeMediaKmh;

    public Navegador(float distanciaKm, float velocidadeMediaKmh) {
        this.distanciaKm = distanciaKm;
        this.velocidadeMediaKmh = velocidadeMediaKmh;
    }

    public float calcularTempo(Rota rota) {
        if (velocidadeMediaKmh <= 0) {
            throw new IllegalArgumentException("Velocidade inválida");
        }
        return rota.calcularTempo(distanciaKm, velocidadeMediaKmh);
    }
}
