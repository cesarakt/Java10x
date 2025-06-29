package Intermediario.Desafio5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo, TipoConta tipoConta) {
        super(saldo, TipoConta.CORRENTE);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("O valor: R$" +valor+" foi despositado com sucesso!");
        }
    }

    @Override
    public void consultaSaldo() {
        System.out.println("----- CONTA "+tipoConta+"------");
        super.consultaSaldo();
    }
}
