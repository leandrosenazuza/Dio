package EstudoDeSobreCarga;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menuArea {
    boolean controle = true;
    int op = 0;
    List<formaGeometrica> lista = new ArrayList<formaGeometrica>();


        do

    {

        try (Scanner sc = new Scanner(System.in)) {
            String continuar = "s";
            while ("S".equalsIgnoreCase(continuar)){
                System.out.println("Você deseja adicionar uma forma geométrica?");
                    continuar = sc.nextLine();
                    if ("S".equalsIgnoreCase(continuar)) break;
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

                        System.out.println;
                    }
            }



            System.out.println("Você deseja adicionar uma forma geométrica?");
            System.out.println("Digite S para sim e N para não");
            if ()
                System.out.println("(1) Quadrado");
            System.out.println("(2) Retangulo");
            System.out.println("(3) Trapezio");
            System.out.println("(4) Sair");

            switch (op) {
                case 1:
                    System.out.println("Area do quadrado e: " +);
                    break;
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    break;
            }

        } while (controle)
    }
}