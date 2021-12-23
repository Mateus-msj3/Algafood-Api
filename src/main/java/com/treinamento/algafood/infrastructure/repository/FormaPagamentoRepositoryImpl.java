package com.treinamento.algafood.infrastructure.repository;

import com.treinamento.algafood.domain.model.FormaPagamento;
import com.treinamento.algafood.domain.repository.FormaPagamentoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FormaPagamentoRepositoryImpl implements FormaPagamentoRepository {

    @Override
    public List<FormaPagamento> listar() {
        return null;
    }

    @Override
    public FormaPagamento listarPorId(Long id) {
        return null;
    }

    @Override
    public FormaPagamento salvar() {
        return null;
    }

    @Override
    public void remover(FormaPagamento formaPagamento) {

    }
}
