/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapadispersaogenerico;

/**
 *
 * @author liandrar
 */
public class NoMapa<T> {
    private int chave;
    private T valor;

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null){
            return false;
        }
        if(getClass()!= o.getClass()){
            return false;
        }
        NoMapa other = (NoMapa) o;
        if(chave != other.chave){
            return false;
        }
        return true;
    }
}
