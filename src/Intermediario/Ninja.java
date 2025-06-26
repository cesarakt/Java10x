package Intermediario;

public abstract class Ninja implements EstrategiaDeCombate, ClasseNinja{
    String nome;
    int idade;
    String aldeia;
    String tipoEstrategia;
    int quantidadeEstrategia;

    @Override
    public void estrategiaDeBatalha(String tipo, int quantidadeEstrategia){
        System.out.println("Meu nome é "+nome+". Essa é minha estratégia de batalha do tipo "+tipo+" que eu uso por "+quantidadeEstrategia+" vezes.");
    }

    @Override
    public void ativarClasseNinja(){
        System.out.println("Eu ativei minha classe ninja");
    }
}
