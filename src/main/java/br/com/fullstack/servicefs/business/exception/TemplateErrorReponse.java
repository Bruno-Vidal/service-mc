package br.com.fullstack.servicefs.business.exception;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Builder
@Data
public class TemplateErrorReponse implements Serializable {

    private Integer status;
    private String mensagem;
    private LocalDateTime timeStamp;
}
