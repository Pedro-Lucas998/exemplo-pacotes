package com.lanchonete.model;

import com.lanchonete.model.area.cliente.Cliente;
import com.lanchonete.model.atendimento.Atendente;
import com.lanchonete.model.atendimento.cozinha.Almoxarife;
import com.lanchonete.model.atendimento.cozinha.Cozinheiro;

public class Estabelecimento  {


    // Interage com todas as outras classes que representam objetos
    // com as suas respectivas ações
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        // Ações que não precisam estarem disponíveis para toda a aplicação

//        cozinheiro.lavarIngredientes();
//        cozinheiro.baterVitaminaLiquidificador();
//        cozinheiro.selecionarIngredientesVitamina();
//        cozinheiro.prepararLanche();
//        cozinheiro.prepararVitamina();
//        cozinheiro.prepararCombo();

        // Ações que o estabelecimento precisa ter ciência:
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        // Ações que não precisam está disponíveis para toda a aplicação
        //Almoxarife almoxarife = new Almoxarife();
//        almoxarife.controlarEntrada();
//        almoxarife.controlarSaida();
        // Ações que somente o seu pacote cozinha precisa conhecer (default)
//        almoxarife.entregarIngredientes();
//        almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        //atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        // Ações que somente o seu pacote cozinha precisa conhecer (default)
        //atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        // Não deveria, mas o estabelecimento ainda não definiu regras de atendimento.
        //cliente.pegarPedidoBalcao();

        // Essa ação é muito sigilosa, por isso precisa ser private.
        //cliente.consultarSaldoAplicativo();

        // Já pensou os clientes ouvindo que o gás acabou?
//        cozinheiro.pedirIngredientes(almoxarife);
//        cozinheiro.pedirParaTrocarGas(atendente);

    }


}
