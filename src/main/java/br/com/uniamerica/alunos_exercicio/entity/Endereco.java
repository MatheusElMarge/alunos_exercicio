package br.com.uniamerica.alunos_exercicio.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "endereco", schema = "public")

public class Endereco {
    @Id
    @Getter
    @Column (name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Getter @Setter
    @Column (name = "rua", nullable = false)
    private String rua;

    @Getter @Setter
    @Column (name = "numero", nullable = false)
    private String numero;

    @Getter @Setter
    @Column (name = "bairro", nullable = false)
    private String bairro;

    @Getter @Setter
    @Column (name = "CEP",nullable = false)
    private String cep;

}
