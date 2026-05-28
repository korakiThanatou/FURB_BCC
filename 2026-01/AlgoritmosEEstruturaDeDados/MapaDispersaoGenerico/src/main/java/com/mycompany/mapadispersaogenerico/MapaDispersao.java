/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapadispersaogenerico;

/**
 *
 * @author liandrar
 */
public class MapaDispersao<T> {

    private ListaSimplesmenteEncadeadaGenerica<NoMapa<T>> info[];

    public MapaDispersao(int tamanho) {
        info = new ListaSimplesmenteEncadeadaGenerica[tamanho];
    }

    private int calcularHash(int chave) {
        return chave % info.length;
    }

    public void inserir(int chave, T dado) {
        int indice = calcularHash(chave);

        if (info[indice] == null) {
            info[indice] = new ListaSimplesmenteEncadeadaGenerica<>();
        }

        NoMapa<T> noMapa = new NoMapa<>();
        noMapa.setChave(chave);
        noMapa.setValor(dado);

        info[indice].inserir(noMapa);
    }

    public void remover(int chave) {

        int indice = calcularHash(chave);

        if (info[indice] != null) {

            NoMapa<T> noMapa = new NoMapa<>();
            noMapa.setChave(chave);

            info[indice].retirar(noMapa);
        }
    }

    public T buscar(int chave) {
        int indice = calcularHash(chave);

        if (info[indice] != null) {

            NoMapa<T> noMapa = new NoMapa<>();
            noMapa.setChave(chave);

            NoLista<NoMapa<T>> no = info[indice].buscar(noMapa);

            if (no != null) {
                return no.getInfo().getValor();
            }
        }
        return null;
    }

    public double calcularFatorCarga() {
        int quantidadeElementos = 0;

        for (int i = 0; i < info.length; i++) {

            if (info[i] != null) {
                quantidadeElementos += info[i].obterComprimento();
            }
        }

        return (double) quantidadeElementos / info.length;
    }

}
