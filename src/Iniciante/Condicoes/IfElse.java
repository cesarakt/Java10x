package Iniciante.Condicoes;

public class IfElse {
    public static void main(String[] args) {
        /*
        * Passar o nível do ninja de acordo com o numero de missões
        *
        * */

        //Ninja Naruto
        String nome = "Naruto";
        int idade = 16;
        boolean hokage = false;
        short numeroMissoes = 10;

        if (numeroMissoes > 10) {
            System.out.println("Naruto esta pronto para passar de nível.");
        }else {
            System.out.println("O Naruto não completou o número de missões minimo");
        }



    }
}
