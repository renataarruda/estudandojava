public class Empregado extends Pessoa {
    private int matricula;
    private double salario_fixo;
    private double dias_trabalhados;
    public Empregado(String nome, String cpf) {
        super(nome, cpf);
    }

    public Empregado(String nome, String cpf, double salario_fixo, double dias_trabalhados, int matricula){
        super(nome, cpf);
        this.setMatricula(matricula);
        this.setSalario_fixo(salario_fixo);
        this.setDias_trabalhados(dias_trabalhados );
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario_fixo() {
        return salario_fixo;
    }

    public void setSalario_fixo(double salario_fixo) {
        this.salario_fixo = salario_fixo;
    }

    public double getDias_trabalhados() {
        return dias_trabalhados;
    }

    public void setDias_trabalhados(double dias_trabalhados) {
        this.dias_trabalhados = dias_trabalhados;
    }

    public double calcula_salario_mensal(){
        return (this.getSalario_fixo() / 30) * this.getDias_trabalhados();
    }

    public String imprimeDados(){
        return super.imprimeDados() +
                "Matricula: " + this.getMatricula() + "\n" +
                "Salário fixo: " + this.getSalario_fixo() + "\n" +
                "Dias trabalhados: " + this.getDias_trabalhados() + "\n";
    }

    public String imprimeDadosComSalarioMensal() {
        return this.imprimeDados() + "\n" + "Salário mensal: " + calcula_salario_mensal();
    }
}
