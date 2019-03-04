package br.com.fullstack.servicefs.mapper;

import br.com.fullstack.servicefs.model.Categoria;
import br.com.fullstack.servicefs.response.CategoriaResponse;
import org.springframework.stereotype.Component;

@Component
public class CategoriaMapper {

    public CategoriaResponse entidadeParaResponse(Categoria categoria) {
        return CategoriaResponse.builder().build();
    }
}
