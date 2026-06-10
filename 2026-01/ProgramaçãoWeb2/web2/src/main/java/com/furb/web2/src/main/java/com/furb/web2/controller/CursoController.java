package com.furb.web2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.furb.web2.model.Curso;
import com.furb.web2.repository.CursoRepository;

@RestController
public class CursoController {

    @Autowired
    private CursoRepository repository;

    @GetMapping("/cursos")
    public List<Curso> listar() {
        return repository.findAll();
    }

    @PostMapping("/cursos")
    public Curso salvar(@RequestBody Curso curso) {
        return repository.save(curso);
    }
    @GetMapping("/cursos/{id}")
public Curso buscarPorId(@PathVariable Long id) {
    return repository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(
            HttpStatus.NOT_FOUND,
            "Curso não encontrado"
        ));
}
@PutMapping("/cursos/{id}")
public Curso atualizar(
        @PathVariable Long id,
        @RequestBody Curso curso) {

    curso.setId(id);

    return repository.save(curso);
}
@DeleteMapping("/cursos/{id}")
public void deletar(@PathVariable Long id) {
    repository.deleteById(id);
}
}