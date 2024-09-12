package Banco.Instituicao;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInformacoesComuns();
    }

    @Override
    public void pagarFaturaCartao(double valorFaturaCartao) {
        saldo = saldo - valorFaturaCartao;
    }

    
}
