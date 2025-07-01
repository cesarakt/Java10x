package Intermediario.Desafio6;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Iniciar uma Linked List de ninjas com 7 ninjas
        Ninja Naruto = new Ninja("Naruto Uzumaki", 18,"Folha");
        Ninja Sasuke = new Ninja("Sasuke Uchiha", 19,"Folha");
        Ninja Sakura = new Ninja("Sakura Haruno", 16,"Folha");
        Ninja RockLee = new Ninja("Rock Lee", 18,"Folha");
        Ninja Hynata = new Ninja("Hynata Hyuuga", 16,"Folha");
        Ninja Tobirama = new Ninja("Tobirama Senju", 40,"Folha");
        Ninja Kakashi = new Ninja("Kakashi Hatake", 30,"Folha");

        LinkedList<Ninja> listaNinjas = new LinkedList<>();
        listaNinjas.add(Naruto);
        listaNinjas.add(Sasuke);
        listaNinjas.add(Sakura);
        listaNinjas.add(RockLee);
        listaNinjas.add(Hynata);
        listaNinjas.add(Tobirama);
        listaNinjas.add(Kakashi);
        //Listar os ninjas
        listaNinjas.forEach(ninja -> {
            System.out.println(ninja);
        });
        System.out.println("---------------------");
        //Adicionar o ninja no início da lista
        Ninja Tsunade = new Ninja("Tsunade", 60, "Folha");
        listaNinjas.addFirst(Tsunade);
        System.out.println("O ninja adicionado no início foi: "+listaNinjas.getFirst());
        System.out.println("Lista atualizada");
        listaNinjas.forEach(ninja -> {
            System.out.println(ninja);
        });

        System.out.println("---------------------");
        //Remover o ninja no início da lista
        System.out.println("O ninja a ser removido foi: "+listaNinjas.getFirst());
        listaNinjas.removeFirst();

        //Listar os ninjas
        System.out.println("Lista atualizada");
        listaNinjas.forEach(ninja -> {
            System.out.println(ninja);
        });
        //Procurar um ninja por indice
        System.out.println("Selecione um índice para buscar o ninja");
        Scanner scanner = new Scanner(System.in);
        int indice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("O ninja escolhido foi: "+listaNinjas.get(indice));
        scanner.close();
    }
}
