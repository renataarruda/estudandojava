package AulaFor;

//1 - valor inicial: x = 1
//2 - valor final: x<= 10
//3 - incromentar com x++

public class AulaFor {
    public static void main(String[] args) {
        for (int x = 1; x<=10; x++) {
            if(x % 2 == 0)
            System.out.println("Número = "+x);
        }
    }
}
