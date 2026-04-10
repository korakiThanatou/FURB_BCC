/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.PilhasGenericas;

/**
 *
 * @author liandrar
 */
public class PilhaVetor<T> implements Pilha<T> {

    private Object[] info;
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite) {
        System.out.println("- metodo construtor acionado");
        this.info = new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
    }

    public void push(T valor) {
        System.out.println("- metodo push acionado: inserir " + valor);
        if (limite == tamanho) {
            throw new RuntimeException("Capacidade esgotada da pilha");
        }
        info[tamanho] = valor;
        tamanho++;
    }

    public T pop() {
        System.out.println("- metodo pop acionado");
        T valor;
        valor = this.peek();
        tamanho--;
        return valor;
    }

    public T peek() {
        System.out.println("- metodo peek acionado");
        if (estaVazia()) {
            throw new RuntimeException("Pilha esta vazia");
        }
        return (T) info[tamanho - 1];
    }

    public boolean estaVazia() {
        System.out.println("- metodo estaVazia acionado");
        return tamanho == 0;
    }

    public void liberar() {
        System.out.println("- metodo liberar acionado");
        T[] novo = (T[]) new Object[limite];
        info = novo;
        tamanho = 0;
    }

    public String toString() {
        System.out.println("- metodo toString acionado");
        if (tamanho == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = tamanho - 1; i >= 0; i--) {
            sb.append(info[i]);
            if (i > 0) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public void concatenar(PilhaVetor<T> p) {
        System.out.println("- metodo concatenar acionado");

        // verifica capacidade
        if (this.tamanho + p.tamanho > this.limite) {
            throw new RuntimeException("Capacidade insuficiente para concatenar");
        }

        // pilha auxiliar pra não perder dados de p
        PilhaVetor<T> aux = new PilhaVetor<>(p.tamanho);

        // passo 1: inverter p em aux
        while (!p.estaVazia()) {
            T valor = p.pop();
            aux.push(valor);
        }

        // passo 2: restaurar p E empilhar na atual
        while (!aux.estaVazia()) {
            T valor = aux.pop();
            p.push(valor);     // restaura p
            this.push(valor);  // adiciona na atual
        }
    }

    public void concatenarVarias(PilhaVetor<T>... pilhas) {
        int total = this.tamanho;

        for (PilhaVetor<T> p : pilhas) {
            total += p.tamanho;
        }

        if (total > this.limite) {
            throw new RuntimeException("Capacidade insuficiente");
        }

        for (PilhaVetor<T> p : pilhas) {
            this.concatenar(p);
        }
    }
}
