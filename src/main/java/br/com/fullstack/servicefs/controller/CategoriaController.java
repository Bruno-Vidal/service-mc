package br.com.fullstack.servicefs.controller;

import br.com.fullstack.servicefs.filter.CategoriaFiltro;
import br.com.fullstack.servicefs.mapper.CategoriaMapper;
import br.com.fullstack.servicefs.response.CategoriaResponse;
import br.com.fullstack.servicefs.service.CategoriaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    private CategoriaService categoriaService;

    private CategoriaMapper categoriaMapper;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    public ResponseEntity<Page<CategoriaResponse>> buscarCategorias(Pageable pageable, CategoriaFiltro filtro){
        return ResponseEntity.ok(categoriaService.buscarCategorias(pageable,filtro)
                .map(categoriaMapper::entidadeParaResponse));

    }
}
