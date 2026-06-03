package com.mycompany.soapalunocurso;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;
import java.util.List;

// anotacoes.java - 2
public class Aluno {

    private int id;
    private String nome;
    @XmlElementWrapper(name = "cursos")
    @XmlElement(name = "curso")
    private List<Curso> cursos = new ArrayList<>(); // anotacoes.java - 6

    public Aluno() {
    }

    public Aluno(int id, String nome) {
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

    public List<Curso> getCursos() {
        return cursos;
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    @Override
    public String toString() {
        return "Aluno{id=" + id + ", nome='" + nome + "', cursos=" + cursos + "}";
    }
}
