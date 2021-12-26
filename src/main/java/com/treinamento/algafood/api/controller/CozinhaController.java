package com.treinamento.algafood.api.controller;

import com.treinamento.algafood.domain.exception.EntidadeEmUsoException;
import com.treinamento.algafood.domain.model.Cozinha;
import com.treinamento.algafood.domain.repository.CozinhaRepository;
import com.treinamento.algafood.domain.service.CadastroCozinhaService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cozinhas")
public class CozinhaController {

    @Autowired
    private CozinhaRepository cozinhaRepository;

    @Autowired
    private CadastroCozinhaService cadastroCozinhaService;

    @GetMapping
    public List<Cozinha> listar() {
        return cozinhaRepository.listar();
    }

    @GetMapping("/{cozinhaId}")
    public ResponseEntity<Cozinha> buscar (@PathVariable Long cozinhaId) {
        Cozinha cozinha =  cozinhaRepository.listarPorId(cozinhaId);

        if(cozinha != null) {
            return ResponseEntity.ok(cozinha);
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cozinha adicionar(@RequestBody Cozinha cozinha) {
        return cadastroCozinhaService.salvar(cozinha);
    }

    @PutMapping("/{cozinhasId}")
    public ResponseEntity<Cozinha> atualizar(@PathVariable Long cozinhaId, @RequestBody Cozinha cozinha) {
        Cozinha cozinhaAtual = cozinhaRepository.listarPorId(cozinhaId);

        if (cozinha != null) {
            //Pega o valor da cozinha instanciada e passa os valores para a cozinha atual
            BeanUtils.copyProperties(cozinha, cozinhaAtual, "id");
            cozinhaAtual = cadastroCozinhaService.salvar(cozinha);
            return ResponseEntity.ok(cozinhaAtual);
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/cozinhaId")
    public ResponseEntity<Cozinha> remover(@PathVariable Long cozinhaId) {
        try{
            cadastroCozinhaService.excluir(cozinhaId);

            return ResponseEntity.noContent().build();

        }catch (EntidadeEmUsoException exception) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }
}
