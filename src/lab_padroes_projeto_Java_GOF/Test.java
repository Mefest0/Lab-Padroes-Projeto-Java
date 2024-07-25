package lab_padroes_projeto_Java_GOF;

import lab_padroes_projeto_Java_GOF.facade.Facade;
import lab_padroes_projeto_Java_GOF.singleton.Singleton;
import lab_padroes_projeto_Java_GOF.singleton.SingletonFast;
import lab_padroes_projeto_Java_GOF.singleton.SingletonLazyHolder;
import lab_padroes_projeto_Java_GOF.strategy.*;

public class Test {
    public static void main(String[] args){

        //Teste relacionado ao DP Singleton:

        SingletonFast fast = SingletonFast.getInstance();
        System.out.println(fast);
        fast = SingletonFast.getInstance();
        System.out.println(fast);

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        singleton = Singleton.getInstance();
        System.out.println(singleton);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento natural = new ComportamentoNatural();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(natural);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Sergio", "31500000");
    }
}
