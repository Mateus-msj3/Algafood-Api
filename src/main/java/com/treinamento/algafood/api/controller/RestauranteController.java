package com.treinamento.algafood.api.controller;

import com.treinamento.algafood.domain.exception.EntidadeNaoEncontradaException;
import com.treinamento.algafood.domain.model.Restaurante;
import com.treinamento.algafood.domain.repository.RestauranteRepository;
import com.treinamento.algafood.domain.service.CadastroRestauranteService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/restuarantes")
public class RestauranteController {

    @Autowired
    private RestauranteRepository restauranteRepository;

    @Autowired
    private CadastroRestauranteService cadastroRestauranteService;

    @GetMapping
    public List<Restaurante> listar() {
        return restauranteRepository.findAll();
    }

    @GetMapping("/{restauranteId}")
    public ResponseEntity<Restaurante> buscarPorId (@PathVariable Long restauranteId) {
        Optional<Restaurante> restaurante =  restauranteRepository.findById(restauranteId);

        if(restaurante.isPresent()) {
            return ResponseEntity.ok(restaurante.get());
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody Restaurante restaurante) {
        try {
            restaurante = cadastroRestauranteService.salvar(restaurante);

            return ResponseEntity.status(HttpStatus.CREATED).body(restaurante);

        }catch (EntidadeNaoEncontradaException e) {
            return ResponseEntity.badRequest()
                    .body(e.getMessage());
        }
    }

    @PutMapping("/{restauranteId}")
    public ResponseEntity<?> atualizar(@PathVariable Long restauranteId, @RequestBody Restaurante restaurante) {

        try {
            Restaurante restauranteAtual = restauranteRepository.findById(restauranteId).orElse(null);

            if (restauranteAtual != null) {
                BeanUtils.copyProperties(restaurante, restauranteAtual, "id",
                        "formasPagamento");

                restauranteAtual = cadastroRestauranteService.salvar(restauranteAtual);
                return ResponseEntity.ok(restauranteAtual);
            }

            return ResponseEntity.notFound().build();

        } catch (EntidadeNaoEncontradaException e) {
            return ResponseEntity.badRequest()
                    .body(e.getMessage());
        }
    }

}
