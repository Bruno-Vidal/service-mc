package br.com.fullstack.servicefs.resource.controller;

import br.com.fullstack.servicefs.resource.filter.CategoriaFiltro;
import br.com.fullstack.servicefs.resource.mapper.CategoriaMapper;
import br.com.fullstack.servicefs.resource.response.CategoriaResponse;
import br.com.fullstack.servicefs.business.service.CategoriaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private CategoriaService categoriaService;

    private CategoriaMapper categoriaMapper;

    public CategoriaController(CategoriaService categoriaService, CategoriaMapper categoriaMapper) {
        this.categoriaService = categoriaService;
        this.categoriaMapper = categoriaMapper;
    }

    @GetMapping
    public ResponseEntity<Page<CategoriaResponse>> buscarCategorias(Pageable pageable, CategoriaFiltro filtro){
        return ResponseEntity.ok(categoriaService.buscarCategorias(pageable,filtro)
                .map(categoriaMapper::entidadeParaResponse));

    }

    @GetMapping("/{id}")
    public CategoriaResponse busacarPorId(@PathVariable("id") Long id) {
        return categoriaMapper
                .entidadeParaResponse(categoriaService.buscarPorId(id));
    }

    @GetMapping("/nopage")
    public ResponseEntity<List<CategoriaResponse>> buscarCategoriasSenginacao(Pageable pageable, CategoriaFiltro filtro){
        return ResponseEntity.ok(categoriaService.buscarCategorias(pageable,filtro).stream()
                .map(categoriaMapper::entidadeParaResponse)
                .collect(Collectors.toList()));

    }

}
