public class EmpregadoHorista extends Empregado{

    private double quantidade_horas_trabalhadas;
    private double valor_hora;
    public EmpregadoHorista(String nome, String cpf, double quantidade_horas_trabalhadas,
                            double valor_hora, double salario_fixo, double dias_trabalhados,
                            int matricula) {
        super(nome, cpf, salario_fixo, dias_trabalhados, matricula);
        this.setValor_hora(valor_hora);
        this.setQuantidade_horas_trabalhadas(quantidade_horas_trabalhadas);
    }

    public double calcula_salario_mensal(){
        return this.getSalario_fixo() + (this.getQuantidade_horas_trabalhadas() * this.getValor_hora());
    }

    public double getQuantidade_horas_trabalhadas() {
        return quantidade_horas_trabalhadas;
    }

    public void setQuantidade_horas_trabalhadas(double quantidade_horas_trabalhadas) {
        this.quantidade_horas_trabalhadas = quantidade_horas_trabalhadas;
    }

    public double getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(double valor_hora) {
        this.valor_hora = valor_hora;
    }

    public String imprimeDados(){
        return super.imprimeDados() + "\n" +
                "Qtde horas trabalhadas: " + this.getQuantidade_horas_trabalhadas() + "\n" +
                "Valor da hora: " + this.getValor_hora() + "\n";
    }
}
