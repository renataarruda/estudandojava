package ProjetoTres;

import java.util.Scanner;
public class ProjetoTres {
    public static void main(String[] args) {
        int aux;
        boolean avista, carronovo, seguir;
        double desconto, valorcarro;
        Scanner Entrada = new Scanner(System.in);
        do {
            desconto = 0.0;
            avista = false;
            carronovo = false;
            seguir = false;
            System.out.println("PROGRAMA PARA VENDA DE CARRO \n\n\nDigite o valor do Carro (ex: 75000)");
            valorcarro = Entrada.nextDouble();
            System.out.println("O pagamento será à vista? Sim (Aperte 1), Não (Aperte outro número)");
            aux = Entrada.nextInt();
            if (aux == 1)
                avista = true;
            System.out.println("O carro escolhido é o 0 KM? Sim (Aperte 1), Não (Aperte outro número)");
            aux = Entrada.nextInt();
            if (aux == 1)
                carronovo = true;
            if ((avista == true) && (carronovo == true)) {
                desconto = 0.15;
            } else if (avista == true) {
                desconto = 0.08;
            } else if (carronovo == true) {
                desconto = 0.05;
            } else {
                System.out.println("Ofereça um Café para o cliente.");
            }
            valorcarro = (valorcarro * desconto);
            System.out.println("Valor final para pagamento: " + valorcarro);
            System.out.println("\n\n\n\n\nCalcular o valor de uma nova venda (Aperte 1)");
            System.out.println("Encerrar o programa (Aperte outro número)");
            aux = Entrada.nextInt();
            if (aux == 1)
                seguir = true;
        } while (seguir == true);
    }
}

