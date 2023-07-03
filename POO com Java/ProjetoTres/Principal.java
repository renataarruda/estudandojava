public class Principal {
    public static void main(String[] args){
        Pessoa pes = new Pessoa("Maria de Jesus", "123.456.789-09");
        System.out.println(pes.imprimeDados());

        Empregado emp = new Empregado("Joaquim da Silva", "876.543.234-87", 3000,
                29, 7654);
        System.out.println(emp.imprimeDadosComSalarioMensal());

        EmpregadoHorista hor = new EmpregadoHorista("Felipe Costa", "456.543.234-98", 220,
                60, 0, 30, 345);
        System.out.println(hor.imprimeDadosComSalarioMensal());
    }
}
