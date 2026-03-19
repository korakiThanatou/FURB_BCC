/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaduplaencadeada;

/**
 *
 * @author liandrar
 */
public class ListaDuplaEncadeadaGenerica<T> {
    private NoListaDupla<T> primeiro;
    
    public ListaDuplaEncadeadaGenerica() {
        this.primeiro = null;
    }

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }
    
    public void inserir(T valor){
        NoListaDupla<T> novo = new NoListaDupla<>();
        novo.setInfo(valor);
        novo.setProximo(primeiro);
        novo.setAnterior(null);
        
        if (primeiro != null){
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
    }
    
    public NoListaDupla<T> buscar(T valor) {
        NoListaDupla<T> p = primeiro;
        while (p != null) {
            if (p.getInfo().equals(valor)) {
                return p;
            }

            p = p.getProximo();
        }
        return null;
    }
    
    public void retirar(T valor){
        NoListaDupla p = this.buscar(valor);
        
        if(p != null){
            if (primeiro.equals(p)){
                primeiro = p.getProximo();
            } else {
                p.getAnterior().setProximo(p.getProximo());
            }
            if (p.getProximo() != null){
                p.getProximo().setAnterior(p.getAnterior());
            }
        }
    }
    
    public void exibirOrdemInversa() {
        NoListaDupla<T> atual = primeiro;
        if (atual == null) {
            return;
        }

        while (atual.getProximo() != null) {
            atual = atual.getProximo();
        }

        while (atual != null) {
            System.out.print(atual.getInfo() + " ");
            atual = atual.getAnterior();
        }
        System.out.println();

    }
    
     public void liberar() {
        NoListaDupla<T> atual = primeiro;
        while (atual != null) {
            NoListaDupla<T> proximo = atual.getProximo();
            atual.setAnterior(null);
            atual.setProximo(null);
            atual = proximo;
        }
        primeiro = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        NoListaDupla<T> atual = primeiro;
        while (atual != null) {
            sb.append(atual.getInfo());
            if (atual.getProximo() != null) {
                sb.append(", ");
            }
            atual = atual.getProximo();
        }
        return sb.toString();
    }
}
