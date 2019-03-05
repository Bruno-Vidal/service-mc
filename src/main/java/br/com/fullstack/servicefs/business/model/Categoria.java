package br.com.fullstack.servicefs.business.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "categorias")
@Data
@EqualsAndHashCode(exclude = {"produtos"})
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"produtos"})
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;
    @ManyToMany
    @JoinTable(name = "produtos_categorias",
            joinColumns = @JoinColumn(name = "categoria_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    private List<Produto> produtos;
}
