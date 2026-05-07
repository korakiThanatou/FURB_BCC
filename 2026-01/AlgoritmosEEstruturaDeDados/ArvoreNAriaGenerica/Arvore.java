/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arvorenariagenerica;

import java.util.Objects;

/**
 *
 * @author liandrar
 */
public class Arvore<T> {

    private NoArvore<T> raiz;

    public Arvore() {
        this.raiz = null;
    }

    public Arvore(NoArvore<T> raiz) {
        this.raiz = raiz;
    }

    public NoArvore<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NoArvore<T> raiz) {
        this.raiz = raiz;
    }

    @Override
    public String toString() {
        if (raiz == null) {
            return "<>";
        }
        return obterRepresentacaoTextual(raiz);
    }

    private String obterRepresentacaoTextual(NoArvore<T> no) {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(no.getInfo());

        NoArvore<T> p = no.getPrimeiro();
        while (p != null) {
            sb.append(obterRepresentacaoTextual(p));
            p = p.getProximo();
        }
        sb.append(">");
        return sb.toString();
    }

    public boolean pertence(T info) {
        if (raiz == null) {
            return false;
        }
        return pertence(raiz, info);
    }

    private boolean pertence(NoArvore<T> no, T info) {
        if (Objects.equals(no.getInfo(), info)) {
            return true;
        }

        for (NoArvore<T> filho = no.getPrimeiro();
                filho != null;
                filho = filho.getProximo()) {
            if (pertence(filho, info)) {
                return true;
            }
        }

        return false;
    }

    public int contarNos() {
        return contarNos(raiz);
    }

    private int contarNos(NoArvore<T> no) {
        if (no == null) {
            return 0;
        }

        int total = 1;

        for (NoArvore<T> filho = no.getPrimeiro();
                filho != null;
                filho = filho.getProximo()) {

            total += contarNos(filho);
        }

        return total;
    }
}
