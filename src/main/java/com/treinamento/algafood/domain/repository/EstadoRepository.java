package com.treinamento.algafood.domain.repository;

import com.treinamento.algafood.domain.model.Cidade;
import com.treinamento.algafood.domain.model.Estado;

import java.util.List;

public interface EstadoRepository {
    List<Estado> buscarTodos();
    Estado buscarPorId(Long id);
    Estado salvar();
    void remover(Estado estado);
}
