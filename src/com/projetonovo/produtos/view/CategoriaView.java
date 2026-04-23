package com.projetonovo.produtos.view;

import com.projetonovo.produtos.model.Categoria;
import com.projetonovo.produtos.repository.CategoriaCollectionRepository;

import javax.swing.*;

public class CategoriaView {
    static CategoriaCollectionRepository repository;

    public static Categoria  select(Categoria categoria){
        // @formatter:off
        Categoria ret = (Categoria) JOptionPane.showInputDialog(null, //componente pai será null
                "Selecione uma categoria",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null, //icone
                repository.findAll().toArray(), //Número de opção
                categoria == null ? 1 : categoria);
        return ret;
        //@formatter:on
    }

    public void sucesso(){
        JOptionPane.showInputDialog(null, "Categoria salva com sucesso!");
    }

    public void sucesso(Categoria categoria){
        JOptionPane.showMessageDialog(null, "Categoria" + categoria.getNome() + "Categoria salva com sucesso!");
    }

    public static Categoria form(Categoria categoria){
        String nome = JOptionPane.showInputDialog(null, "Informe o nome da categoria",categoria!=null ? categoria.getNome(): "");
        return new Categoria(nome);
    }
}
