package com.projetonovo.produtos.view;

import javax.swing.*;

public class OpcaoView {
    public static Opcao select(){
        Opcao ret = (Opcao) JOptionPane.showInputDialog(
                null, //Componente pai, como não tenho será null
                "Selecione uma opção",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null, //icone
                Opcao.values(), //número da opção
                Opcao.CADASTRAR_PRODUTO);

        return ret != null ? ret : Opcao.ENCERRAR_SISTEMA;
    }
}
