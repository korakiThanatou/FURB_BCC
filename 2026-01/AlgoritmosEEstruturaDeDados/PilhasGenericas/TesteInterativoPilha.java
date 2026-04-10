package com.mycompany.PilhasGenericas;

import java.util.Scanner;

public class TesteInterativoPilha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PilhaVetor<Integer>[] pilhas = new PilhaVetor[5];

        int opcao;

        do {
            System.out.println("\n==== MENU MULTI PILHA ====");
            System.out.println("1 - Criar pilha");
            System.out.println("2 - Push");
            System.out.println("3 - Ver pilha");
            System.out.println("4 - Concatenar pilhas");
            System.out.println("5 - Concatenar várias pilhas");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Indice da pilha (0-4): ");
                    int i = sc.nextInt();
                    pilhas[i] = new PilhaVetor<>(10);
                    System.out.println("Pilha criada!");
                    break;

                case 2:
                    System.out.print("Indice da pilha: ");
                    int p = sc.nextInt();
                    System.out.print("Valor: ");
                    int val = sc.nextInt();

                    try {
                        pilhas[p].push(val);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Indice da pilha: ");
                    int v = sc.nextInt();
                    System.out.println("Pilha: " + pilhas[v]);
                    break;

                case 4:
                    System.out.print("Destino: ");
                    int d = sc.nextInt();
                    System.out.print("Origem: ");
                    int o = sc.nextInt();

                    pilhas[d].concatenar(pilhas[o]);
                    System.out.println("Concatenado!");
                    break;

                case 5:
                    System.out.print("Destino: ");
                    int destino = sc.nextInt();

                    System.out.print("Quantas pilhas deseja concatenar? ");
                    int qtd = sc.nextInt();

                    PilhaVetor<Integer>[] lista = new PilhaVetor[qtd];

                    for (int k = 0; k < qtd; k++) {
                        System.out.print("Indice da pilha " + (k + 1) + ": ");
                        int idx = sc.nextInt();
                        lista[k] = pilhas[idx];
                    }

                    pilhas[destino].concatenarVarias(lista);
                    System.out.println("Concatenação múltipla feita!");
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}
