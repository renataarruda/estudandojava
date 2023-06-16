package AulaPratica.ExercicioUm;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args){
        double num1, num2;

        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        num1=entrada.nextDouble();
        System.out.println("Digite o segundo número:");
        num2=entrada.nextDouble();

        if(num1>num2){
            System.out.println("O primeiro número é o maior.");
        } else if(num2>num1){
            System.out.println("O segundo número é o maior");
        } else {
            System.out.println("Os números são iguais");
        }
    }
}
