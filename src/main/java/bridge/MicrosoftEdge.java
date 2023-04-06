package bridge;

public class MicrosoftEdge extends Navegador {
    public MicrosoftEdge (Integer tempoBaseInicializacaoMilisegundos){
        super(tempoBaseInicializacaoMilisegundos);
    }

    public Integer calcularTempoTotalCarregamento(){
        return this.tempoBaseInicializacaoMilisegundos + this.motorBusca.tempoCarregamentoMilisegundos();
    }
}