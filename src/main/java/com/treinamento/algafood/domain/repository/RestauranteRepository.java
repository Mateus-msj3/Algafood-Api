package com.treinamento.algafood.domain.repository;

import com.treinamento.algafood.domain.model.Cozinha;

import java.util.List;

public interface RestauranteRepository {

    List<Cozinha> listarTodos();
    Cozinha listarPorId(Long id);
    Cozinha adicionar();
    void remover(Cozinha cozinha);

}
