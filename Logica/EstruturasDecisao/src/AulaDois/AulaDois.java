package AulaDois;

//(ok)1-criar variáveis;
//(ok)2-coletar as informações do usuário: buffer;
//(ok)3-calcular IMC: peso / (altura * altura);
//4-classificar.

import java.util.Scanner;

public class AulaDois {
    public static void main(String[] args) {
        double altura, peso, imc;
        Scanner Entrada= new Scanner(System.in); //cria o buffer

        System.out.println("Digite o seu peso: ");
        peso = Entrada.nextDouble();

        System.out.println("Digite a sua altura: ");
        altura = Entrada.nextDouble();

        imc=peso/(altura*altura);
        System.out.println("O IMC é igual a: "+imc);

        if(imc < 18.5){
            System.out.println("Abaixo do peso.");
        } else if(imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal.");
        } else if(imc >= 25 && imc < 30) {
            System.out.println("Acima do peso.");
        } else if(imc >= 30 && imc < 40) {
            System.out.println("Obesidade.");
        } else {
            System.out.println("Obesidade grave.");
        }
    }
}
