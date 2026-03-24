package model.estrutura;

public class FilaFifo {
    private NoFifo inicio;
    private int tamanho;
    
    public FilaFifo() {
        this.inicio = null;
        this.tamanho = 0;
    }
    
    public void enqueue(String dados) {
        NoFifo novo = new NoFifo(dados);
        
        if (inicio == null) {
            inicio = novo;
        } else {
            NoFifo atual = inicio;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novo);
        }
        tamanho++;
    }
    
    public String dequeue() {
        if (inicio == null) {
            return null;
        }
        
        String dados = inicio.getDados();
        inicio = inicio.getProximo();
        tamanho--;
        return dados;
    }
    
    public boolean isEmpty() {
        return inicio == null;
    }
    
    public int getTamanho() {
        return tamanho;
    }
    
    public String toString() {
        if (inicio == null) {
            return "[]";
        }
        
        String resultado = "[";
        NoFifo atual = inicio;
        resultado = resultado + atual.getDados();
        
        while (atual.getProximo() != null) {
            resultado = resultado + ", ";
            atual = atual.getProximo();
            resultado = resultado + atual.getDados();
        }
        resultado = resultado + "]";
        return resultado;
    }
}