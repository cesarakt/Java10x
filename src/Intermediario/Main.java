package Intermediario;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Criar o ninja naruto
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 17;
        Naruto.aldeia = "Aldeia da folha";
        Naruto.ativarChakraUzumaki();
        Naruto.estrategiaDeBatalha("Força bruta",100);
        Naruto.ativarClasseNinja();

        //Criar ninja Sasuke Uchiha
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.ativarSharingan();
        Sasuke.inteligenciaDeCombate();
        Sasuke.inteligenciaDeCombate(150);

        //Criar ninja Hinata Hyuuga
        Hyuuga Hinata = new Hyuuga();
        Hinata.nome = "Hinata Hyuuga";
        Hinata.aldeia = "Aldeia da folha";
        Hinata.idade = 18;
        Hinata.ativarByakugan();

        Uchiha Madara = new Uchiha(
                "Madara",
                40,
                "Folha",
                20,
                NivelNinja.HOKAGE
        );

        //Criar ninja Boruto Uzumaki Hyuuga
        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Uzumaki Hyuuga";
        Boruto.aldeia = "Aldeia da folha";
        Boruto.idade = 18;
        Boruto.ativarChakraUzumaki();
        Boruto.ativarJougan();
        Boruto.ativarOKarma();

        Hokages Hashirama = new Hokages();

        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Kakashi Hatake");
        ninjas.add("Tobirama Senju");

        System.out.println("Ninjas : " + ninjas);

        ninjas.remove("Kakashi Hatake");
        System.out.println("Ninjas : " + ninjas);

        ninjas.set(1, "Kiba Inuzuka");
        System.out.println("Ninjas: "+ninjas);

        System.out.println("Quantidade ninjas : "+ninjas.size());


    }
}
