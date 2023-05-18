package br.com.AUTH.pessoa.model;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa{
    private String CPF;

    public PessoaFisica() {
    }

    public PessoaFisica(long id, String nome, LocalDate nascimento, String CPF) {
        super(id, nome, nascimento);
        this.CPF = CPF;
    }

    public PessoaFisica(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "CPF='" + CPF + '\'' +
                "} " + super.toString();
    }
}
