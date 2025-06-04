package com.mpss.Curso.Spring.Web.Thymileaf.Funcionarios;

import com.mpss.Curso.Spring.Web.Thymileaf.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Entity transforma uma classe em uma entidade de banco de dados.
@Entity
@Table(name = "cadastro_tb_pessoa")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CadastroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // Um funcionario tem uma unica missão.
    @ManyToOne
    @JoinColumn(name = " missoes_id") // chave estrangeira
    private MissoesModel missoes;

}
