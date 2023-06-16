package AulaDoWhile;

import java.util.Scanner;

//Programa calcula IMC para diversas pessoas
//boolean + laço de repetição
//criar a variável
/*do {
    coletar os dados
    calcular o IMC
    exibir o resultado na tela
    } devo continuar?
 */
public class AulaDoWhile {
    public static void main(String[] args){
        double altura, peso, imc;
        Scanner Entrada= new Scanner(System.in); //cria o buffer
        boolean continuar=true;
        int opt;

        do {
            System.out.println("Digite o seu peso: ");
            peso = Entrada.nextDouble();

            System.out.println("Digite a sua altura: ");
            altura = Entrada.nextDouble();

            imc=peso/(altura*altura);
            System.out.println("O IMC é igual a: "+imc);

            System.out.println("Encerrar(0) ou calcular novo IMC(Digite outro número)?");
            opt=Entrada.nextInt();

            if(opt==0){
                continuar=false;
            }

        } while(continuar);
        System.out.println("FIM DO PROGRAMA!");
    }
}
