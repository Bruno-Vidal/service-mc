package br.com.fullstack.servicefs.business.model;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name ="produtos")
@Data
@EqualsAndHashCode(exclude = {"categorias"})
@ToString(exclude = {"categorias"})
public class Produto {

    @Id
    private Long id;

    private String nome;

    private Double preco;

    @ManyToMany(mappedBy = "produtos")
    private List<Categoria> categorias;
}
