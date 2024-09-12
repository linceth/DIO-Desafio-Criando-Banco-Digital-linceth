package Banco.Instituicao;

public class ContaPouanca extends ContaBancaria{
    public ContaPouanca(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInformacoesComuns();
    }

    @Override
    public void pagarFaturaCartao(double valorFaturaCartao) {
        saldo = saldo - valorFaturaCartao;
    }

    

    
}
