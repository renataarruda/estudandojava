package AulaArray.src;

import java.util.Scanner;

public class AulaMatriz {
    public static void main(String[] args){
        int qtdmat=2, qtdaluno=3;

        int[][]notas=new int[qtdaluno][qtdmat];

        Scanner Entrada=new Scanner(System.in);
        int contal,contmat;

        for(contal=0;contal<qtdaluno;contal++){
            System.out.println("\n\nAluno "+(contal+1));
            for(contmat=0;contmat<qtdmat;contmat++){
                System.out.println("Digite a nota:");
                notas[contal][contmat]=Entrada.nextInt();
            }
        }

        System.out.println("Impressão das notas:");
        for(contal=0;contal<qtdaluno;contal++){
            System.out.println("");
            for(contmat=0;contmat<qtdmat;contmat++){
                System.out.println(" "+ notas[contal][contmat]+" ");
            }
        }
    }
}
