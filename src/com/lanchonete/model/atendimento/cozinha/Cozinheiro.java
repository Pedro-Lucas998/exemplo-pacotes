package com.lanchonete.model.atendimento.cozinha;

import com.lanchonete.model.atendimento.Atendente;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("Adicionando lanche natural hambuguer no balcão.");
    }

    public void adicionarSucoNoBalcao(){
        System.out.println("Adicionando suco no balcão");

    }

    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche(){
        System.out.println("Preparando lanche tipo hambuguer.");
    }

    private void prepararVitamina(){
        System.out.println("Preparando suco.");
    }

    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche(){
        System.out.println("Selecionando pão, salada, ovo e carne.");
    }

    private void selecionarIngredientesVitamina(){
        System.out.println("Selecionando fruta, leite e suco.");
    }

    private void lavarIngredientes(){
        System.out.println("Lavando ingredientes.");
    }

    private void baterVitaminaLiquidificador(){
        System.out.println("Batendo vitamina no liquidificador.");
    }

    public void fritarIngredientes(){
        System.out.println("Fritando a carne e ovo para o hambuguer.");
    }

//    public void pedirParaTrocarGas(Atendente meuAmigo){
//        meuAmigo.trocarGas();
//    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }

}
