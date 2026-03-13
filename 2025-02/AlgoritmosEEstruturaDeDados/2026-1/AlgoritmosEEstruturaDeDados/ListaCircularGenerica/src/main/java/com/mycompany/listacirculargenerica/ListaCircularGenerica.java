/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.listacirculargenerica;

/**
 *
 * @author liandrar
 */
public class ListaCircularGenerica<T> {

    private NoLista<T> primeiro;
    private NoLista<T> ultimo;

    public ListaCircularGenerica() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public NoLista<T> getUltimo() {
        return ultimo;
    }

    public void setPrimeiro(NoLista<T> primeiro) {
        this.primeiro = primeiro;
    }

    public void setUltimo(NoLista<T> ultimo) {
        this.ultimo = ultimo;
    }

    public void inserir(T valor) {
        NoLista<T> novo = new NoLista<>();
        novo.setInfo(valor);

        if (estaVazia()) {
            primeiro = novo;
            ultimo = novo;
            novo.setProximo(novo);
        } else {
            novo.setProximo(primeiro);
            primeiro = novo;
            ultimo.setProximo(primeiro);
        }
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public NoLista<T> buscar(T valor) {
        if (estaVazia()) {
            return null;
        }

        NoLista<T> p = primeiro;

        do {
            if (p.getInfo().equals(valor)) {
                return p;
            }
            p = p.getProximo();
        } while (p != primeiro);

        return null;
    }

    public void retirar(T valor) {

        if (estaVazia()) {
            return;
        }

        NoLista<T> p = primeiro;
        NoLista<T> ant = ultimo;

        do {
            if (p.getInfo().equals(valor)) {

                if (p == primeiro && p == ultimo) {
                    // só 1 elemento
                    primeiro = null;
                    ultimo = null;

                } else if (p == primeiro) {
                    // removendo o primeiro
                    primeiro = primeiro.getProximo();
                    ultimo.setProximo(primeiro);

                } else if (p == ultimo) {
                    // removendo o último
                    ultimo = ant;
                    ultimo.setProximo(primeiro);

                } else {
                    // removendo do meio
                    ant.setProximo(p.getProximo());
                }

                return;
            }

            ant = p;
            p = p.getProximo();

        } while (p != primeiro);
    }

    public int obterComprimento() {
        if (estaVazia()) {
            return 0;
        }

        int contador = 0;
        NoLista<T> p = primeiro;

        do {
            contador++;
            p = p.getProximo();
        } while (p != primeiro);

        return contador;
    }

    public NoLista<T> obterNo(int idx) {

        if (idx < 0 || estaVazia()) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }

        NoLista<T> p = primeiro;
        int cont = 0;

        do {
            if (cont == idx) {
                return p;
            }

            cont++;
            p = p.getProximo();

        } while (p != primeiro);

        throw new IndexOutOfBoundsException();
    }

    public String toString() {
        if (estaVazia()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        NoLista<T> p = primeiro;

        do {
            sb.append(p.getInfo());
            p = p.getProximo();
            if (p != primeiro) {
                sb.append(",");
            }
        } while (p != primeiro);

        return sb.toString();
    }

    public void exibir() {
        if (estaVazia()) {
            return;
        }

        NoLista<T> p = primeiro;

        do {
            System.out.print(p.getInfo() + " ");
            p = p.getProximo();
        } while (p != primeiro);
    }
}
