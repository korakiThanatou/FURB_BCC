/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.listaestaticagenerica;

/**
 *
 * @author liandrar
 */
public class ListaEstaticaGenerica<T> {

    private T[] info;
    private int tamanho;

    public ListaEstaticaGenerica() {
        this.info =(T[]) new Object[10];
        this.tamanho = 0;
        
    }

    private void redimensionar() {
        T[] novo;

        int novoTamanho = info.length + 10;
        novo = (T[]) new Object[novoTamanho];
        for (int i = 0; i < getTamanho(); i++) {
            novo[i] = info[i];
        }

        info = novo;
    }

    public void inserir(T valor) {
        if (getTamanho() == info.length) {
            redimensionar();
        }

        info[getTamanho()] = valor;
        tamanho++;
    }

    public void exibir() {
        System.out.print("[");
        for (int i = 0; i < getTamanho(); i++) {
            if (i != tamanho-1){
                System.out.print(info[i] + ", ");
            } else {
                System.out.print(info[i] + ".");
            }
            
        }
        System.out.print("]\n");
    }

    public int buscar(T valor) {
        for (int i = 0; i < getTamanho(); i++) {
            if (info[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }

    public void retirar(T valor) {
        int pos = buscar(valor);
        if (pos != -1) {
            for (int i = pos; i < getTamanho() - 1; i++) {
                info[i] = info[i + 1];
            }
            tamanho--;
        }
    }

    public void liberar() {
        info = (T[]) new Object[10];
        tamanho = 0;
    }

    public T obterElemento(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        return (T) info[posicao];
    }

    public boolean estaVazia() {
        return getTamanho() == 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public String toString() {
    String s = "[";
    for (int i = 0; i < this.tamanho; i++) {
        s += this.info[i];
        if (i < this.tamanho - 1) {
            s += ", ";
        }
    }
    s += "]";
    return s;
}

    public void inverter() {
        int inicio = 0;
        int fim = tamanho - 1;

        while (inicio < fim) {
            T temp = (T) info[inicio];
            info[inicio] = info[fim];
            info[fim] = temp;

            inicio++;
            fim--;
        }
    }

}
