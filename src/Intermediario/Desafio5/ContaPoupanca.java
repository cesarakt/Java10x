package Intermediario.Desafio5;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(double saldo, TipoConta tipoConta) {
        super(saldo, TipoConta.POUPANCA);
    }

    @Override
    public void depositar(double valor) {
        double taxaDeposito = 0.001;
        double deducao = valor * taxaDeposito;
        saldo = saldo - deducao;
        System.out.println("O valor de : "+valor+" foi depositado com uma taxa no valor de "+deducao);
    }

    @Override
    public void consultaSaldo() {
        System.out.println("----- CONTA "+tipoConta+"------");
        super.consultaSaldo();
    }
}
