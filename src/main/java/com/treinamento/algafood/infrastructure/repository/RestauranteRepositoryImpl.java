package com.treinamento.algafood.infrastructure.repository;

import com.treinamento.algafood.domain.model.Cozinha;
import com.treinamento.algafood.domain.repository.RestauranteRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RestauranteRepositoryImpl implements RestauranteRepository {

    @Override
    public List<Cozinha> listarT() {
        return null;
    }

    @Override
    public Cozinha listarPorId(Long id) {
        return null;
    }

    @Override
    public Cozinha adicionar() {
        return null;
    }

    @Override
    public void remover(Cozinha cozinha) {

    }
}
