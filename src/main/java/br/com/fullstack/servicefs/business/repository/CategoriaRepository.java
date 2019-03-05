package br.com.fullstack.servicefs.business.repository;

import br.com.fullstack.servicefs.business.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
}
