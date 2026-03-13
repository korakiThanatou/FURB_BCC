/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listacirculargenerica;

/**
 *
 * @author liandrar
 */


public class TesteListaCircularGenerica {

    public static void main(String[] args) {

        // Caso 1
        ListaCircularGenerica<Integer> lista = new ListaCircularGenerica<>();
        System.out.println("Caso 1");
        System.out.println("Lista está vazia?");
        System.out.println("esperado: true");
        System.out.println("resultado: " + lista.estaVazia());
        System.out.println("-------------------------");


        // Caso 2
        lista.inserir(5);
        System.out.println("Caso 2");
        System.out.println("Lista está vazia?");
        System.out.println("esperado: false");
        System.out.println("resultado: " + lista.estaVazia());
        System.out.println("-------------------------");


        // Caso 3
        ListaCircularGenerica<Integer> lista3 = new ListaCircularGenerica<>();
        lista3.inserir(5);

        System.out.println("Caso 3");
        System.out.println("esperado primeiro: 5");
        System.out.println("resultado: " + lista3.getPrimeiro().getInfo());

        System.out.println("esperado circular (true)");
        System.out.println("resultado: " +
                (lista3.getPrimeiro().getProximo() == lista3.getPrimeiro()));

        System.out.println("-------------------------");


        // Caso 4
        lista3 = new ListaCircularGenerica<>();
        lista3.inserir(5);
        lista3.inserir(10);
        lista3.inserir(15);

        System.out.println("Caso 4");
        System.out.println("esperado: 15,10,5");
        System.out.println("resultado: " + lista3.toString());

        System.out.println("Comprimento esperado: 3");
        System.out.println("resultado: " + lista3.obterComprimento());
        System.out.println("-------------------------");


        // Caso 5
        lista3.inserir(20);

        System.out.println("Caso 5");
        System.out.println("esperado: 20");
        System.out.println("resultado: " + lista3.buscar(20).getInfo());
        System.out.println("-------------------------");


        // Caso 6
        System.out.println("Caso 6");
        System.out.println("esperado: 15");
        System.out.println("resultado: " + lista3.buscar(15).getInfo());
        System.out.println("-------------------------");


        // Caso 7
        System.out.println("Caso 7");
        System.out.println("esperado: null");
        System.out.println("resultado: " + lista3.buscar(50));
        System.out.println("-------------------------");


        // Caso 8
        lista3.retirar(20);

        System.out.println("Caso 8");
        System.out.println("esperado: 15,10,5");
        System.out.println("resultado: " + lista3.toString());
        System.out.println("-------------------------");


        // Caso 9
        lista3.retirar(10);

        System.out.println("Caso 9");
        System.out.println("esperado: 15,5");
        System.out.println("resultado: " + lista3.toString());
        System.out.println("-------------------------");


        // Caso 10
        System.out.println("Caso 10");
        System.out.println("esperado: 15");
        System.out.println("resultado: " + lista3.obterNo(0).getInfo());
        System.out.println("-------------------------");


        // Caso 11
        System.out.println("Caso 11");
        System.out.println("esperado: 5");
        System.out.println("resultado: " + lista3.obterNo(1).getInfo());
        System.out.println("-------------------------");


        // Caso 12
        System.out.println("Caso 12");
        try {
            lista3.obterNo(10);
            System.out.println("resultado: não lançou exceção");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("resultado: lançou IndexOutOfBoundsException");
        }
        System.out.println("-------------------------");


        // Caso 13
        ListaCircularGenerica<Integer> listaVazia = new ListaCircularGenerica<>();

        System.out.println("Caso 13");
        System.out.println("esperado: 0");
        System.out.println("resultado: " + listaVazia.obterComprimento());
        System.out.println("-------------------------");


        // Caso 14
        System.out.println("Caso 14");
        System.out.println("esperado: 2");
        System.out.println("resultado: " + lista3.obterComprimento());
        System.out.println("-------------------------");


        // Caso 15 (teste da circularidade)
        System.out.println("Caso 15");
        System.out.println("esperado: true");
        System.out.println("resultado: " +
                (lista3.getUltimo().getProximo() == lista3.getPrimeiro()));
        System.out.println("-------------------------");

    }
}
