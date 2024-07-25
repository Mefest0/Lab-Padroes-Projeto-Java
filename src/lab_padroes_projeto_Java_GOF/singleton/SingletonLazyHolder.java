package lab_padroes_projeto_Java_GOF.singleton;

/**
 * Singleton de Lazy Holder.
 * @author SergioMB
 **/
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }
    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instancia;
    }
}
