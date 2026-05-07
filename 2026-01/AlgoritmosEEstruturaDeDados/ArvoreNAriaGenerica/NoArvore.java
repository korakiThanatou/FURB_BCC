/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arvorenariagenerica;

/**
 *
 * @author liandrar
 */
public class NoArvore<T> {

    private NoArvore<T> primeiro;
    private NoArvore<T> proximo;
    private T info;

    public NoArvore(T info) {
        this.info = info;
        this.primeiro = null;
        this.proximo = null;
    }

    public NoArvore(NoArvore<T> primeiro, NoArvore<T> proximo, T info) {
        this.primeiro = primeiro;
        this.proximo = proximo;
        this.info = info;
    }

    public void inserirFilho(NoArvore<T> filho) {
        filho.proximo = this.primeiro;
        this.primeiro = filho;
    }

    public NoArvore<T> getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoArvore<T> primeiro) {
        this.primeiro = primeiro;
    }

    public NoArvore<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoArvore<T> proximo) {
        this.proximo = proximo;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return String.valueOf(info);
    }

}
