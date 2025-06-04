package com.mpss.Curso.Spring.Web.Thymileaf.Funcionarios;

import com.mpss.Curso.Spring.Web.Thymileaf.Missoes.MissoesModel;
import jakarta.persistence.*;

//Entity transforma uma classe em uma entidade de banco de dados.
@Entity
@Table(name = "cadastro_tb_pessoa")
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

    public CadastroModel() {
    }

    public CadastroModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
