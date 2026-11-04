package br.edu.ifpe.oxefood.exception;

public class ProdutoException extends RuntimeException{
    
    public static final String MSG_VALOR_MINIMO_PRODUTO = "Não permitir que sejam inseridos produtos com um valor menor que R$ 20 e maior que R$ 100";

    public ProdutoException(String msg) {

    super(String.format(msg));
    }

}
