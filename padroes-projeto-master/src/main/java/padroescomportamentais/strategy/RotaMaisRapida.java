package padroescomportamentais.strategy;

public class RotaMaisRapida implements Rota {

    public float calcularTempo(float distanciaKm, float velocidadeMediaKmh) {
        return distanciaKm / velocidadeMediaKmh * 60 * 0.8f;
    }
}
