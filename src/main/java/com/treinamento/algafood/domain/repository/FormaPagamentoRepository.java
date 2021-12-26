package com.treinamento.algafood.domain.repository;

import com.treinamento.algafood.domain.model.Cozinha;
import com.treinamento.algafood.domain.model.FormaPagamento;

import java.util.List;

public interface FormaPagamentoRepository {
    List<FormaPagamento> listar();
    FormaPagamento buscarPorId(Long id);
    FormaPagamento salvar();
    void remover(Long id);
}
