package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirefoxTest {

    @Test
    void deveRetornarTempoInicializacaoFirefoxComBing(){
        MotorBusca motorBusca = new Bing();
        Navegador navegador = new Firefox(1500);
        navegador.setMotorBusca(motorBusca);
        assertEquals(2500, navegador.calcularTempoTotalCarregamento());

    }

    @Test
    void deveRetornarTempoInicializacaoFirefoxComGoogle(){
        MotorBusca motorBusca = new Google();
        Navegador navegador = new Firefox(1500);
        navegador.setMotorBusca(motorBusca);
        assertEquals(2400, navegador.calcularTempoTotalCarregamento());

    }

    @Test
    void deveRetornarTempoInicializacaoFirefoxComDuckDuckGo(){
        MotorBusca motorBusca = new DuckDuckGo();
        Navegador navegador = new Firefox(1500);
        navegador.setMotorBusca(motorBusca);
        assertEquals(2450, navegador.calcularTempoTotalCarregamento());

    }
}