package br.edu.ifpe.oxefood.exception;

public class ClienteException extends RuntimeException{
    
    public static final String MSG_FONE_81_CLIENTE = "Não permitir que sejam inseridos clientes com um telefone que não tenha o prefixo 81";

    public ClienteException(String msg) {

    super(String.format(msg));
    }

}
