package controller;

import model.estrutura.ListaCircularDupla;

public class RoteadorController {
    
    private ListaCircularDupla lista;
    
    public RoteadorController() {
        this.lista = new ListaCircularDupla();
    }
    
    public void adicionarProtocolo(String type, String dados) {
        lista.adicionarProtocolo(type, dados);
    }
    
    public String obterProximaSaida() {
        return lista.obterProximaSaida();
    }
    
    public String getEstrutura() {
        return lista.toString();
    }
    
    public boolean estaVazia() {
        return lista.isEmpty();
    }
}