package com.treinamento.algafood.domain.repository;

import com.treinamento.algafood.domain.model.Cidade;

import java.util.List;

public interface CidadeRepository {
    List<Cidade> listar();
    Cidade listarPorId(Long id);
    Cidade salvar();
    void remover(Cidade cidade);
}
