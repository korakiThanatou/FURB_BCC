package com.mycompany.listaestaticagenerica;

public class TesteListaEstaticaGenerica {

    public static void main(String[] args) {
        System.out.println("==== Plano de Testes PL01 ====");

        // Caso 1
        ListaEstaticaGenerica lista1 = new ListaEstaticaGenerica();
        lista1.inserir(5); lista1.inserir(10); lista1.inserir(15); lista1.inserir(20);
        System.out.println("Caso 1: " + lista1.toString() + " (esperado: 5,10,15,20)");

        // Caso 2
        System.out.println("Caso 2: " + lista1.getTamanho() + " (esperado: 4)");

        // Caso 3
        System.out.println("Caso 3: " + lista1.buscar(15) + " (esperado: 2)");

        // Caso 4
        System.out.println("Caso 4: " + lista1.buscar(30) + " (esperado: -1)");

        // Caso 5
        ListaEstaticaGenerica lista5 = new ListaEstaticaGenerica();
        lista5.inserir(5); lista5.inserir(10); lista5.inserir(15); lista5.inserir(20);
        lista5.retirar(10);
        System.out.println("Caso 5a: " + lista5.toString() + " (esperado: 5,15,20)");
        System.out.println("Caso 5b: " + lista5.getTamanho() + " (esperado: 3)");

        // Caso 6
        ListaEstaticaGenerica lista6 = new ListaEstaticaGenerica();
        for (int i = 1; i <= 15; i++) {
            lista6.inserir(i);
        }
        System.out.println("Caso 6a: " + lista6.toString() + " (esperado: 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)");
        System.out.println("Caso 6b: " + lista6.getTamanho() + " (esperado: 15)");

        // Caso 7
        ListaEstaticaGenerica lista7 = new ListaEstaticaGenerica();
        lista7.inserir(5); lista7.inserir(10); lista7.inserir(15); lista7.inserir(20);
        System.out.println("Caso 7: " + lista7.obterElemento(3) + " (esperado: 20)");

        // Caso 8
        try {
            lista7.obterElemento(5);
            System.out.println("Caso 8: ERRO - não lançou exceção");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caso 8: Exceção lançada corretamente");
        }

        // Caso 9
        ListaEstaticaGenerica lista9 = new ListaEstaticaGenerica();
        lista9.inserir(5); lista9.inserir(10); lista9.inserir(15); lista9.inserir(20);
        lista9.liberar();
        System.out.println("Caso 9: " + lista9.estaVazia() + " (esperado: true)");
        
        // Caso 10
        ListaEstaticaGenerica lista10 = new ListaEstaticaGenerica();
        lista10.inserir(5); lista10.inserir(10); lista10.inserir(15); lista10.inserir(20);
        lista10.inverter();
        System.out.println("Caso 10: " + lista10.toString() + " (esperado: '20,15,10,5')");
    
        // Caso 11
        ListaEstaticaGenerica lista11 = new ListaEstaticaGenerica();
        lista11.inserir(1); lista11.inserir(2); lista11.inserir(3); lista11.inserir(4); lista11.inserir(5);
        lista11.inverter();
        System.out.println("Caso 10: " + lista11.toString() );
    }
} 