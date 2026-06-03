package com.mycompany.soapalunocurso;

// anotacoes.java - 3
public class Curso {
    private int id;
    private String nome;

    public Curso() {}

    public Curso(int id, String nome) {
        setId(id);
        setNome(nome);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID inválido");
        }
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Curso{id=" + id + ", nome='" + nome + "'}";
    }
}