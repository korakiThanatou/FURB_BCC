/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaestaticagenerica;

/**
 *
 * @author liandrar
 */
public class Main {
    public static void main(String[] args) {
        ListaEstaticaGenerica teste1 = new ListaEstaticaGenerica();
        
        teste1.inserir(5);
        teste1.inserir(10);
        teste1.inserir(15);
        teste1.inserir(20);
        
        teste1.exibir();
        teste1.inverter();
        teste1.exibir();
        
        ListaEstaticaGenerica teste2 = new ListaEstaticaGenerica();
        
        teste2.inserir(5);
        teste2.inserir(10);
        teste2.inserir(15);
        teste2.inserir(20);
        teste2.inserir(25);
        
        teste2.exibir();
        teste2.inverter();
        teste2.exibir();
    }
    
   
    
}
