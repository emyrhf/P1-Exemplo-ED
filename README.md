# P1-Exemplo-ED

## 📌 Sobre o projeto
Simulação de um roteador de protocolos desenvolvido em Java, utilizando estruturas de dados clássicas para garantir uma saída equilibrada independentemente da ordem de entrada.

O sistema organiza protocolos por tipo e realiza a distribuição de saída de forma cíclica.

---

## 🧠 Conceito aplicado
O projeto utiliza:

- Lista Circular Dupla
- Filas (FIFO)
- Organização dinâmica por tipo de protocolo
- Percurso circular para balanceamento de saída

---

## ⚙️ Como funciona
- Cada tipo de protocolo é armazenado em um nó da lista
- Cada nó possui uma fila interna com seus dados
- A saída percorre os nós de forma circular
- Sempre que possível, um elemento é removido da fila atual antes de avançar

---

## 🧩 Estrutura do projeto
src/
- controller/
  - RoteadorController.java
- model/
  - estrutura/
    - ListaCircularDupla.java
    - FilaFifo.java
    - No.java
    - NoFifo.java
- view/
  - RoteadorView.java

---

## ▶️ Execução

Basta rodar a classe:
`RoteadorView.java`

---

## 💻 Tecnologias
- Java

---

## 🎯 Objetivo
Demonstrar na prática o uso de estruturas de dados encadeadas para resolver um problema de balanceamento e organização de dados.

---

## 👩‍💻 Autores

- [Emily Rharysa](https://github.com/emyrhf)
- [Vinícius Fernandes](https://github.com/vfs1210)
