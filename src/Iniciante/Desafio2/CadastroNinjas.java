package Iniciante.Desafio2;

import java.util.Scanner;

public class CadastroNinjas {
    public static void main(String[] args) {
        String[] ninjas = new String[3];
        Scanner scanner = new Scanner(System.in);
        int countPosicao = 0;
        int itemMenu = 0;

        while (itemMenu < 4) {
            //Menu
            System.out.println("Menu");
            System.out.println("1: Cadastrar um ninja");
            System.out.println("2: Visualizar um ninja");
            System.out.println("3: Alterar o nome de um ninja");
            System.out.println("4: Encerrar o programa");
            itemMenu = scanner.nextInt();
            scanner.nextLine();
            switch (itemMenu) {
                case 1:
                    if (!(countPosicao > 2)) {
                        System.out.println("Digite o nome de um ninja:");
                        ninjas[countPosicao] =  scanner.nextLine();
                        System.out.println("Ninja Cadastrado com sucesso!");
                        System.out.println("O nome do ninja cadastrado na posição "+countPosicao+" é: "+ ninjas[countPosicao]);
                        countPosicao++;
                    }else {
                    System.out.println("Não é possível mais cadastrar um ninja.");
                    };
                    break;
                case 2:
                    System.out.println("Escolha uma posição para visualizar:");
                    int IdninjaExibicao = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("O Ninja escolhido é: "+ninjas[IdninjaExibicao]);
                    break;
                case 3:
                    System.out.println("Escolha um ninja para alterar:");
                    for (int i = 0; i < ninjas.length ; i++) {
                        System.out.println(i+": "+ninjas[i]);
                    }
                    int posicaoNinja = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o valor para alteração:");
                    String valorAlteracao = scanner.nextLine();
                    ninjas[posicaoNinja] = valorAlteracao;
                    System.out.println("Valor alterado com sucesso!");
                    break;
                case 4:
                    System.out.println("Encerrado!");
                    break;
                default:
                    System.out.println("A opção do menu não é válida");
                    itemMenu =  0;
            }
        }
        scanner.close();

        //Nome do ninja
        //System.out.println("Escreva aqui o nome do ninja: ");
        //ninjas[countPosicao] = scanner.nextLine();


    }
}
