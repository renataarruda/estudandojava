import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        double base, altura, raio;
        Scanner Entrada= new Scanner(System.in); //cria o buffer
        boolean continuar=true;
        int figuraGeometrica;

        do {
            System.out.println("MENU INICIAL \n\nESCOLHA A OPÇÃO DESEJADA:"+"\n\n" +
                    "1) Calcular área do Triângulo Retângulo;\n" +
                    "2) Calcular área do Círculo;\n" +
                    "3) Calcular área do Quadrado;\n" +
                    "4) Finalizar programa.\n");
            figuraGeometrica = Entrada.nextInt();

            switch (figuraGeometrica) {
                case 1 -> {
                    System.out.println("Digite o valor da base(metros):");
                    base = Entrada.nextDouble();
                    System.out.println("Digite o valor da altura(metros):");
                    altura = Entrada.nextDouble();
                    TrianguloRetangulo triRet = new TrianguloRetangulo(base, altura);
                    System.out.println(triRet.mostraResultado());
                }
                case 2 -> {
                    System.out.println("Digite o valor do raio(metros):");
                    raio = Entrada.nextDouble();
                    Circulo circ = new Circulo(raio);
                    System.out.println(circ.mostraResultado());
                }
                case 3 -> {
                    System.out.println("Digite o valor da base(metros):");
                    base = Entrada.nextDouble();
                    System.out.println("Digite o valor da altura(metros):");
                    altura = Entrada.nextDouble();
                    Quadrado quad = new Quadrado(base, altura);
                    System.out.println(quad.mostraResultado());
                }
                case 4 -> {
                    System.out.println("PROGRAMA FINALIZADO");
                    continuar = false;
                }
                default -> System.out.println("Dígito inválido.");
            }

        } while(continuar);
    }
    }
