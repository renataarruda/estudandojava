package AulaIf;

public class AulaIf {
    public static void main(String[] args) {
        boolean renda=false;
        boolean adimplencia=false;
        boolean privilege=false;
        boolean restricao=false;

        boolean resultado= ((renda && adimplencia) || privilege) && !restricao;

        System.out.println("Empréstimo deve ser concedido? " + resultado);
    }
}