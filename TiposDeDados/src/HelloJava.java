public class HelloJava {
    public static void main(String[] args) {

        int idade = 10;
        double preco = 10.0;
        char sexo = 'M';
        boolean temFilhos = true;

        System.out.println(idade);
        System.out.println(preco);
        System.out.println(sexo);
        System.out.println(temFilhos);

        // Conversões
        // Perde-se informações quando um tamanho maior é convertido para um menor.

        int x = 10;           // declaração de uma variável do tipo int
        double d = x;        //  variável double recebe um tipo int;
        long l = x;         // variável long recebe um tipo int;
        float f = x;       // variável float recebe um tipo int (atenção);

        short s = 20;     // declaração de uma variável do tipo short;
        x = s;           // variável int recebe um tipo short

        double valorDouble = 9.99;
        int valorInt = (int) valorDouble; // necessário forçar a conversão por meio de cast
        System.out.println(valorInt);    // perde dados

    }
}