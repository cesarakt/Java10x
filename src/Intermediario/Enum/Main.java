package Intermediario.Enum;

public class Main {
    public static void main(String[] args) {
        Missoes missao1 = new Missoes("Resgatar cachorro", RankMissoes.D);
        missao1.exibirDetalhes();

        Missoes missao2 = new Missoes("Derrotar Zabuza", RankMissoes.A);
        missao2.exibirDetalhes();
    }
}
