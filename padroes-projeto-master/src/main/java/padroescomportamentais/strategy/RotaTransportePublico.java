package padroescomportamentais.strategy;

public class RotaTransportePublico implements Rota {

    public float calcularTempo(float distanciaKm, float velocidadeMediaKmh) {
        return distanciaKm / velocidadeMediaKmh * 60 * 1.5f;
    }
}
