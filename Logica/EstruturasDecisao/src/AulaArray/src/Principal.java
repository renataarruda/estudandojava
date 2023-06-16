package AulaArray.src;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int soma=0, tam=5, cont;
        int[]notas=new int[tam];

        Scanner Teclado=new Scanner(System.in);
        for(cont=0;cont<tam;cont++) {
            System.out.println("Digite a nota "+(cont+1));
            notas[cont]=Teclado.nextInt();
            soma+=notas[cont];
        }
        System.out.println("A soma é: "+soma);
    }
}