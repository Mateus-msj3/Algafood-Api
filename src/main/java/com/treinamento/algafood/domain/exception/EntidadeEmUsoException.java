package com.treinamento.algafood.domain.exception;

public class EntidadeEmUsoException extends RuntimeException{

    public EntidadeEmUsoException(String mensagem) {
        super(mensagem);
    }
}
