package bridge;

public abstract class Navegador{
    protected MotorBusca motorBusca;
    protected Integer tempoBaseInicializacaoMilisegundos;

    public Navegador(Integer tempoBaseInicializacaoMilisegundos){
        this.tempoBaseInicializacaoMilisegundos = tempoBaseInicializacaoMilisegundos;
    }

    public void setMotorBusca(MotorBusca motorBusca){
        this.motorBusca = motorBusca;
    }

    public void setTempoBaseInicializacao(Integer tempoBaseInicializacaoMilisegundos){
        this.tempoBaseInicializacaoMilisegundos = tempoBaseInicializacaoMilisegundos;
    }

    public abstract Integer calcularTempoTotalCarregamento();
}