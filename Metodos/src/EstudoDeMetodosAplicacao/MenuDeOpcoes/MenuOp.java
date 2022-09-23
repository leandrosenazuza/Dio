package EstudoDeMetodosAplicacao.MenuDeOpcoes;

import EstudoDeMetodosAplicacao.Funções.Operacoes;
import EstudoDeMetodosAplicacao.Valores.Valor;

import javax.naming.ldap.Control;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class MenuOp {
    boolean control;
    Scanner sc = new Scanner(System.in);
    Operacoes operacoes = new Operacoes();
    Valor valorX = new Valor();
    Valor valorY = new Valor();
    Date dataHoraAtual = new Date();
    String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
    String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);

    public MenuOp() {
        this.control = true;
    }

    public void aplicacaoMenu(){

        do {
            System.out.println("Digite o primeiro valor: ");
            valorX.setValor(sc.nextLong());
            System.out.println("Digite o segundo valor: ");
            valorY.setValor(sc.nextLong());
            if (control == false) {
                break;
            }
            // Apresentacao Menu

            LocalDateTime agora = LocalDateTime.now();
            LocalDateTime tarde = LocalDateTime.parse("2000-12-01T12:00:01");
            LocalDateTime noite = LocalDateTime.parse("2000-12-01T18:00:01");
            if (agora.isAfter(tarde) && agora.isBefore(noite)) System.out.println("Boa tarde"); // Teste do Horario
            else if (agora.isAfter(noite)) System.out.println("Boa noite"); // Teste do Horario

            //System.out.println("Bom dia");
            System.out.println("Por favor, selecione uma opcao.");
            System.out.println("(1) Para soma,");
            System.out.println("(2) Para subtracao");
            System.out.println("(3) Para divisao,");
            System.out.println("(4) Para multiplicacao.");

            //Fim do menu

            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println(operacoes.soma(valorX.getValor(), valorY.getValor()));
                    break;
                case 2:
                    System.out.println(operacoes.subtracao(valorX.getValor(), valorY.getValor()));
                    break;
                case 3:
                    System.out.println(operacoes.divisao(valorX.getValor(), valorY.getValor()));
                    break;
                case 4:
                    System.out.println(operacoes.multiplicacao(valorX.getValor(), valorY.getValor()));
                    break;
                case 5:
                    control = false;
                    break;
            }
        }while (control);
    }
}

