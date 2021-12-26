package com.treinamento.algafood.domain.repository;

import com.treinamento.algafood.domain.model.Cozinha;

import java.util.List;

public interface CozinhaRepository{

    List<Cozinha> listar();
    Cozinha listarPorId(Long id);
    Cozinha salvar();
    void remover(Long id);
}
