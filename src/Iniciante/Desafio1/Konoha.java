package Iniciante.Desafio1;

public class Konoha {
    public static void main(String[] args) {
        //Ninja 1
        String nomeNinja1 = "Naruto";
        int idadeNinja1 = 15;
        String missao = "Caçar ninjas inimigos";
        char nivelDificuldade = 'A';
        String statusMissao = idadeNinja1 < 15 && (nivelDificuldade == 'C' || nivelDificuldade == 'D') ? "Concluída" : "Não concluída" ;

        System.out.println("O nome é: " + nomeNinja1);
        System.out.println("A idade é: "+ idadeNinja1);
        System.out.println("A missão atribuída foi: "+missao+" com a dificuldade "+ nivelDificuldade+" e o status: "+statusMissao);

        //Ninja 2
        String nomeNinja2 = "Hinata";
        int idadeNinja2 = 13;
        missao = "Informações de outras aldeias";
        nivelDificuldade = 'D';
        statusMissao = idadeNinja2 < 15 && (nivelDificuldade == 'C' || nivelDificuldade == 'D') ? "Concluída" : "Não concluída";

        System.out.println("O nome é: " + nomeNinja2);
        System.out.println("A idade é: "+ idadeNinja2);
        System.out.println("A missão atribuída foi: "+missao+" com a dificuldade "+ nivelDificuldade+" e o status: "+statusMissao);

        //Ninja 1
        String nomeNinja3 = "Rock lee";
        int idadeNinja3 = 17;
        missao = "Aprender ninjutu";
        nivelDificuldade = 'S';
        statusMissao = idadeNinja3 < 15 && (nivelDificuldade == 'C' || nivelDificuldade == 'D') ? "Concluída" : "Não concluída";

        System.out.println("O nome é: " + nomeNinja3);
        System.out.println("A idade é: "+ idadeNinja3);
        System.out.println("A missão atribuída foi: "+missao+" com a dificuldade "+ nivelDificuldade+" e o status: "+statusMissao);

    }

}
