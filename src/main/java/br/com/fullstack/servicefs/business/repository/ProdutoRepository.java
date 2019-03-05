package br.com.fullstack.servicefs.business.repository;

import br.com.fullstack.servicefs.business.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
}
