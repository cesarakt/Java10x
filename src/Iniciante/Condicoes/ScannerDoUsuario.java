package Iniciante.Condicoes;
import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
        * Scanner = o jeito de trazer os dados do usuário para a aplicação (Input)
        * Objetivo: Usuário criar um ninja
        * */

        Scanner caixaDeTexto = new Scanner(System.in);

        //Nome do ninja
        System.out.println("Escreva aqui o nome do ninja: ");
        String nomeNinja = caixaDeTexto.nextLine();

        System.out.println("O nome do ninja é: " + nomeNinja);

        //Idade do ninja
        System.out.println("Escreva aqui a idade do ninja: ");
        int idadeNinja = caixaDeTexto.nextInt();

        System.out.println("A idade do ninja é: "+ idadeNinja + " anos.");
        caixaDeTexto.close();
    }
}
