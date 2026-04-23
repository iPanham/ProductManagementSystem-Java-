package com.projetonovo.produtos.repository;

import com.projetonovo.produtos.model.Categoria;
import com.projetonovo.produtos.model.Produto;

import javax.swing.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Vector;

import static com.projetonovo.produtos.repository.CategoriaCollectionRepository.save;

public class ProdutoCollectionRepository {
    private static List<Produto> produtos;

    static {
        produtos = new Vector<>();
        Produto celular = new Produto();
        celular.setNome("Iphone 17 Pro Max")
                .setDescricao("Dispositivo móvel")
                .setCategoria(CategoriaCollectionRepository.findById(2L))
                .setDataDeCadastro(LocalDateTime.now())
                .setPreco(BigDecimal.valueOf(14000));



    }

    public static List<Produto> findAll(){
        return produtos;
    }

    public static Produto save(Produto produto) {
        if(!produtos.contains(produto)){
            produto.setId((long) produtos.size() +1);
            produtos.add(produto);
            return produto;
        }else{
            JOptionPane.showMessageDialog(null, "Já existe um produto com o nome informado!");
            return null;
        }
    }
    public static List<Produto> findByCategoria(Categoria categoria) {
        return produtos.stream().filter(p->p.getCategoria().equals(categoria)).toList();
    }

    public static Produto findById(Long id) {
        return produtos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
