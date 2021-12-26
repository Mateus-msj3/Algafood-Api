package com.treinamento.algafood.domain.repository;

import com.treinamento.algafood.domain.model.Restaurante;

import java.util.List;

public interface RestauranteRepository {

    List<Restaurante> listar();
    Restaurante listarPorId(Long id);
    Restaurante adicionar();
    void remover(Restaurante restaurante);

}
