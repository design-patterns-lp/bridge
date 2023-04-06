package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MicrosoftEdgeTest {

    @Test
    void deveRetornarTempoInicializacaoMicrosoftEdgeComBing() {
        MotorBusca motorBusca = new Bing();
        Navegador navegador = new MicrosoftEdge(1400);
        navegador.setMotorBusca(motorBusca);
        assertEquals(2400, navegador.calcularTempoTotalCarregamento());

    }

    @Test
    void deveRetornarTempoInicializacaoMicrosoftEdgeComGoogle() {
        MotorBusca motorBusca = new Google();
        Navegador navegador = new MicrosoftEdge(1400);
        navegador.setMotorBusca(motorBusca);
        assertEquals(2300, navegador.calcularTempoTotalCarregamento());

    }

    @Test
    void deveRetornarTempoInicializacaoMicrosoftEdgeComDuckDuckGo() {
        MotorBusca motorBusca = new DuckDuckGo();
        Navegador navegador = new MicrosoftEdge(1400);
        navegador.setMotorBusca(motorBusca);
        assertEquals(2350, navegador.calcularTempoTotalCarregamento());

    }
}
