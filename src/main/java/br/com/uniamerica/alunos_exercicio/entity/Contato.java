package br.com.uniamerica.alunos_exercicio.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "contato", schema = "public")

public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Column(name = "id", nullable = false, unique = true)
    private Long id;


    @Getter @Setter
    @Column (name = "tipo", nullable = false)
    private String tipo;

    @Getter @Setter
    @Column(name = "valor", nullable = false)
    private String valor;


    @Getter @Setter
    @ManyToOne
    @JoinColumn(name = "aluno", nullable = false)
    private Aluno aluno;
    //lista

}
