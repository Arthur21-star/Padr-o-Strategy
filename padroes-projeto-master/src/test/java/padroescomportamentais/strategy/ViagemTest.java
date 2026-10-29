package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ViagemTest {

    @Test
    void deveCalcularTempoRotaMaisRapida() {
        Viagem viagem = new Viagem();
        viagem.calcularRotaMaisRapida(120.0f, 60.0f);
        assertEquals(96.0f, viagem.getTempoEstimado(), 0.01f);
    }

    @Test
    void deveCalcularTempoRotaMaisCurta() {
        Viagem viagem = new Viagem();
        viagem.calcularRotaMaisCurta(120.0f, 60.0f);
        assertEquals(132.0f, viagem.getTempoEstimado(), 0.01f);
    }

    @Test
    void deveCalcularTempoRotaSemPedagio() {
        Viagem viagem = new Viagem();
        viagem.calcularRotaSemPedagio(120.0f, 60.0f);
        assertEquals(150.0f, viagem.getTempoEstimado(), 0.01f);
    }

    @Test
    void deveCalcularTempoRotaEcologica() {
        Viagem viagem = new Viagem();
        viagem.calcularRotaEcologica(120.0f, 60.0f);
        assertEquals(138.0f, viagem.getTempoEstimado(), 0.01f);
    }

    @Test
    void deveCalcularTempoRotaTransportePublico() {
        Viagem viagem = new Viagem();
        viagem.calcularRotaTransportePublico(120.0f, 60.0f);
        assertEquals(180.0f, viagem.getTempoEstimado(), 0.01f);
    }

    @Test
    void naoDeveCalcularRotaComVelocidadeZero() {
        try {
            Viagem viagem = new Viagem();
            viagem.calcularRotaMaisRapida(120.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Velocidade inválida", e.getMessage());
        }
    }

}