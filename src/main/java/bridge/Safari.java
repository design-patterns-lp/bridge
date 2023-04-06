package bridge;

public class Safari extends Navegador{
    public Safari (Integer tempoBaseInicializacaoMilisegundos){
        super(tempoBaseInicializacaoMilisegundos);
    }

    public Integer calcularTempoTotalCarregamento(){
        return this.tempoBaseInicializacaoMilisegundos + this.motorBusca.tempoCarregamentoMilisegundos();
    }
}
