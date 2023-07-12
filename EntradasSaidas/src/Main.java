import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Entradas e saídas de dados

        int idade = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome:");
        String nome = sc.next();


        System.out.println("Digite a idade:");
        idade = sc.nextInt();

        if (idade < 0)
            System.out.println("Idade inválida.");

        if (idade < 18)
            System.out.println("Menor de idade.");

        if (idade >= 18 && idade < 70)
            System.out.println("Maior de idade.");

        if (idade >= 70)
            System.out.println("Terceira idade.");

        if (idade >= 100)
            System.out.println("Centenária.");
    }
}