package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SafariTest {

    @Test
    void deveRetornarTempoInicializacaoSafariComBing() {
        MotorBusca motorBusca = new Bing();
        Navegador navegador = new Safari(1450);
        navegador.setMotorBusca(motorBusca);
        assertEquals(2450, navegador.calcularTempoTotalCarregamento());

    }

    @Test
    void deveRetornarTempoInicializacaoSafariComGoogle() {
        MotorBusca motorBusca = new Google();
        Navegador navegador = new Safari(1450);
        navegador.setMotorBusca(motorBusca);
        assertEquals(2350, navegador.calcularTempoTotalCarregamento());

    }

    @Test
    void deveRetornarTempoInicializacaoSafariComDuckDuckGo() {
        MotorBusca motorBusca = new DuckDuckGo();
        Navegador navegador = new Safari(1450);
        navegador.setMotorBusca(motorBusca);
        assertEquals(2400, navegador.calcularTempoTotalCarregamento());

    }
}
