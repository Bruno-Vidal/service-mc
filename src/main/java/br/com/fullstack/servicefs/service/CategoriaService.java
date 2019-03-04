package br.com.fullstack.servicefs.service;

import br.com.fullstack.servicefs.filter.CategoriaFiltro;
import br.com.fullstack.servicefs.model.Categoria;
import br.com.fullstack.servicefs.repository.CategoriaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    private CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public Page<Categoria> buscarCategorias(Pageable pageable, CategoriaFiltro filtro) {
        return new PageImpl<Categoria>(null);
    }
}
