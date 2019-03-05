package br.com.fullstack.servicefs.business.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@ControllerAdvice
public class ExceptionHandlerResponse {

    @ExceptionHandler(EntidadeNaoEncontrada.class)
    public ResponseEntity<TemplateErrorReponse> entidadeNaoEncontrada(EntidadeNaoEncontrada entidadeNaoEncontrada, HttpServletRequest request) {
        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(TemplateErrorReponse.builder()
                                                                .mensagem(entidadeNaoEncontrada.getMessage())
                                                                .status(HttpStatus.NOT_FOUND.value())
                                                                .timeStamp(LocalDateTime.now())
                                                            .build());
    }

}
