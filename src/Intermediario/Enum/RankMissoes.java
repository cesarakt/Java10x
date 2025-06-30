package Intermediario.Enum;

public enum RankMissoes {
    D("Baixo", 2),
    C("Moderado", 3),
    B("Confortavel", 4),
    A("Dificil", 5),
    S("Altissímo", 12);

    private String descricao;
    private int dificuldade;

    RankMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}
