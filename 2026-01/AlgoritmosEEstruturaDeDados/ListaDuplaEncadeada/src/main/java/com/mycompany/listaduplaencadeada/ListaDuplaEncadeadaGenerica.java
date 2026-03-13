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
    
    public NoListaDupla<T> buscar(T valor){
        return null;
    }
    
    public void retirar(T valor){
        NoListaDupla p = this.buscar(valor);
        
        if(p != null){
            if (primeiro.equals(p)){
                primeiro = p.getProximo();
            } else {
                p.getAnterior().setProximo(p.getAnterior());
            }
            if (p.getProximo() != null){
                p.getProximo().setAnterior(p.getAnterior());
            }
        }
    }
    
    public void exibirOrdemInversa(){
        
    }
    
    public void liberar(){
        
    }
    
    public String toString(){
        return null;
    }
}
