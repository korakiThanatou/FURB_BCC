/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilhasgenericas;

/**
 *
 * @author liandrar
 */
public class TestePilhaVetor {

    public static void main(String[] args) {
        PilhaVetor<Integer> pilha = new PilhaVetor<>(5);

        //caso 1
        System.out.println("\nCaso 1");
        System.out.println("-- Verificar se lista esta vazia --");
        System.out.println("Esperado: true");
        System.out.println("Resultado: " + pilha.estaVazia());

        //caso 2
        System.out.println("\nCaso 2");
        pilha.push(10);
        System.out.println("-- Verificar se lista esta vazia --");
        System.out.println("Esperado: false");
        System.out.println("Resultado: " + pilha.estaVazia());

        //caso 3
        System.out.println("\nCaso 3");
        PilhaVetor<Integer> pilha2 = new PilhaVetor<>(10);
        pilha2.push(10);
        pilha2.push(20);
        pilha2.push(30);
        System.out.println("-- Verificar valor retirado --");
        System.out.println("Esperado: 30");
        System.out.println("Resultado: " + pilha2.pop());
        System.out.println("-- Verificar valor retirado --");
        System.out.println("Esperado: 20");
        System.out.println("Resultado: " + pilha2.pop());
        System.out.println("-- Verificar valor retirado --");
        System.out.println("Esperado: 10");
        System.out.println("Resultado: " + pilha2.pop());
        System.out.println("-- Verificar se lista esta vazia --");
        System.out.println("Esperado: true");
        System.out.println("Resultado: " + pilha2.estaVazia());

        // caso 4 - pilha cheia
        System.out.println("\nCaso 4");
        PilhaVetor<Integer> pilha3 = new PilhaVetor<>(3);
        try {
            pilha3.push(10);
            pilha3.push(20);
            pilha3.push(30);
            pilha3.push(40); // deve estourar
        } catch (RuntimeException PilhaCheiaException) {
            System.out.println("Esperado: exceção de pilha cheia");
            System.out.println("Resultado: " + PilhaCheiaException.getMessage());
        }

        // caso 5 - pilha vazia
        System.out.println("\nCaso 5");
        PilhaVetor<Integer> pilha4 = new PilhaVetor<>(3);
        try {
            pilha4.pop();
        } catch (RuntimeException PilhaVaziaException) {
            System.out.println("Esperado: exceção de pilha vazia");
            System.out.println("Resultado: " + PilhaVaziaException.getMessage());
        }

        // caso 6 - peek
        System.out.println("\nCaso 6");
        PilhaVetor<Integer> pilha5 = new PilhaVetor<>(5);
        pilha5.push(10);
        pilha5.push(20);
        pilha5.push(30);

        System.out.println("Esperado topo: 30");
        System.out.println("Resultado: " + pilha5.peek());

        System.out.println("Esperado pop: 30");
        System.out.println("Resultado: " + pilha5.pop());

        // caso 7 - liberar
        System.out.println("\nCaso 7");
        PilhaVetor<Integer> pilha6 = new PilhaVetor<>(5);
        pilha6.push(10);
        pilha6.push(20);
        pilha6.push(30);

        pilha6.liberar();

        System.out.println("Esperado: true");
        System.out.println("Resultado: " + pilha6.estaVazia());

        // caso 8 - concatenar
        System.out.println("\nCaso 8");
        PilhaVetor<Integer> p1 = new PilhaVetor<>(10);
        p1.push(10);
        p1.push(20);
        p1.push(30);

        PilhaVetor<Integer> p2 = new PilhaVetor<>(10);
        p2.push(40);
        p2.push(50);

        p1.concatenar(p2);

        System.out.println("Esperado: 50,40,30,20,10");
        System.out.println("Resultado: " + p1.toString());
    }

}
