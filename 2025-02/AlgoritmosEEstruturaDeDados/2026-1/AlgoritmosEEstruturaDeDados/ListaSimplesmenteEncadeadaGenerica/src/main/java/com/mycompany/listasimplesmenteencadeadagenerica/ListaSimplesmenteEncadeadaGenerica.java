/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listasimplesmenteencadeadagenerica;

/**
 *
 * @author liandrar
 */
public class ListaSimplesmenteEncadeadaGenerica<T> {
    private NoLista<T> primeiro;

    public ListaSimplesmenteEncadeadaGenerica() {
        this.primeiro = null;
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor){
        NoLista<T> novo = new NoLista();
        novo.setInfo(valor);
        novo.setProximo(primeiro);
        this.primeiro = novo;
    }
    
    public boolean estaVazia(){
        return primeiro == null;
    }
    
    public NoLista<T> buscar(T valor){
        NoLista<T> p = primeiro;
        while (p != null){
            if (p.getInfo().equals(valor)){
                return p;
            }
            p = p.getProximo();
        }
        return null;
    }
    
    public void retirar(T valor){
        NoLista<T> ant = null;
        NoLista<T> p = primeiro;
        
        while (p != null && !p.getInfo().equals(valor)){
            ant = p;
            p = p.getProximo();
        }
        if (p != null){
            if (p == primeiro){
                this.primeiro = p.getProximo();
            } else {
                ant.setProximo(p.getProximo());
            }
        }
    }
    
    public int obterComprimento(){
        NoLista<T> p = primeiro;
        int contador = 0;
        while (p != null){
            contador++;
            p = p.getProximo();
        }
        return contador;
    }
    
    public NoLista<T> obterNo(int idx){
        if (idx < 0 ) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }
        NoLista<T> p = primeiro;
        int cont = 0;
        while (cont < idx && p != null) {
            p = p.getProximo();
            cont++;
        }
        
        if (p == null){
            throw new IndexOutOfBoundsException();
        }
        return p;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NoLista<T> p = primeiro;
        while (p != null) {
            sb.append(p.getInfo());
            p = p.getProximo();
            if (p != null) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
    public void exibir(){
        NoLista p = primeiro;
        while(p != null){
            System.out.print(p.getInfo());
            p = p.getProximo();
        }
    }
    
    
}
