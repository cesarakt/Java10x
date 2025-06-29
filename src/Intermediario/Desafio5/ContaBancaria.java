package Intermediario.Desafio5;

public abstract class ContaBancaria implements IConta {
    double saldo;
    TipoConta tipoConta;

    public ContaBancaria(double saldo, TipoConta tipoConta) {
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    @Override
    public abstract void depositar(double valor);

    @Override
    public void consultaSaldo() {
        System.out.println("O saldo atual é: R$"+saldo);
    }
}
