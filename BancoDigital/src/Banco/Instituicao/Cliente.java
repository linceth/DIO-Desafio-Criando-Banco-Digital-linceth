package Banco.Instituicao;

public class Cliente {
    private String nomeCliente;
    private int chavePix;
    private String endereco;
    private String profissao;

    public Cliente(String nomeCliente, int chavePix, String endereco, String profissao) {
        this.nomeCliente = nomeCliente;
        this.chavePix = chavePix;
        this.endereco = endereco;
        this.profissao = profissao;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    public String getEndereco() {
        return endereco;
    }

    public String getProfissao() {
        return profissao;
    }

    public int getChavePix() {
        return chavePix;
    }

    
    

    
}

