package com.mycompany.arvoresbinariasgenericas;

public class TesteArvoreBinaria {

    public static void main(String[] args) {

        System.out.println("==== PLANO DE TESTES - ÁRVORE BINÁRIA ====\n");

        // =========================================
        // CASO 1 - Árvore vazia
        // =========================================

        ArvoreBinaria<Integer> arvoreVazia = new ArvoreBinaria<>();

        System.out.println("CASO 1 - Árvore vazia");
        System.out.println("Esperado: true");
        System.out.println("Obtido: " + arvoreVazia.estaVazia());

        System.out.println("\nEsperado: 0");
        System.out.println("Obtido: " + arvoreVazia.contarNos());

        System.out.println("\n-----------------------------------\n");

        // =========================================
        // MONTANDO ÁRVORE DE TESTE
        // =========================================
        //
        //            1
        //           / \
        //          2   3
        //         / \
        //        4   5
        //
        // =========================================

        NoArvoreBinaria<Integer> n1 = new NoArvoreBinaria<>(1);
        NoArvoreBinaria<Integer> n2 = new NoArvoreBinaria<>(2);
        NoArvoreBinaria<Integer> n3 = new NoArvoreBinaria<>(3);
        NoArvoreBinaria<Integer> n4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> n5 = new NoArvoreBinaria<>(5);

        n2.setEsq(n4);
        n2.setDir(n5);

        n1.setEsq(n2);
        n1.setDir(n3);

        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        arvore.setRaiz(n1);

        // =========================================
        // CASO 2 - Árvore NÃO vazia
        // =========================================

        System.out.println("CASO 2 - Árvore não vazia");
        System.out.println("Esperado: false");
        System.out.println("Obtido: " + arvore.estaVazia());

        System.out.println("\n-----------------------------------\n");

        // =========================================
        // CASO 3 - Contagem de nós
        // =========================================

        System.out.println("CASO 3 - Quantidade de nós");

        System.out.println("Esperado: 5");
        System.out.println("Obtido: " + arvore.contarNos());

        System.out.println("\n-----------------------------------\n");

        // =========================================
        // CASO 4 - Busca de elemento existente
        // =========================================

        System.out.println("CASO 4 - Busca de elemento existente");

        System.out.println("Esperado: true");
        System.out.println("Obtido: " + arvore.pertence(3));

        System.out.println("\nEsperado: true");
        System.out.println("Obtido: " + arvore.pertence(5));

        System.out.println("\n-----------------------------------\n");

        // =========================================
        // CASO 5 - Busca de elemento inexistente
        // =========================================

        System.out.println("CASO 5 - Busca de elemento inexistente");

        System.out.println("Esperado: false");
        System.out.println("Obtido: " + arvore.pertence(10));

        System.out.println("\nEsperado: false");
        System.out.println("Obtido: " + arvore.pertence(99));

        System.out.println("\n-----------------------------------\n");

        // =========================================
        // CASO 6 - Impressão da árvore
        // =========================================

        System.out.println("CASO 6 - Representação da árvore");

        System.out.println("Resultado obtido:");
        System.out.println(arvore);

        System.out.println("\n==== FIM DOS TESTES ====");
    }
}