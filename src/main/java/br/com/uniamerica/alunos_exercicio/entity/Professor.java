package br.com.uniamerica.alunos_exercicio.entity;

import br.com.uniamerica.alunos_exercicio.entity.Aluno;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table (name = "professor", schema = "public")

public class Professor {
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;


    @Getter @Setter
    @Column(name = "nome", nullable = false)
    private String nome;

    @Getter
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "aluno_professor",
            uniqueConstraints = @UniqueConstraint(columnNames = {
                "professor_id",
                "aluno_id"
            }
    ),
            joinColumns = @JoinColumn(
                    name = "professor_id"),
            inverseJoinColumns = @JoinColumn(
                    name = "aluno_id"
            )
    )

     private List<Aluno> alunos;




}
