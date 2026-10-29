package padroescomportamentais.strategy;

public class Viagem {

    private float tempoEstimado;

    public float getTempoEstimado() {
        return tempoEstimado;
    }

    public void calcularRotaMaisRapida(float distanciaKm, float velocidadeMediaKmh) {
        Navegador navegador = new Navegador(distanciaKm, velocidadeMediaKmh);
        this.tempoEstimado = navegador.calcularTempo(new RotaMaisRapida());
    }

    public void calcularRotaMaisCurta(float distanciaKm, float velocidadeMediaKmh) {
        Navegador navegador = new Navegador(distanciaKm, velocidadeMediaKmh);
        this.tempoEstimado = navegador.calcularTempo(new RotaMaisCurta());
    }

    public void calcularRotaSemPedagio(float distanciaKm, float velocidadeMediaKmh) {
        Navegador navegador = new Navegador(distanciaKm, velocidadeMediaKmh);
        this.tempoEstimado = navegador.calcularTempo(new RotaSemPedagio());
    }

    public void calcularRotaEcologica(float distanciaKm, float velocidadeMediaKmh) {
        Navegador navegador = new Navegador(distanciaKm, velocidadeMediaKmh);
        this.tempoEstimado = navegador.calcularTempo(new RotaEcologica());
    }

    public void calcularRotaTransportePublico(float distanciaKm, float velocidadeMediaKmh) {
        Navegador navegador = new Navegador(distanciaKm, velocidadeMediaKmh);
        this.tempoEstimado = navegador.calcularTempo(new RotaTransportePublico());
    }

}
