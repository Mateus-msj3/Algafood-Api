package com.treinamento.algafood.infrastructure.repository;

import com.treinamento.algafood.domain.model.Cidade;
import com.treinamento.algafood.domain.repository.CidadeRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CidadeRepositoryImpl implements CidadeRepository {

    @Override
    public List<Cidade> listar() {
        return null;
    }

    @Override
    public Cidade listarPorId(Long id) {
        return null;
    }

    @Override
    public Cidade salvar() {
        return null;
    }

    @Override
    public void remover(Cidade cidade) {

    }
}
