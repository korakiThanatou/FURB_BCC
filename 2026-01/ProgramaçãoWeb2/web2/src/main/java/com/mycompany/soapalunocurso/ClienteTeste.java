package com.mycompany.soapalunocurso;

import jakarta.xml.ws.Service;
import java.net.URL;
import javax.xml.namespace.QName;
import java.util.logging.Logger;
import java.util.logging.Level;

// anotacoes.java - 8
public class ClienteTeste {

    private static final Logger logger = Logger.getLogger(ClienteTeste.class.getName());

    public static void main(String[] args) {

        try {
            logger.info("Iniciando cliente SOAP...");

            // ===== ALUNO =====
            URL urlAluno = new URL("http://localhost:8080/aluno?wsdl");

            QName serviceAluno = new QName(
                    "http://soapalunocurso.mycompany.com/",
                    "AlunoServerImplService"
            );

            QName portAluno = new QName(
                    "http://soapalunocurso.mycompany.com/",
                    "AlunoServerImplPort"
            );

            Service service1 = Service.create(urlAluno, serviceAluno);
            AlunoServer alunoService = service1.getPort(portAluno, AlunoServer.class);

            // ===== CURSO =====
            URL urlCurso = new URL("http://localhost:8082/curso?wsdl");

            QName serviceCurso = new QName(
                    "http://soapalunocurso.mycompany.com/",
                    "CursoServerImplService"
            );

            QName portCurso = new QName(
                    "http://soapalunocurso.mycompany.com/",
                    "CursoServerImplPort"
            );

            Service service2 = Service.create(urlCurso, serviceCurso);
            CursoServer cursoService = service2.getPort(portCurso, CursoServer.class);

            // ===== TESTE ALUNO =====
            logger.info("===== TESTANDO ALUNO =====");

            logger.info("Criando aluno...");
            logger.info(alunoService.criarAluno(1, "Thomas"));

            logger.info("Buscando aluno...");
            logger.info(String.valueOf(alunoService.buscarAluno(1)));

            // ===== TESTE CURSO =====
            logger.info("===== TESTANDO CURSO =====");

            logger.info("Criando curso...");
            logger.info(cursoService.criarCurso(10, "POO"));

            logger.info("Buscando curso...");
            logger.info(String.valueOf(cursoService.buscarCurso(10)));

            // ===== RELACIONAMENTO =====
            logger.info("===== TESTANDO RELACIONAMENTO =====");

            logger.info("Adicionando curso ao aluno...");
            logger.info(alunoService.adicionarCursoAoAluno(1, 10, "POO"));

            logger.info("Buscando aluno com cursos...");
            logger.info(String.valueOf(alunoService.buscarAluno(1)));

            // ===== LIMPEZA =====
            logger.info("===== LIMPEZA =====");

            logger.info("Deletando aluno...");
            logger.info(alunoService.deletarAluno(1));

            logger.info("Deletando curso...");
            logger.info(cursoService.deletarCurso(10));

            logger.info("Fim dos testes.");

        } catch (Exception e) {
            logger.log(Level.SEVERE, "Erro ao executar cliente SOAP", e);
        }
    }
}