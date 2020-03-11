package br.com.rr.mastertech.cliente.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "cliente não encontrado")
public class ClienteNaoEncontradoException extends RuntimeException {
}
