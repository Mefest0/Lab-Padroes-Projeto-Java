package lab_padroes_projeto_Java_GOF.singleton;

/**
 * Singleton de introdução.
 * * author SergioMB
 */
public class Singleton {
    private static Singleton instancia;

    private Singleton(){
        super();
    }
    public static Singleton getInstance(){
        if (instancia == null){
            instancia = new Singleton();
        }
        return instancia;
    }
}
