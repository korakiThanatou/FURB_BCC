/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arvorenariagenerica;

/**
 *
 * @author liandrar
 */
public class Arvore<T> {
    private NoArvore<T> raiz;

    public Arvore() {
        this.raiz = null;
    }

    public Arvore(NoArvore raiz) {
        this.raiz = raiz;
    }
    
    public NoArvore getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvore raiz) {
        if (raiz == null){
            throw new IllegalArgumentException("raiz nao pode ser nula");
        }
        this.raiz = raiz;
    }
    
    @Override
    public String toString(){
        if (raiz == null){
            return " ";
        }
        return obterRepresentacaoTextual(raiz);
    }
    
    private String obterRepresentacaoTextual(NoArvore<T> no){
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(no.getInfo());
        
        NoArvore<T> p = no.getPrimeiro();
        while (p != null){
            sb.append(obterRepresentacaoTextual(p));
            p = p.getProximo();
        }
        sb.append(">");
        return sb.toString();
    }
    
    public boolean pertence(T info){
        if (raiz == null){
            return false;
        }
        return pertence(raiz, info);
    }
    
    private boolean pertence(NoArvore<T> no, T info){
        if (no.getInfo().equals(info)){
            return true;
        }
        
        NoArvore<T> p = no.getPrimeiro();
        while(p != null){
            if (pertence(p, info)) return true;
            p = p.getProximo();
        }
        
        return false;
    }
    
    public int contarNos(){
        return contarNos(raiz);
    }
    
    public int contarNos(NoArvore<T> no){
        if (no == null) return 0;
        
        int total = 1;
        NoArvore<T> p = no.getPrimeiro();
        
        while(p != null){
            total += contarNos(p);
            p = p.getProximo();
        }
        return total;
    }
}
