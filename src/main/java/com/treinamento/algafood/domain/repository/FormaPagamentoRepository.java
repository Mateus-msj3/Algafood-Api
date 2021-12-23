package com.treinamento.algafood.domain.repository;

import com.treinamento.algafood.domain.model.Cozinha;
import com.treinamento.algafood.domain.model.FormaPagamento;

import java.util.List;

public interface FormaPagamentoRepository {
    List<FormaPagamento> listar();
    FormaPagamento listarPorId(Long id);
    FormaPagamento salvar();
    void remover(FormaPagamento formaPagamento);
}
