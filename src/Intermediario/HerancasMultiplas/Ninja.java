package Intermediario.HerancasMultiplas;

import Intermediario.IClasseNinja;
import Intermediario.IEstrategiaDeCombate;
import Intermediario.NivelNinja;

public abstract class Ninja implements IEstrategiaDeCombate, IClasseNinja {
    //TODO: Criar 2 novos atributos : numeroDeMissoesConcluidas , rank
    //TODO: rank: Genin, Chunnin, Jounnin, Hokage
    String nome;
    int idade;
    String aldeia;
    String tipoEstrategia;
    int quantidadeEstrategia;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja(){

    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    //TODO: Sobrecarga (Overload) do construtor chamando os novos atributos
    public Ninja(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, idade, aldeia);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    @Override
    public void estrategiaDeBatalha(String tipo, int quantidadeEstrategia){
        System.out.println("Meu nome é "+nome+". Essa é minha estratégia de batalha do tipo "+tipo+" que eu uso por "+quantidadeEstrategia+" vezes.");
    }

    @Override
    public void ativarClasseNinja(){
        System.out.println("Eu ativei minha classe ninja");
    }
}
