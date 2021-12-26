package com.treinamento.algafood.domain.repository;

import com.treinamento.algafood.domain.model.Estado;
import com.treinamento.algafood.domain.model.Permissao;

import java.util.List;

public interface PermissaoRepository {

    List<Permissao> listar();
    Estado buscarPorId(Long id);
    Estado salvar();
    void remover(Long id);

}
