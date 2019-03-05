package br.com.fullstack.servicefs.resource.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProdutoResponse {

    private String nome;
    private Double preco;
    private Long id;
}
