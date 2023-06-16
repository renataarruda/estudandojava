package AulaSwitch;

import java.util.Scanner;

// Programa para perguntar um número de 1 a 7 e informar o dia da semana
// Receber informações do usuário;
// Gerar dia correspondente

public class AulaSwitch {
    public static void main(String[] args) {
        int diaDaSemana;
        Scanner Entrada= new Scanner(System.in);

        System.out.println("Qual o número do dia? (Digite de 1 a 7)");
        diaDaSemana = Entrada.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println("O dia é Domingo.");
                break;
            case 2:
                System.out.println("O dia é Segunda.");
                break;
            case 3:
                System.out.println("O dia é Terça.");
                break;
            case 4:
                System.out.println("O dia é Quarta.");
                break;
            case 5:
                System.out.println("O dia é Quinta.");
                break;
            case 6:
                System.out.println("O dia é Sexta.");
                break;
            case 7:
                System.out.println("O dia é Sábado.");
                break;
            default:
                System.out.println("Dígito inválido.");
                break;
        }

    }
}
