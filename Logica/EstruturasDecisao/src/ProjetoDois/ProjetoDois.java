package ProjetoDois;

import java.util.Scanner;

public class ProjetoDois {
    public static void main(String[] args) {
        int num1, num2=20, num3;

        Scanner Entrada= new Scanner (System.in);
        System.out.println("Digite um número inteiro qualquer");
        num1=Entrada.nextInt();
        num2+=num1;
        if((num1%2)==0){
            num3= num1*4;
        }else if((num2%3)==0){
            num3=num2+2*num1;
        }else{
            num3=num2;
        }
        System.out.println("O valor de Num3 é = "+num3);
        System.out.println(num2);
    }
}
