package Intermediario.Desafio4;

public class Main {
    public static void main(String[] args) {
        NinjaBasico Ninja = new NinjaBasico("Himawari",5,"Kunai");
        Ninja.mostrarInformacoes();
        Ninja.executarHabilidade();

        NinjaAvancado NarutoShippuden = new NinjaAvancado(
                "Naruto Uzumaki",
                16,
                "Racinshuriken",
                NinjaAvancado.TipoEspecialidade.NINJUTSU);
        NarutoShippuden.mostrarInformacoes();
        NarutoShippuden.executarHabilidade();
    }
}
