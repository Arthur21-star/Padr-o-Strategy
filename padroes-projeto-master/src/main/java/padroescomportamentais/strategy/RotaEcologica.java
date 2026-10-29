package padroescomportamentais.strategy;

public class RotaEcologica implements Rota {

    public float calcularTempo(float distanciaKm, float velocidadeMediaKmh) {
        return distanciaKm / velocidadeMediaKmh * 60 * 1.15f;
    }
}
