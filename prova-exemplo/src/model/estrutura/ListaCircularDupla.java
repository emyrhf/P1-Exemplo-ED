package model.estrutura;

public class ListaCircularDupla {
    
    private No ultimo;
    private int tamanho;
    
    public ListaCircularDupla() {
        this.ultimo = null;
        this.tamanho = 0;
    }
    
    public No buscarPorType(String type) {
        if (ultimo == null) {
            return null;
        }
        
        No atual = ultimo.getProximo();
        No inicio = atual;
        
        do {
            if (atual.getType().equals(type)) {
                return atual;
            }
            atual = atual.getProximo();
        } while (atual != inicio);
        
        return null;
    }
    
    public void adicionarProtocolo(String type, String dados) {
        String typeMaiusculo = type.toUpperCase();
        
        No noExistente = buscarPorType(typeMaiusculo);
        
        if (noExistente == null) {
            No novoNo = new No(typeMaiusculo);
            novoNo.getFila().enqueue(dados);
            
            if (ultimo == null) {
                novoNo.setProximo(novoNo);
                novoNo.setAnterior(novoNo);
                ultimo = novoNo;
            } else {
                No primeiro = ultimo.getProximo();
                No anteriorPrimeiro = primeiro.getAnterior();
                
                anteriorPrimeiro.setProximo(novoNo);
                novoNo.setAnterior(anteriorPrimeiro);
                novoNo.setProximo(primeiro);
                primeiro.setAnterior(novoNo);
                
                ultimo = novoNo;
            }
            tamanho++;
        } else {
            noExistente.getFila().enqueue(dados);
        }
    }
    
    public String obterProximaSaida() {
        if (ultimo == null) {
            return null;
        }
        
        No atual = ultimo.getProximo();
        No inicio = atual;
        
        do {
            if (!atual.getFila().isEmpty()) {
                String dados = atual.getFila().dequeue();
                ultimo = atual;
                return dados;
            }
            atual = atual.getProximo();
        } while (atual != inicio);
        
        return null;
    }
    
    public int getTamanho() {
        return tamanho;
    }
    
    public boolean isEmpty() {
        return ultimo == null;
    }
    
    public String toString() {
        if (ultimo == null) {
            return "[]";
        }
        
        String resultado = "[";
        No atual = ultimo.getProximo();
        No inicio = atual;
        
        resultado = resultado + atual.toString();
        atual = atual.getProximo();
        
        while (atual != inicio) {
            resultado = resultado + ", ";
            resultado = resultado + atual.toString();
            atual = atual.getProximo();
        }
        resultado = resultado + "]";
        return resultado;
    }
}