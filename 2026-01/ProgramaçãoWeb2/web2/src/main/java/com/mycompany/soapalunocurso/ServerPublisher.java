package com.mycompany.soapalunocurso;

import jakarta.xml.ws.Endpoint;
import java.util.logging.Logger;

public class ServerPublisher {

    private static final Logger logger = Logger.getLogger(ServerPublisher.class.getName());

    public static void main(String[] args) {

        String urlAluno = "http://localhost:8080/aluno";
        String urlCurso = "http://localhost:8082/curso";

        logger.info("Iniciando servidor SOAP...");

        logger.info("Publicando serviço de Aluno em: " + urlAluno);
        Endpoint.publish(urlAluno, new AlunoServerImpl()); // anotacoes.java - 7

        logger.info("Publicando serviço de Curso em: " + urlCurso);
        Endpoint.publish(urlCurso, new CursoServerImpl()); // anotacoes.java - 7

        logger.info("Serviços rodando!");
        logger.info("WSDL Aluno: " + urlAluno + "?wsdl");
        logger.info("WSDL Curso: " + urlCurso + "?wsdl");
        
        
    }
}