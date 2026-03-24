package view;

import controller.RoteadorController;

public class RoteadorView {
    
    public static void main(String[] args) {
        RoteadorController roteador = new RoteadorController();
        
        System.out.println("=== ROTEADOR DE PROTOCOLOS ===");
        System.out.println("Adicionando protocolos na sequência qualquer...");
        System.out.println();
        
        roteador.adicionarProtocolo("HTTP", "GET /index.html");
        roteador.adicionarProtocolo("FTP", "LIST");
        roteador.adicionarProtocolo("HTTP", "POST /api");
        roteador.adicionarProtocolo("SMTP", "HELO");
        roteador.adicionarProtocolo("HTTP", "GET /images");
        roteador.adicionarProtocolo("FTP", "RETR file.txt");
        roteador.adicionarProtocolo("DNS", "query google.com");
        roteador.adicionarProtocolo("SMTP", "MAIL FROM");
        
        System.out.println("=== ESTRUTURA ATUAL ===");
        System.out.println(roteador.getEstrutura());
        System.out.println();
        
        System.out.println("=== SAÍDA EQUILIBRADA ===");
        
        String saida;
        int contador = 1;
        
        while ((saida = roteador.obterProximaSaida()) != null) {
            System.out.println(contador + ": " + saida);
            contador++;
        }
        
        System.out.println();
        System.out.println("=== FIM ===");
        System.out.println("Estrutura final: " + roteador.getEstrutura());
    }
}