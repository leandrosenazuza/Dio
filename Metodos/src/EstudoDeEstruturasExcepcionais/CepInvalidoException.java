package EstudoDeEstruturasExcepcionais;

import java.util.ArrayList;
import java.util.List;

public class CepInvalidoException extends Exception{
    public static void main(String[] args) {
        //Primeira situação
        //Criar uma lista e adicionar 7 notas

        List<String> notas = new ArrayList<>();
        notas.add("Lucas");
        notas.add("joao");
        notas.add("manual");
        notas.add("tiao");
        notas.add("7d");
        notas.add("7d");
        notas.add("6d");
        System.out.println(notas.toString()); // mostrar todos elementos da lista

        for(String a : notas)
            System.out.println(a); // mostrar todos elementos da lista

        //mostrar um elemento de uma posição específica
        System.out.println(notas.indexOf(6d));
        notas.set(notas.indexOf("joao"),"leandro");
        System.out.println(notas.toString());

        //contem objeto?
        System.out.println("Contem ?" + notas.contains("leandro"));

    }
}
