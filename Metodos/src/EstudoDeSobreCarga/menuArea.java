package EstudoDeSobreCarga;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menuArea {
    boolean controle = true;
    int op = 0;
    List<formaGeometrica> lista = new ArrayList<formaGeometrica>();

    public void rotina(){

        try (Scanner sc = new Scanner(System.in)) {
            String continuar = "S";
            while ("S".equalsIgnoreCase(continuar)) {
                System.out.println("Você deseja adicionar uma forma geométrica?");
                continuar = sc.nextLine();
                if (!"S".equalsIgnoreCase(continuar)) break;
                else {
                    formaGeometrica forma = new formaGeometrica();
                    System.out.println("Voce ira digitar as dimensoes da forma");
                    System.out.println("Medidas nulas, digitar 0");
                    System.out.println("Digite o tamanho da base maior: ");
                    forma.setBaseMaior(sc.nextLong());
                    System.out.println("Digite o tamanho da base menor: ");
                    forma.setBaseMenor(sc.nextLong());
                    System.out.println("Digite o tamanho da altura");
                    forma.setAltura(sc.nextLong());
                    System.out.println("Digite o tipo de forma: ");
                    System.out.println("(1) Quadrado");
                    System.out.println("(2) Retangulo");
                    System.out.println("(3) Trapezio");
                    switch (sc.nextInt()){
                        case 1:
                            System.out.println(forma.calculoDaArea(forma.getBaseMaior()));
                            break;
                        case 2:
                            System.out.println(forma.calculoDaArea(forma.getBaseMaior(),
                                    forma.getBaseMenor()));
                            break;
                        case 3:
                            System.out.println(forma.calculoDaArea(forma.getBaseMaior(),
                                    forma.getBaseMenor(), forma.getAltura()));
                            break;
                    }

                }
            }
        }
    }
}