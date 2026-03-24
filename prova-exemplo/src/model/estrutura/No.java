package model.estrutura;

public class No {
    private String type;
    private FilaFifo fila;
    private No anterior;
    private No proximo;
    
    public No(String type) {
        this.type = type;
        this.fila = new FilaFifo();
        this.anterior = null;
        this.proximo = null;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public FilaFifo getFila() {
        return fila;
    }
    
    public No getAnterior() {
        return anterior;
    }
    
    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
    
    public No getProximo() {
        return proximo;
    }
    
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    
    public String toString() {
        return type + ": " + fila.toString();
    }
}