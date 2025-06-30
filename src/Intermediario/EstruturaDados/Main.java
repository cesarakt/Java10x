package Intermediario.EstruturaDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Array
        //São estáticos e tem ref de memória
        String[] array = new String[3];
        array[0] = "Naruto Uzumaki";

        //List
        //São dinâmicas e tamanho aumenta e diminui conforme preciso
        List<String> listString = new ArrayList<>();
        listString.add("Naruto Uzumaki");

        //Stack - Pilha
        //LIFO = o Ultimo que entrou é o primeiro a sair.
        Stack<String> stackString = new Stack<>();
        //push() adicionar elemento na pilha
        //pop() retirar elemento da pilha
        //peek() verificar o proximo elemento da pilha
        //size() tamanho da pilha
        stackString.push("Naruto Uzumaki");
        stackString.push("Sasuke Uchiha");
        stackString.push("Sakura Haruno");
        stackString.push("Kakashi Hatake");
        System.out.println("Minha stack atual: "+stackString);
        stackString.pop();
        System.out.println("Minha stack atualizada com pop: "+stackString);
        System.out.println("Minha stack verificando o peek: "+stackString.peek());
        System.out.println("O tamanho da minha stack: "+stackString.size());
    }
}
