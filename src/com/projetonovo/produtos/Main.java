package com.projetonovo.produtos;

import com.projetonovo.produtos.model.Categoria;
import com.projetonovo.produtos.model.Produto;
import com.projetonovo.produtos.repository.CategoriaCollectionRepository;
import com.projetonovo.produtos.repository.ProdutoCollectionRepository;
import com.projetonovo.produtos.view.CategoriaView;
import com.projetonovo.produtos.view.Opcao;
import com.projetonovo.produtos.view.OpcaoView;
import com.projetonovo.produtos.view.ProdutoView;

import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Opcao opcao = null;

        do {
            opcao = OpcaoView.select();
            switch (opcao){
                case CADASTRAR_CATEGORIA -> cadastrarCategoria();
                case CADASTRAR_PRODUTO -> cadastrarProduto();
                case CONSULTAR_PRODUTO_POR_ID -> consultarProdutoPorId();
                case ALTERAR_PRODUTO -> alterarProduto();
                case CONSULTAR_PRODUTO_POR_CATEGORIA -> consultarProdutoPorCategoria(   );
                case ENCERRAR_SISTEMA -> encerrarSistema();
            }

        }while (opcao != Opcao.ENCERRAR_SISTEMA);




    }

    private static void alterarProduto() {
        Produto produto = ProdutoView.select(null);
        ProdutoView.update(produto);
    }

    private static void cadastrarCategoria() {
        CategoriaView view = new CategoriaView();
        Categoria categoria = view.form(new Categoria());
        CategoriaCollectionRepository.save(categoria);
        view.sucesso(categoria);

    }
    private static void cadastrarProduto() {
        Produto produto = ProdutoView.form(new Produto());
        ProdutoCollectionRepository.save(produto);
        ProdutoView.sucesso(produto);
    }
    private static void consultarProdutoPorId () {
        Produto selecionado = ProdutoView.select(null);

        Produto produto = ProdutoCollectionRepository.findById(selecionado.getId());

        if (produto == null){
            JOptionPane.showMessageDialog(null, "Nenhum produto localizado com esse ID: " + selecionado.getId());
        }else{
            ProdutoView.show(produto);
            System.out.println(produto);
        }

    }
    private static void consultarProdutoPorCategoria(){
        Categoria categoria = CategoriaView.select(null);

        List<Produto> produtos = ProdutoCollectionRepository.findByCategoria(categoria);

        if (produtos.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhum produto localizado com essa categoria: " + categoria.getNome());
        }else{
            produtos.forEach(ProdutoView::show);
            produtos.forEach(System.out::println);
        }
    }

    private static void encerrarSistema() {
        System.exit(0);
    }

}
