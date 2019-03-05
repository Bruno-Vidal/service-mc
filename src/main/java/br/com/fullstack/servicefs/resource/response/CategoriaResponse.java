package br.com.fullstack.servicefs.resource.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class CategoriaResponse {

    private Long id;

    private String nome;

    private List<ProdutoResponse> produtos;
}
