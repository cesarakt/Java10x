package Intermediario.Desafio4;

public class NinjaBasico implements Ninja {
    String nome;
    int idade;
    String habilidade;

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public NinjaBasico() {
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Executou a habilidade básica");
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Meu nome é "+nome+" com "+idade+" anos e a habilidade "+ habilidade);
    }

}
