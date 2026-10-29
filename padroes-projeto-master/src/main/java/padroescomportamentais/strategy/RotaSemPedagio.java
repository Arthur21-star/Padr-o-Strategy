package padroescomportamentais.strategy;

public class RotaSemPedagio implements Rota {

    public float calcularTempo(float distanciaKm, float velocidadeMediaKmh) {
        return distanciaKm / velocidadeMediaKmh * 60 * 1.25f;
    }
}
