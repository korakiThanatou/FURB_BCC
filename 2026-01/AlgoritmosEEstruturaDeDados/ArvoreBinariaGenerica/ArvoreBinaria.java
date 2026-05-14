/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arvoresbinariasgenericas;

/**
 *
 * @author liandrar
 */
public class ArvoreBinaria<T> {

    private NoArvoreBinaria<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public ArvoreBinaria (NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }
    
    

    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this.raiz = raiz;
    }

    public boolean estaVazia() {
        return this.raiz == null;
    }

    public boolean pertence(T info) {
        return pertence(raiz, info);
    }

    private boolean pertence(NoArvoreBinaria<T> no, T info) {
        if (no == null) {
            return false;
        }
        if (no.getInfo().equals(info)) {
            return true;
        }
        return pertence(no.getEsq(), info) || pertence(no.getDir(), info);
    }

    private String arvorePre(NoArvoreBinaria<T> no) {
        if (no == null) {
            return "<>";
        }
        return "<" + no.getInfo() + arvorePre(no.getEsq()) + arvorePre(no.getDir()) + ">";
    }

    public String toString() {
        return arvorePre(raiz);
    }

    public int contarNos() {
        return contarNos(raiz);
    }

    private int contarNos(NoArvoreBinaria<T> no) {
        if (no == null){
            return 0;
        }
        return 1 + contarNos(no.getEsq()) + contarNos(no.getDir());
    }

}
