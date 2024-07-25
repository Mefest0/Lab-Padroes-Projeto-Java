package lab_padroes_projeto_Java_GOF.strategy;

public class ComportamentoNatural implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }
}
