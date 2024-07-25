package lab_padroes_projeto_Java_GOF.singleton;

/**
 * Singleton de velocidade.
 * * author SergioMB
 */
public class SingletonFast {
    private static SingletonFast instancia = new SingletonFast();

    private SingletonFast(){
        super();
    }
    public static SingletonFast getInstance(){
        return instancia;
    }
}
