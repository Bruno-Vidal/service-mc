package br.com.fullstack.servicefs.business.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@EqualsAndHashCode(exclude = "cidades")
@ToString(exclude = "cidades")
@Entity
@Table(name = "estados")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "estado")
    private List<Cidade> cidades;
}
