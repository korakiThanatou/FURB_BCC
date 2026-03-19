/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaduplaencadeada;

/**
 *
 * @author Windows
 */
public class TesteListaDupla {
    public static void main(String[] args) {
        ListaDuplaEncadeadaGenerica<Integer> lista = new ListaDuplaEncadeadaGenerica<>();

        // Caso 1: inserir 5,10,15,20
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        System.out.println("Lista após inserções: " + lista);
        System.out.print("Ordem inversa: ");
        lista.exibirOrdemInversa();

        // Caso 2: buscar 20
        System.out.println("Buscar(20): " + (lista.buscar(20) != null));

        // Caso 3: buscar 10
        System.out.println("Buscar(10): " + (lista.buscar(10) != null));

        // Caso 4: remover 20
        lista.retirar(20);
        System.out.println("Após remover 20: " + lista);

        // Caso 5: remover 10
        lista.retirar(10);
        System.out.println("Após remover 10: " + lista);

        // Caso 6: remover 5
        lista.retirar(5);
        System.out.println("Após remover 5: " + lista);

        // Caso 7: liberar
        lista.liberar();
        System.out.println("Após liberar: " + lista);
    }
}