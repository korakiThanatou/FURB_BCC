/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arvoresbinariasgenericas;

/**
 *
 * @author liandrar
 */
public class NoArvoreBinaria<T> {
    private T info;
    private NoArvoreBinaria esq;
    private NoArvoreBinaria dir;

    public NoArvoreBinaria(T info) {
        this.info = info;
        this.esq = null;
        this.dir = null;
    }

    public NoArvoreBinaria(T info, NoArvoreBinaria esq, NoArvoreBinaria dir) {
        this.info = info;
        this.esq = esq;
        this.dir = dir;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NoArvoreBinaria<T> getEsq() {
        return esq;
    }

    public void setEsq(NoArvoreBinaria<T> esq) {
        this.esq = esq;
    }

    public NoArvoreBinaria getDir() {
        return dir;
    }

    public void setDir(NoArvoreBinaria<T> dir) {
        this.dir = dir;
    }
    
    
}
