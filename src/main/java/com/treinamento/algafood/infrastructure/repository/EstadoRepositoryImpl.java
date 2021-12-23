package com.treinamento.algafood.infrastructure.repository;

import com.treinamento.algafood.domain.model.Estado;
import com.treinamento.algafood.domain.repository.EstadoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EstadoRepositoryImpl implements EstadoRepository {

    @Override
    public List<Estado> listar() {
        return null;
    }

    @Override
    public Estado listarPorId(Long id) {
        return null;
    }

    @Override
    public Estado salvar() {
        return null;
    }

    @Override
    public void remover(Estado estado) {

    }
}
