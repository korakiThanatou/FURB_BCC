package com.mycompany.soapalunocurso;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.jws.WebService;

// anotacoes.java - 5
@WebService
public class AlunoServerImpl implements AlunoServer {

    private static final Logger logger = Logger.getLogger(AlunoServerImpl.class.getName());

    private  static Map<Integer, Aluno> alunos = new HashMap<>();

    @Override
    public String criarAluno(int id, String nome) {
        logger.info("Criando aluno: ID=" + id + ", Nome=" + nome); // anotacoes.java - 9

        try {
            Aluno aluno = new Aluno(id, nome);
            alunos.put(id, aluno);

            return "Aluno criado!";
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Erro ao criar aluno", e); // anotacoes.java - 9
            return "Erro ao criar aluno";
        }
    }

    @Override
    public Aluno buscarAluno(int id) {
        logger.info("Buscando aluno ID=" + id); // anotacoes.java - 9

        Aluno aluno = alunos.get(id);

        if (aluno == null) {
            logger.warning("Aluno não encontrado: " + id); // anotacoes.java - 9
        }

        return aluno;
    }

    @Override
    public String atualizarAluno(int id, String nome) {
        logger.info("Atualizando aluno ID=" + id); // anotacoes.java - 9

        try {
            Aluno aluno = new Aluno(id, nome);
            alunos.put(id, aluno);

            return "Aluno atualizado!";
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Erro ao atualizar aluno", e); // anotacoes.java - 9
            return "Erro ao atualizar aluno";
        }
    }

    @Override
    public String deletarAluno(int id) {
        logger.info("Deletando aluno ID=" + id); // anotacoes.java - 9

        if (!alunos.containsKey(id)) {
            logger.warning("Aluno não encontrado: " + id); // anotacoes.java - 9
            return "Aluno não encontrado!";
        }

        alunos.remove(id);
        return "Aluno removido!";
    }

    @Override
    public String adicionarCursoAoAluno(int alunoId, int cursoId, String nomeCurso) {
        logger.info("Adicionando curso ao aluno ID=" + alunoId); // anotacoes.java - 9

        Aluno aluno = alunos.get(alunoId);

        if (aluno == null) {
            logger.warning("Aluno não encontrado: " + alunoId); // anotacoes.java - 9
            return "Aluno não encontrado!";
        }

        try {
            Curso curso = new Curso(cursoId, nomeCurso);
            aluno.adicionarCurso(curso);

            return "Curso adicionado ao aluno!";
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Erro ao adicionar curso", e); // anotacoes.java - 9
            return "Erro ao adicionar curso";
        }
    }
}
