package com.mycompany.mapadispersaogenerico;

public class TesteMapaDispersao {

    public static void main(String[] args) {

        System.out.println("===== CASO 1 =====");

        MapaDispersao<Aluno> mapa1 = new MapaDispersao<>(53);

        Aluno obj1 = new Aluno(12000, "Jean", "01/01/2000");

        mapa1.inserir(12000, obj1);

        Aluno resultado1 = mapa1.buscar(12000);

        if (resultado1 == obj1) {
            System.out.println("Caso 1 OK");
        } else {
            System.out.println("Caso 1 ERRO");
        }



        System.out.println("\n===== CASO 2 =====");

        MapaDispersao<Aluno> mapa2 = new MapaDispersao<>(53);

        Aluno a1 = new Aluno(12000, "Jean", "01/01/2000");
        Aluno a2 = new Aluno(14000, "Pedro", "20/01/1999");
        Aluno a3 = new Aluno(12500, "Marta", "18/02/2001");
        Aluno a4 = new Aluno(13000, "Lucas", "25/11/1998");

        mapa2.inserir(12000, a1);
        mapa2.inserir(14000, a2);
        mapa2.inserir(12500, a3);
        mapa2.inserir(13000, a4);

        if (mapa2.buscar(12000) == a1 &&
            mapa2.buscar(14000) == a2 &&
            mapa2.buscar(12500) == a3 &&
            mapa2.buscar(13000) == a4) {

            System.out.println("Caso 2 OK");

        } else {

            System.out.println("Caso 2 ERRO");
        }



        System.out.println("\n===== CASO 3 =====");

        MapaDispersao<Aluno> mapa3 = new MapaDispersao<>(53);

        Aluno b1 = new Aluno(12000, "Jean", "01/01/2000");
        Aluno b2 = new Aluno(14000, "Pedro", "20/01/1999");
        Aluno b3 = new Aluno(14226, "Marta", "18/02/2001");
        Aluno b4 = new Aluno(17180, "Lucas", "25/11/1998");

        mapa3.inserir(12000, b1);
        mapa3.inserir(14000, b2);
        mapa3.inserir(14226, b3);
        mapa3.inserir(17180, b4);

        if (mapa3.buscar(12000) == b1 &&
            mapa3.buscar(14000) == b2 &&
            mapa3.buscar(14226) == b3 &&
            mapa3.buscar(17180) == b4) {

            System.out.println("Caso 3 OK");

        } else {

            System.out.println("Caso 3 ERRO");
        }
    }
}