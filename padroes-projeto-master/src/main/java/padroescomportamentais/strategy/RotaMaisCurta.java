package padroescomportamentais.strategy;

public class RotaMaisCurta implements Rota {

    public float calcularTempo(float distanciaKm, float velocidadeMediaKmh) {
        return distanciaKm / velocidadeMediaKmh * 60 * 1.1f;
    }
}
