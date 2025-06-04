package com.mpss.Curso.Spring.Web.Thymileaf.Missoes;

import com.mpss.Curso.Spring.Web.Thymileaf.Funcionarios.CadastroModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    // Uma missão pode ter varios funcionarios.
    @OneToMany(mappedBy = "missoes")
    private List<CadastroModel> funcionario;

}
