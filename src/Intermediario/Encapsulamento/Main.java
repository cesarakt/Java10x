package Intermediario.Encapsulamento;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------Naruto---------");
        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", "Folha", 18, 20, 1.78 );
        System.out.println(Naruto.getNome());

        System.out.println("----------Sasuke---------");
        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", "Folha", 16, 32, 1.80);
        System.out.println(Sasuke.getNome());
        Sasuke.setNome("Sasuke");
        System.out.println(Sasuke.getNome());
    }
}
