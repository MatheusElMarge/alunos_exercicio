package br.com.uniamerica.alunos_exercicio.entity;

import br.com.uniamerica.alunos_exercicio.entity.Aluno;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table (name = "curso", schema = "public")
public class Curso {
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter @Setter
    @Column (name = "nomeAluno", nullable = false)
    private String nome;


    @Getter @Setter
    @Column (name = "cargaHoraria", nullable = false)
    private BigDecimal cargaHoraria;

    @Getter @Setter
    @ManyToMany
    @JoinTable(name = "alunoCurso", joinColumns = @JoinColumn (name = "curso"), inverseJoinColumns= @JoinColumn(name ="aluno"))
    private List<Aluno> aluno;





}
