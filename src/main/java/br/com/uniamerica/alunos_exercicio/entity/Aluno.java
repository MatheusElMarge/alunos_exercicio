package br.com.uniamerica.alunos_exercicio.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "aluno", schema = "public")

public class Aluno {
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Getter @Setter
    @Column (name = "nome", nullable = false)
    private String nome;


    @Getter @Setter
    @Column (name = "CPF", nullable = false, unique = true)
    private String cpf;

    @Getter @Setter
    @OneToOne
    @JoinColumn (name = "endereco", nullable = false)
    private Endereco endereco;

}
