package EstudoDeCollections;

import java.lang.reflect.Array;
import java.util.*;

public class EstudoArray {
    public static void main(String[] args) {
        boolean controlador = true;
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> listaGenerica = new ArrayList<>();

        //for(Double op : listaGenerica)
        try{
            do{
                System.out.println("Por favor, adicione um número a lista");
                listaGenerica.add(sc.nextDouble());
                System.out.println("Deseja adicionar mais: 1 para sim ou 0 para nao?");
                if (sc.nextInt() == 0) controlador = false;
            }while (controlador);
        }catch (ErroDeTipo e){
            e.printStackTrace();
        }

        System.out.println(Collections.min(listaGenerica));
        System.out.println(Collections.max(listaGenerica));
        Iterator<Double> iterator = listaGenerica.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma =+ next;
        }
        System.out.println(soma);
        
        



        System.out.println();






    }
}
