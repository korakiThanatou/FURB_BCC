package com.mycompany.soapalunocurso;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.jws.WebService;

// anotacoes.java - 5
@WebService
public class CursoServerImpl implements CursoServer {

    private static final Logger logger = Logger.getLogger(CursoServerImpl.class.getName());

    private static Map<Integer, Curso> cursos = new HashMap<>();

    @Override
    public String criarCurso(int id, String nome) {
        logger.info("Criando curso: ID=" + id + ", Nome=" + nome);

        try {
            Curso curso = new Curso(id, nome);
            cursos.put(id, curso);

            return "Curso criado!";
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Erro ao criar curso", e);
            return "Erro ao criar curso";
        }
    }

    @Override
    public Curso buscarCurso(int id) {
        logger.info("Buscando curso ID=" + id);

        Curso curso = cursos.get(id);

        if (curso == null) {
            logger.warning("Curso não encontrado: " + id);
        }

        return curso;
    }

    @Override
    public String atualizarCurso(int id, String nome) {
        logger.info("Atualizando curso ID=" + id);

        try {
            Curso curso = new Curso(id, nome);
            cursos.put(id, curso);

            return "Curso atualizado!";
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Erro ao atualizar curso", e);
            return "Erro ao atualizar curso";
        }
    }

    @Override
    public String deletarCurso(int id) {
        logger.info("Deletando curso ID=" + id);

        if (!cursos.containsKey(id)) {
            logger.warning("Curso não encontrado: " + id);
            return "Curso não encontrado!";
        }

        cursos.remove(id);
        return "Curso removido!";
    }
}