import java.util.Scanner;

//Recursividade: assim como fatorial, tem um caso base que se repete sempre e os outros casos.

public class Funcoes {

    static double digitaNumero() {
        System.out.println("Digite um número");
        Scanner Entradanum=new Scanner(System.in);
        double aux=Entradanum.nextDouble();
        return aux;
    }
    static double soma(double a, double b){
        return (a + b);
    }

    //Sobrecarga: funções com o mesmo número, que se diferenciam pelos
    //parâmetros, tipos ou pelo retorno.

    static double soma(double a, double b, double c){
        return (a + b + c);
    }

    static double soma(double a, double b, double c, double d){
        return (a + b + c + d);
    }
    static double sub(double a, double b){
       return (a-b);
    }

    //Fatorial recursiva
    static double fatorial (double num) {
        if(num==1){
            return 1;
        } else{
            return (num*fatorial(num-1));
        }
    }

    static void menu(){
        System.out.println("CALCULADORA");
        System.out.println("Digite 1 para Soma entre 2 números");
        System.out.println("Digite 2 para Soma entre 3 números");
        System.out.println("Digite 3 para Soma entre 4 números");
        System.out.println("Digite 4 para Subtração");
        System.out.println("Digite 0 para Sair");
    }

    public static void main(String[] args) {
        double a, b, c, d, resultado;
        int opt;
        boolean continuar=true;
        Scanner Entrada=new Scanner(System.in);


        do{
            menu();
            opt=Entrada.nextInt();

            switch (opt){
                case 1:
                    a=digitaNumero();
                    b=digitaNumero();
                    resultado=soma(a,b);
                    System.out.println("Resultado: "+resultado+"\n\n\n");
                    break;
                case 2:
                    a=digitaNumero();
                    b=digitaNumero();
                    c=digitaNumero();
                    resultado=soma(a,b,c);
                    System.out.println("Resultado: "+resultado+"\n\n\n");
                    break;
                case 3:
                    a=digitaNumero();
                    b=digitaNumero();
                    c=digitaNumero();
                    d=digitaNumero();
                    resultado=soma(a,b,c,d);
                    System.out.println("Resultado: "+resultado+"\n\n\n");
                    break;
                case 4:
                    a=digitaNumero();
                    b=digitaNumero();
                    resultado=sub(a,b);
                    System.out.println("Resultado: "+resultado+"\n\n\n");
                    break;
                case 0:
                    continuar=false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while(continuar);
        System.out.println("FIM DO PROGRAMA");
    }
}
