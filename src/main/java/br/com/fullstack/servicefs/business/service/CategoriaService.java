package br.com.fullstack.servicefs.business.service;

import br.com.fullstack.servicefs.business.exception.EntidadeNaoEncontrada;
import br.com.fullstack.servicefs.resource.filter.CategoriaFiltro;
import br.com.fullstack.servicefs.business.model.Categoria;
import br.com.fullstack.servicefs.business.repository.CategoriaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;

@Service
public class CategoriaService {

    private CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public Page<Categoria> buscarCategorias(Pageable pageable, CategoriaFiltro filtro) {
        return categoriaRepository.findAll(pageable);
    }

    public Categoria buscarPorId(Long id){
        return categoriaRepository.findById(id)
                .orElseThrow(() -> new EntidadeNaoEncontrada(MessageFormat.format("Categoria com o identificador: {0}, não foi encontrada ! ", id)));
    }
}