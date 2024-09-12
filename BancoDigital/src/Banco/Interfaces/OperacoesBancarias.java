package Banco.Interfaces;

import Banco.Instituicao.ContaBancaria;

public interface OperacoesBancarias {
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract void transferir(double valor, ContaBancaria contaDestino);
    public abstract void imprimirExtrato();
    public abstract void pagarFaturaCartao(double valor);
}

