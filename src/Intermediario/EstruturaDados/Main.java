package Intermediario.EstruturaDados;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("------ ARRAY ------");
        //Array
        //São estáticos e tem ref de memória
        String[] array = new String[3];
        array[0] = "Naruto Uzumaki";
        System.out.println(array);
        System.out.println(array[0]);

        System.out.println("------ LIST ------");
        //List
        //São dinâmicas e tamanho aumenta e diminui conforme preciso , geralmente lentas para adicionar ou remover elementos.
        List<String> listString = new ArrayList<>();
        listString.add("Naruto Uzumaki");
        System.out.println(listString);
        System.out.println(listString.get(0));

        System.out.println("------ STACK ------");
        //Stack - Pilha
        //FILO = o primeiro que entra é o ultimo que sai.
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

        System.out.println("------ QUEUE ------");
        //Queue - filas FIFO - primeiro a entrar é o primeiro a sair
        //Head - Primeiro, Tail - Último
        Queue<String> fila = new LinkedList<>();
        fila.add("Naruto Uzumaki");
        fila.add("Sasuke Uchiha");
        fila.add("Sakura Haruno");
        fila.add("Kakashi Hatake");
        System.out.println(fila);
        //Retira o Head da fila
        fila.poll();
        System.out.println(fila);
        //Verificar o primeiro Head
        System.out.println(fila.peek());
        //Verificar se a fila esta vazia
        fila.clear();
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia");
        };

        System.out.println("-------SET-------");
        //Set - São usados para listas que ignoram valores duplicados, porém não contem ordenação (indices)
        //Usa-se quando não se importa com ordenação e valores duplicados
        Set<String> ninjas = new HashSet<>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Kakashi Hatake");
        ninjas.add("Naruto Uzumaki");
        System.out.println(ninjas);

        //TreeSet ele ordena a lista de acordo com o tipo usado, ex: String(Alfabetica),Integer(Numerica)...
        //LinkedHashSet ordena os itens da lista com base na ordem de implementação do item
    }
}
