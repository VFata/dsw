/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author vinicius.fsilv11
 */
public class Produto {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    private String nome;
    private String descricao;
    private double precoCompra;
    private double precoVenda;
    private int quantidade;
    private int id;
    private Date dataCadastro;
    private List<Categoria> categorias;
    
    public Produto(){
        this.id=0;
        this.categorias = new ArrayList<>();
    }
    
    public Produto(String nome, String descricao, double valor, double precoCompra, double precoVenda, int quantidade){
        
        
    }
    
    
}
