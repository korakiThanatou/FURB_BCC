/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaestatica;

/**
 *
 * @author liandrar
 */
public class Main {
    public static void main(String[] args) {
        //Caso 1
        ListaEstatica Caso1 = new ListaEstatica();
        Caso1.inserir(5);
        Caso1.inserir(10);
        Caso1.inserir(15);
        Caso1.inserir(20);
        
        System.out.println(Caso1.toString());
        
        //Caso 2
        System.out.println(Caso1.getTamanho());
        
        //Caso 3
        System.out.println(Caso1.buscar(15));
        
        //Caso 4
        System.out.println(Caso1.buscar(30));
        
        //Caso 5
        Caso1.retirar(10);
        System.out.println(Caso1.getTamanho());
        
        //Caso 6 
        ListaEstatica Caso6 = new ListaEstatica();
        Caso6.inserir(1);
        Caso6.inserir(2);
        Caso6.inserir(3);
        Caso6.inserir(4);
        Caso6.inserir(5);
        Caso6.inserir(6);
        Caso6.inserir(7);
        Caso6.inserir(8);
        Caso6.inserir(9);
        Caso6.inserir(10);
        Caso6.inserir(11);
        Caso6.inserir(12);
        Caso6.inserir(13);
        Caso6.inserir(14);
        Caso6.inserir(15);
        System.out.println(Caso6.toString());
        System.out.println(Caso6.getTamanho());
        
        //Caso 7
        ListaEstatica Caso7 = new ListaEstatica();
        Caso7.inserir(5);
        Caso7.inserir(10);
        Caso7.inserir(15);
        Caso7.inserir(20);
        System.out.println(Caso7.obterElemento(3));
        
        //Caso 8
        //System.out.println(Caso7.obterElemento(5));
        
        //Caso 9
        Caso7.liberar();
        System.out.println(Caso7.estaVazia());
    }
}
