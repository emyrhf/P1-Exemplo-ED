package model.estrutura;

public class NoFifo {
    private String dados;
    private NoFifo proximo;
    
    public NoFifo(String dados) {
        this.dados = dados;
        this.proximo = null;
    }
    
    public String getDados() {
        return dados;
    }
    
    public void setDados(String dados) {
        this.dados = dados;
    }
    
    public NoFifo getProximo() {
        return proximo;
    }
    
    public void setProximo(NoFifo proximo) {
        this.proximo = proximo;
    }
    
    public String toString() {
        return dados;
    }
}