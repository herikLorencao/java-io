package br.com.alura.teste;

import java.io.Serializable;

public class Cliente implements Serializable {

    private static final Long serialVersionUID = 1L;

    private String nome;
    private String profissao;
    private String cpf;

    public Cliente(String nome, String profissao, String cpf) {
        this.nome = nome;
        this.profissao = profissao;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", profissao='" + profissao + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
