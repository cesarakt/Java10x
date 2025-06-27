package Intermediario.HerancasMultiplas;

import Intermediario.Uchiha;

public class Main {
    public static void main(String[] args) {

        //Obj Uchiha
        Uchiha Sasuke = new Uchiha(
                "Sasuke",
                18,
                "Folha"
        );
        Sasuke.ativarSharingan();

        //Obj Hatake
        Hatake Kakashi = new Hatake(
                "Kakashi",
                30,
                "Folha"
        );
        Kakashi.boasVindas();
        Kakashi.ativarSharingan();
        Kakashi.ninjaDeElite();


    }
}
