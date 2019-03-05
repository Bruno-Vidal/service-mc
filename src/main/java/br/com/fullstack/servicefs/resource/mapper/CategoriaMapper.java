package br.com.fullstack.servicefs.resource.mapper;

import br.com.fullstack.servicefs.business.model.Categoria;
import br.com.fullstack.servicefs.business.model.Produto;
import br.com.fullstack.servicefs.resource.response.CategoriaResponse;
import br.com.fullstack.servicefs.resource.response.ProdutoResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoriaMapper {

    public CategoriaResponse entidadeParaResponse(Categoria categoria) {
        return CategoriaResponse.builder()
                .id(categoria.getId())
                .nome(categoria.getNome())
                .produtos(mapearListaDeProdutos(categoria.getProdutos()))
                .build();
    }

    public ProdutoResponse entidadeParaResponse(Produto produto) {
        return ProdutoResponse.builder()
                .id(produto.getId())
                .nome(produto.getNome())
                .preco(produto.getPreco())
                .build();
    }

    private List<ProdutoResponse> mapearListaDeProdutos(List<Produto> produtos) {
        return produtos.stream()
                .map(this::entidadeParaResponse)
                .collect(Collectors.toList());
    }
}
