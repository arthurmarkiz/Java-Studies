package OOP.lists;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Marta");
        myList.add("Arthur");
        myList.add("Bob");
        myList.add("Carlito");
        myList.add(2, "Marco");

        for (String name : myList) {
            System.out.println(name);
        }

        System.out.println("Tamanho da lista: " + myList.size());
        System.out.println("---------------------");

        myList.remove("Marta");
        myList.remove(3);

        // Removendo por predicado(lambda function):
        // Ex: remova todos os valores que começam com a letra M.
        myList.removeIf(x -> x.charAt(0) == 'M');

        for (String name : myList) {
            System.out.println(name);
        }

        System.out.println("Tamanho da lista: " + myList.size());
        System.out.println("Index of Arthur: " + myList.indexOf("Arthur"));
        System.out.println("Index of Banana: " + myList.indexOf("Banana"));
        System.out.println("---------------------");

        // Filtrar elementos com a função .filter utilizando funções lambda.
        // É necessário converter para 'stream' para conseguir utilizar uma função lambda
        // na lista e depois retornar de 'stream' para 'list'.
        List<String> result = myList.stream().filter(x -> x.charAt(0) == 'A').toList();
        for (String name : result) {
            System.out.println(name);
        }
        System.out.println("Tamanho da lista (result): " + result.size());

    }
}
