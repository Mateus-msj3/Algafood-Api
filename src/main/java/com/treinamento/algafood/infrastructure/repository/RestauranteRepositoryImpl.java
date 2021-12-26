package com.treinamento.algafood.infrastructure.repository;

import com.treinamento.algafood.domain.model.Restaurante;
import com.treinamento.algafood.domain.repository.RestauranteRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RestauranteRepositoryImpl implements RestauranteRepository {

    @Override
    public List<Restaurante> listar() {
        return null;
    }

    @Override
    public Restaurante listarPorId(Long id) {
        return null;
    }

    @Override
    public Restaurante adicionar() {
        return null;
    }

    @Override
    public void remover(Restaurante restaurante) {

    }
}
