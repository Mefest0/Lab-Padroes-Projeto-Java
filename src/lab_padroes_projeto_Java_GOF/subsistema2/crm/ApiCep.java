package lab_padroes_projeto_Java_GOF.subsistema2.crm;

import lab_padroes_projeto_Java_GOF.singleton.SingletonFast;

public class ApiCep {
    private static ApiCep instancia = new ApiCep();

    private ApiCep(){
        super();
    }
    public static ApiCep getInstance(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Belo Horizonte";
    }
    public String recuperarEstado(String cep){
        return "MG";
    }
}
