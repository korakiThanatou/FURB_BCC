/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listasimplesmenteencadeadagenerica;

/**
 *
 * @author liandrar
 */
public class TesteListaSimplesmenteEncadeadaGenerica {

    public static void main(String[] args) {
        // Caso 1
        ListaSimplesmenteEncadeadaGenerica<Integer> lista = new ListaSimplesmenteEncadeadaGenerica();
        System.out.println("Caso 1");
        System.out.println("Lista está vazia?\nesperado: true\nresultado: " + lista.estaVazia());
        System.out.println("-------------------------");

        // Caso 2
        lista.inserir(5);
        System.out.println("Caso 2");
        System.out.println("Lista está vazia?\nesperado: false\nresultado: " + lista.estaVazia());
        System.out.println("-------------------------");

        // Caso 3
        ListaSimplesmenteEncadeadaGenerica<Integer> lista3 = new ListaSimplesmenteEncadeadaGenerica<>();
        lista3.inserir(5);
        System.out.println("Caso 3");
        System.out.println("esperado: 5\nresultado: " + lista3.getPrimeiro().getInfo());
        NoLista<Integer> p = lista3.getPrimeiro();
        System.out.println("Não deve haver próximo nó: " + (p.getProximo() == null));
        System.out.println("-------------------------");

        // Caso 4
        lista3 = new ListaSimplesmenteEncadeadaGenerica<>();
        lista3.inserir(5);
        lista3.inserir(10);
        lista3.inserir(15);
        System.out.println("Caso 4");
        System.out.println("esperado: 15,10,5\nresultado: " + lista3.toString());
        System.out.println("Comprimento esperado: 3\nresultado: " + lista3.obterComprimento());
        System.out.println("-------------------------");

        // Caso 5
        lista3 = new ListaSimplesmenteEncadeadaGenerica<>();
        lista3.inserir(5);
        lista3.inserir(10);
        lista3.inserir(15);
        lista3.inserir(20);
        System.out.println("Caso 5");
        System.out.println("esperado: 20\nresultado: " + lista3.buscar(20).getInfo());
        System.out.println("-------------------------");

        // Caso 6
        System.out.println("Caso 6");
        System.out.println("esperado: 15\nresultado: " + lista3.buscar(15).getInfo());
        System.out.println("-------------------------");

        // Caso 7
        System.out.println("Caso 7");
        System.out.println("esperado: null\nresultado: " + lista3.buscar(50));
        System.out.println("-------------------------");

        // Caso 8
        lista3 = new ListaSimplesmenteEncadeadaGenerica<>();
        lista3.inserir(5);
        lista3.inserir(10);
        lista3.inserir(15);
        lista3.inserir(20);
        lista3.retirar(20);
        System.out.println("Caso 8");
        System.out.println("esperado: 15,10,5\nresultado: " + lista3.toString());
        System.out.println("-------------------------");

        // Caso 9
        lista3 = new ListaSimplesmenteEncadeadaGenerica<>();
        lista3.inserir(5);
        lista3.inserir(10);
        lista3.inserir(15);
        lista3.inserir(20);
        lista3.retirar(15);
        System.out.println("Caso 9");
        System.out.println("esperado: 20,10,5\nresultado: " + lista3.toString());
        System.out.println("-------------------------");

        // Caso 10
        System.out.println("Caso 10");
        System.out.println("esperado: 20\nresultado: " + lista3.obterNo(0).getInfo());
        System.out.println("-------------------------");

        // Caso 11
        lista3 = new ListaSimplesmenteEncadeadaGenerica<>();
        lista3.inserir(5);
        lista3.inserir(10);
        lista3.inserir(15);
        lista3.inserir(20);
        System.out.println("Caso 11");
        System.out.println("esperado: 5\nresultado: " + lista3.obterNo(3).getInfo());
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
        ListaSimplesmenteEncadeadaGenerica<Integer> listaVazia = new ListaSimplesmenteEncadeadaGenerica<>();
        System.out.println("Caso 13");
        System.out.println("esperado: 0\nresultado: " + listaVazia.obterComprimento());
        System.out.println("-------------------------");

        // Caso 14
        System.out.println("Caso 14");
        System.out.println("esperado: 4\nresultado: " + lista3.obterComprimento());
        System.out.println("-------------------------");
    }
}
