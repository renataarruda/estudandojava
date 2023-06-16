package Strings.src;

import java.io.*;
import java.util.Scanner;

//Programa para cadastro de endereço;
//Logradouro, nome, número, bairro - tamanho 4

//Etapas:
/*Cadastro do endereço

Pedir para o usuário digitar:
    1. logradouro
    2. nome
    3. número
    4. bairro

Matriz: quantidade de endereços [2] - linha
        quantidade de elementos do endereço [4] - coluna

 2 linhas e 4 colunas

Imprimir endereços cadastrados*/

public class ProjetoUm {
    public static void main(String[] args){
        int linhas=1,colunas=4;
        Scanner Entrada=new Scanner(System.in);
        Scanner Entrada1=new Scanner(System.in);

        String[][] endereco =new String [linhas][colunas];

        System.out.println("CADASTRO DE INFORMAÇÕES");
        int contli, contcol;

        for(contli=0; contli<linhas; contli++ ){
            System.out.println("Endereço:");
            System.out.println("Informe o tipo de logradouro:");
            endereco[contli][0]=Entrada.next();
            System.out.println("Informe o nome do logradouro:");
            endereco[contli][1]=Entrada1.nextLine();
            System.out.println("Informe o número:");
            endereco[contli][2]=Entrada.next();
            System.out.println("Informe o bairro:");
            endereco[contli][3]=Entrada1.nextLine();
        }

        //Salvando as informações em um arquivo:
        //abrir um arquivo          (ok)
        //criar um buffer           (ok)
        //fechar o arquivo          (ok)
        //tratamento de exceções    (ok)

        try {
            FileWriter arquivo = new FileWriter("C:\\Users\\Alanis\\Desktop\\XPE\\exemplo\\dados.txt", true);
            PrintWriter gravararquivo = new PrintWriter(arquivo);

            for (contli = 0; contli < linhas; contli++) {
                gravararquivo.print(endereco[contli][0].toUpperCase());
                gravararquivo.print(" " + endereco[contli][1].toUpperCase() + ";");
                gravararquivo.print(" NÚMERO: " + endereco[contli][2] + ";");
                gravararquivo.print(" BAIRRO: " + endereco[contli][3].toUpperCase() + ".");
                gravararquivo.println();
            }

            gravararquivo.close();
            arquivo.close();
        }catch(IOException e) {
            System.out.println("Deu erro na gravação.");
        }

        System.out.println("PROGRAMA FINALIZADO.");

        //Ler arquivo
        //
        try {
            FileReader lerarquivo = new FileReader("C:\\Users\\Alanis\\Desktop\\XPE\\exemplo\\dados.txt");
            BufferedReader bufleitura = new BufferedReader(lerarquivo);

            String linha;
            linha=bufleitura.readLine();

            while(linha != null){
                System.out.println(linha);
                linha=bufleitura.readLine();
            }

            bufleitura.close();
            lerarquivo.close();
        }catch(IOException e) {
            System.out.println("Deu erro na leitura");
        }

        /*
        Imprimindo os arquivos

        for(contli=0; contli<linhas; contli++){
            System.out.println("\nEndereço: "+(contli+1)+":");
            System.out.print(" "+endereco[contli][0].toUpperCase());
            System.out.print(" "+endereco[contli][1].toUpperCase()+",");
            System.out.print(" NÚMERO: "+endereco[contli][2]+",");
            System.out.print(" BAIRRO: "+endereco[contli][3].toUpperCase()+".");
        }
         */
    }
}
