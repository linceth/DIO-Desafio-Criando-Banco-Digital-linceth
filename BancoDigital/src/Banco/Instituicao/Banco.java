package Banco.Instituicao;

import java.util.List;

public class Banco {
    private String nomeBanco;
    private String endereco;
    private int cnpj;
    private List<ContaBancaria>contas;

    public Banco(String nomeBanco, String endereco, int cnpj) {
        this.nomeBanco = nomeBanco;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public List<ContaBancaria> getContas() {
        return contas;
    }

    public void setContas(List<ContaBancaria> contas) {
        this.contas = contas;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getCnpj() {
        return cnpj;
    }
  
}

