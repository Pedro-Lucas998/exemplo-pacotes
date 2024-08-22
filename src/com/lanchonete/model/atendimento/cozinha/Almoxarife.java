package com.lanchonete.model.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada(){
        System.out.println("Controlando entrada dos itens...");
    }

    private void controlarSaida(){
        System.out.println("Controlando saída dos itens...");
    }

    void entregarIngredientes(){ // default
        System.out.println("Entragando ingredientes...");
        controlarSaida();
    }

    void trocarGas(){
        System.out.println("Almoxarife trocando o gás...");
    }
}
