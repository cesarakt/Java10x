package Intermediario.Desafio4;

public class NinjaAvancado extends NinjaBasico implements INinja{
    public enum TipoEspecialidade {
        NINJUTSU,
        TAIJUTSU,
        GENJUTSU;
    }

    public NinjaAvancado() {
        super();
    }

    public NinjaAvancado(String nome, int idade, String habilidade, TipoEspecialidade especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    TipoEspecialidade especialidade;

    @Override
    public void executarHabilidade() {
        System.out.println("Executou a habilidade "+habilidade);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome é "+nome+" com "+idade+" anos e eu tenho a especialidade "+especialidade+" e a habilidade "+ habilidade);
    }

}
