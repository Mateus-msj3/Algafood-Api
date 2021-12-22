package com.treinamento.infrastructure.repository;

import com.treinamento.algafood.domain.model.Cidade;
import com.treinamento.algafood.domain.model.Estado;
import com.treinamento.algafood.domain.repository.CidadeRepository;
import com.treinamento.algafood.domain.repository.EstadoRepository;

import java.util.List;

public class EstadoRepositoryImpl implements EstadoRepository {
    @Override
    public List<Estado> buscarTodos() {
        return null;
    }

    @Override
    public Estado buscarPorId(Long id) {
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
