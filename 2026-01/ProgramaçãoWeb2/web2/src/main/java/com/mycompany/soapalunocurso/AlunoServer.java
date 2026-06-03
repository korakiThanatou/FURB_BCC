package com.mycompany.soapalunocurso;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

// anotacoes.java - 4
@WebService
@SOAPBinding(style = Style.RPC)
public interface AlunoServer {
    @WebMethod String criarAluno(int id, String nome);
    @WebMethod Aluno buscarAluno(int id);
    @WebMethod String atualizarAluno(int id, String nome);
    @WebMethod String deletarAluno(int id);
    @WebMethod String adicionarCursoAoAluno(int alunoId, int cursoId, String nomeCurso);
}
