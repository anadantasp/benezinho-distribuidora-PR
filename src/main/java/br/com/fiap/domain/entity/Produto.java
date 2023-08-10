package br.com.fiap.domain.entity;

import java.math.BigDecimal;

public class Produto {
    private Long id;
    private String Nome;
    private String Descricao;
    private BigDecimal valor;

    public Produto() {
    }

    public Produto(Long id, String nome, String descricao, BigDecimal valor) {
        this.id = id;
        Nome = nome;
        Descricao = descricao;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public Produto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return Nome;
    }

    public Produto setNome(String nome) {
        Nome = nome;
        return this;
    }

    public String getDescricao() {
        return Descricao;
    }

    public Produto setDescricao(String descricao) {
        Descricao = descricao;
        return this;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Produto setValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", Nome='" + Nome + '\'' +
                ", Descricao='" + Descricao + '\'' +
                ", valor=" + valor +
                '}';
    }
}
