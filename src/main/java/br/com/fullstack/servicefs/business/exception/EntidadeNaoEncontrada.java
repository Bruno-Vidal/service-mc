package br.com.fullstack.servicefs.business.exception;

public class EntidadeNaoEncontrada extends RuntimeException {
    public EntidadeNaoEncontrada(){
        super("Entidade não encontrada");
    }
    public EntidadeNaoEncontrada(String msg) {
        super(msg);
    }
}
