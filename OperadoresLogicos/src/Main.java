public class Main {
    public static void main(String[] args) {

        // Operador lógico XOR (^) (ou exclusivo)

        int x = 9, y = 11;
        boolean teste = x > 10 ^ y > 10;

        System.out.println(teste); // saída true

        // Operador lógico NOT (!)

        int idade = 20;
        boolean maiorIdade = !(idade>=18); // saída false

        System.out.println(maiorIdade);

    }
}