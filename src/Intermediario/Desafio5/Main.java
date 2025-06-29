package Intermediario.Desafio5;

public class Main {
    public static void main(String[] args) {
        //Conta corrente
        ContaCorrente contaCorrenteNaruto = new ContaCorrente(1000,TipoConta.CORRENTE);
        contaCorrenteNaruto.consultaSaldo();
        contaCorrenteNaruto.depositar(10);
        contaCorrenteNaruto.consultaSaldo();
        System.out.println("--------------------------------");
        //Conta poupança
        ContaPoupanca contaPoupancaNaruto = new ContaPoupanca(1000,TipoConta.POUPANCA);
        contaPoupancaNaruto.consultaSaldo();
        contaPoupancaNaruto.depositar(10);
        contaPoupancaNaruto.consultaSaldo();

    }
}
