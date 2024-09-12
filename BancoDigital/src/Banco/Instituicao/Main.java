package Banco.Instituicao;

public class Main {
    public static void main(String[] args) {
        Cliente client1 = new Cliente("Marcos",256754, "Rua A, 76", "Pedreiro");
        Cliente client2 = new Cliente("Mariana",564328, "Rua Groselhas, 765", "Boleira");
        Cliente client3 = new Cliente("José Gonçalves",658965, "Rua R, 234", "Advogado");
        
        //client1.setNomeCliente("Thiago");

        ContaBancaria cc1 = new ContaCorrente(client1);
        ContaBancaria cc2 = new ContaCorrente(client2);
        ContaBancaria cc3 = new ContaCorrente(client3);
        
        ContaBancaria cp1 = new ContaPouanca(client1);
        ContaBancaria cp2 = new ContaPouanca(client2);
        ContaBancaria cp3 = new ContaPouanca(client3);
       

        cc1.depositar(5000);
        cc1.imprimirExtrato();
        //cc1.pagarFaturaCartao(1400);
        cc1.transferir(2000,cp1);
        cp1.pagarFaturaCartao(800);
        cc1.imprimirExtrato();
        cp1.imprimirExtrato();

        cc2.depositar(2000);
        cc2.imprimirExtrato();
        cc2.pagarFaturaCartao(400);
        cc2.transferir(200,cp2);
        cc2.imprimirExtrato();
        cp2.imprimirExtrato();

        cc3.depositar(7000);
        cc3.imprimirExtrato();
        cc3.transferir(4000,cp3);
        cp3.pagarFaturaCartao(1000);
        cc3.imprimirExtrato();
        cp3.imprimirExtrato();
    }
}

