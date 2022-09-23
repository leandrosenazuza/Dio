package EstudoDeMetodosAplicacao.Aplicacao;

import EstudoDeMetodosAplicacao.Funções.Operacoes;
import EstudoDeMetodosAplicacao.MenuDeOpcoes.MenuOp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
       // System.out.println("yyyy/MM/dd HH:mm:ss-> " + dtf.format(LocalDateTime.now()));
        boolean control = true;

        MenuOp menuOp = new MenuOp();
        Operacoes operacao = new Operacoes();

        menuOp.aplicacaoMenu();

        System.out.println("Fim da Aplicacao");

    }
}