package Intermediario;

import Intermediario.HerancasMultiplas.ISharingan;

public class Uchiha extends Ninja implements ISharingan {
    public Uchiha() {
        super();
    }

    public Uchiha(String nome, int idade, String aldeia ){
        super(nome, idade, aldeia);
    }

    public Uchiha(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void ativarSharingan() {
        System.out.println("Meu nome é "+nome+" o Sharingan foi ativado! Eu sou um uchiha");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Essa é minha inteligencia de combate");
    }

    //Sobrecarga de metodos (Overload)
    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu qi é " +qi+ " você é um gênio.");
        } else if (qi >= 130) {
            System.out.println("Seu qi é " +qi+ " você é um ninja promissor.");
        } else {
            System.out.println("Seu qi é " +qi+ " você precisa treinar mais.");
        }
    }
}
