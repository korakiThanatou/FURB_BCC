/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.listaestatica;

/**
 *
 * @author liandrar
 */
public class ListaEstatica {

    private int[] info;
    private int tamanho;

    public ListaEstatica() {
        this.info = new int[10];
        this.tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    private void redimensionar() {
        int[] novo;

        int novoTamanho = info.length + 10;
        novo = new int[novoTamanho];
        for (int i = 0; i < getTamanho() - 1; i++) {
            novo[i] = info[i];
        }

        info = novo;
    }

    public void exibir() {
        for (int i = 0; i < getTamanho(); i++) {
            System.out.print(info[i]);

        }
    }

    public void inserir(int valor) {
        if (getTamanho() == info.length) {
            redimensionar();
        }

        info[getTamanho()] = valor;
        tamanho++;
    }

    public int buscar(int valor) {
        for (int i = 0; i < getTamanho(); i++) {
            if (info[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public void retirar(int valor) {
        int pos = buscar(valor);
        if (pos != -1) {
            for (int i = pos; i < getTamanho() - 1; i++) {
                info[i] = info[i + 1];
            }
            tamanho--;
        }
    }

    public boolean estaVazia() {
        return getTamanho() == 0;
    }

    public void liberar() {
        info = new int[10];
        tamanho = 0;
    }

    public int obterElemento(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        return info[posicao];
    }

    @Override
    public String toString() {
        StringBuilder mensagem = new StringBuilder();

        if (tamanho > 0) {
            mensagem.append(info[0]);
            for (int i = 1; i < tamanho; i++) {
                mensagem.append(", ").append(info[i]);
            }
        }

        return mensagem.toString();
    }

    public void inverter() {

    }

}
