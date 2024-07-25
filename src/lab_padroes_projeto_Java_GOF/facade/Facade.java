package lab_padroes_projeto_Java_GOF.facade;

import lab_padroes_projeto_Java_GOF.subsistema1.crm.CrmService;
import lab_padroes_projeto_Java_GOF.subsistema2.crm.ApiCep;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = ApiCep.getInstance().recuperarCidade(cep);
        String estado = ApiCep.getInstance().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
