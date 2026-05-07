package com.mycompany.arvorenariagenerica;

public class TesteArvoreNAria {

    public static void main(String[] args) {

        Arvore<Integer> arvore = criarArvore();

        System.out.println("========== Testes ==========");

        // Teste 1
        String esperado = "<1<2<5><6><7>><3<8>><4<9><10>>>";
        testar(
            "Teste 1 - toString()",
            arvore.toString().equals(esperado)
        );

        // Teste 2
        testar(
            "Teste 2 - pertence(7)",
            arvore.pertence(7)
        );

        // Teste 3
        testar(
            "Teste 3 - pertence(55)",
            !arvore.pertence(55)
        );

        // Teste 4
        testar(
            "Teste 4 - contarNos()",
            arvore.contarNos() == 10
        );
    }

    private static void testar(String nome, boolean resultado) {
        System.out.println(
            nome + ": " + (resultado ? "OK" : "Falhou")
        );
    }

    private static Arvore<Integer> criarArvore() {

        // Folhas
        NoArvore<Integer> no5 = new NoArvore<>(5);
        NoArvore<Integer> no6 = new NoArvore<>(6);
        NoArvore<Integer> no7 = new NoArvore<>(7);
        NoArvore<Integer> no8 = new NoArvore<>(8);
        NoArvore<Integer> no9 = new NoArvore<>(9);
        NoArvore<Integer> no10 = new NoArvore<>(10);

        // Subárvores
        NoArvore<Integer> no2 = new NoArvore<>(2);
        no2.inserirFilho(no7);
        no2.inserirFilho(no6);
        no2.inserirFilho(no5);

        NoArvore<Integer> no3 = new NoArvore<>(3);
        no3.inserirFilho(no8);

        NoArvore<Integer> no4 = new NoArvore<>(4);
        no4.inserirFilho(no10);
        no4.inserirFilho(no9);

        // Raiz
        NoArvore<Integer> no1 = new NoArvore<>(1);
        no1.inserirFilho(no4);
        no1.inserirFilho(no3);
        no1.inserirFilho(no2);

        Arvore<Integer> arvore = new Arvore<>();
        arvore.setRaiz(no1);

        return arvore;
    }
}