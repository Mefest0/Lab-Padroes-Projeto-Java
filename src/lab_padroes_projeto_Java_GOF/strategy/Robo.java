package lab_padroes_projeto_Java_GOF.strategy;

public class Robo {
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }
    public void mover(){
        comportamento.mover();
    }
}
