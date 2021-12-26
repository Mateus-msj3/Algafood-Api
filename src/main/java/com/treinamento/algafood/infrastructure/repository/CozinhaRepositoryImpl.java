package com.treinamento.algafood.infrastructure.repository;

import com.treinamento.algafood.domain.model.Cozinha;
import com.treinamento.algafood.domain.repository.CozinhaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CozinhaRepositoryImpl implements CozinhaRepository{


    @Override
    public List<Cozinha> listar() {
        return null;
    }

    @Override
    public Cozinha listarPorId(Long id) {
        return null;
    }

    @Override
    public Cozinha salvar() {
        return null;
    }

    @Override
    public void remover(Long id) {

    }
}
