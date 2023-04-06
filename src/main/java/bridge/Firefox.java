package bridge;

public class Firefox extends Navegador {

    public Firefox (Integer tempoBaseInicializacaoMilisegundos){
        super(tempoBaseInicializacaoMilisegundos);
    }

    public Integer calcularTempoTotalCarregamento(){
        return this.tempoBaseInicializacaoMilisegundos + this.motorBusca.tempoCarregamentoMilisegundos();
    }
}
