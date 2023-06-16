package Padrao;

public class Main {
    public static void main(String[] args) {
        Aluno al1 = new Aluno(1, "Joaquim Silva", 29);
        Aluno al2 = new Aluno(2, "Ana Cristina Costa", 17);

        System.out.println("Aluno: " + al2.getNome() + " - Matrícula: " + al2.getMatricula() + "  - Idade: " + al2.getIdade());
        System.out.println("Aluno: " + al1.getNome() + " - Matrícula: " + al1.getMatricula() + "  - Idade: " + al1.getIdade());
        System.out.println("Média das idades dos alunos: " + (al2.getIdade() + al1.getIdade() / 2));
    }
}