package com.mycompany.soapalunocurso;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

// anotacoes.java - 4
@WebService
@SOAPBinding(style = Style.RPC)
public interface CursoServer {

    @WebMethod String criarCurso(int id, String nome);
    @WebMethod Curso buscarCurso(int id);
    @WebMethod String atualizarCurso(int id, String nome);
    @WebMethod String deletarCurso(int id);
}