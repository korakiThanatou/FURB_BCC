package com.mycompany.PilhasGenericas;

import java.util.Scanner;

public class TesteInterativoPilha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PilhaVetor<Object>[] pilhas = new PilhaVetor[5];
        String[] tipos = new String[5];

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

                // 🔥 CRIAR PILHA
                case 1:
                    System.out.print("Indice da pilha (0-4): ");
                    int i = sc.nextInt();

                    System.out.print("Tamanho da pilha: ");
                    int tamanho = sc.nextInt();

                    System.out.println("Tipo da pilha:");
                    System.out.println("1 - Integer");
                    System.out.println("2 - String");
                    int tipo = sc.nextInt();

                    pilhas[i] = new PilhaVetor<>(tamanho);

                    if (tipo == 1) {
                        tipos[i] = "Integer";
                    } else {
                        tipos[i] = "String";
                    }

                    System.out.println("Pilha criada!");
                    break;

                // 🔥 PUSH
                case 2:
                    System.out.print("Indice da pilha: ");
                    int p = sc.nextInt();

                    if (pilhas[p] == null) {
                        System.out.println("Crie a pilha primeiro!");
                        break;
                    }

                    try {
                        if (tipos[p].equals("Integer")) {
                            System.out.print("Valor (int): ");
                            int val = sc.nextInt();
                            pilhas[p].push(val);

                        } else if (tipos[p].equals("String")) {
                            System.out.print("Valor (texto): ");
                            String val = sc.next();
                            pilhas[p].push(val);
                        }

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                // 🔥 VER PILHA
                case 3:
                    System.out.print("Indice da pilha: ");
                    int v = sc.nextInt();

                    if (pilhas[v] == null) {
                        System.out.println("Pilha não existe!");
                        break;
                    }

                    System.out.println("Tipo: " + tipos[v]);
                    System.out.println("Conteudo: " + pilhas[v]);
                    break;

                // 🔥 CONCATENAR 2 PILHAS
                case 4:
                    System.out.print("Destino: ");
                    int d = sc.nextInt();
                    System.out.print("Origem: ");
                    int o = sc.nextInt();

                    if (pilhas[d] == null || pilhas[o] == null) {
                        System.out.println("Crie as pilhas primeiro!");
                        break;
                    }

                    if (!tipos[d].equals(tipos[o])) {
                        System.out.println("Tipos incompatíveis!");
                        break;
                    }

                    try {
                        pilhas[d].concatenar(pilhas[o]);
                        System.out.println("Concatenado!");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                // 🔥 CONCATENAR VÁRIAS
                case 5:
                    System.out.print("Destino: ");
                    int destino = sc.nextInt();

                    if (pilhas[destino] == null) {
                        System.out.println("Crie a pilha destino primeiro!");
                        break;
                    }

                    System.out.print("Quantas pilhas deseja concatenar? ");
                    int qtd = sc.nextInt();

                    PilhaVetor<Object>[] lista = new PilhaVetor[qtd];

                    for (int k = 0; k < qtd; k++) {
                        System.out.print("Indice da pilha " + (k + 1) + ": ");
                        int idx = sc.nextInt();

                        if (pilhas[idx] == null) {
                            System.out.println("Pilha " + idx + " não existe!");
                            k--;
                            continue;
                        }

                        if (!tipos[destino].equals(tipos[idx])) {
                            System.out.println("Tipo incompatível com a pilha destino!");
                            k--;
                            continue;
                        }

                        lista[k] = pilhas[idx];
                    }

                    try {
                        pilhas[destino].concatenarVarias(lista);
                        System.out.println("Concatenação múltipla feita!");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}