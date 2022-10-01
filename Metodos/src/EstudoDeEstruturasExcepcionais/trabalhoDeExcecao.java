package EstudoDeEstruturasExcepcionais;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class trabalhoDeExcecao {
    public static void main(String[] args) {
        try{
            String cepFormatado = formatarCep("237965064");
            System.out.println(cepFormatado);
        }catch (CepInvalidoException e){
            System.out.println("Cep nao corresponde");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8) throw new CepInvalidoException();

        return "23.765-064";
    }
}
