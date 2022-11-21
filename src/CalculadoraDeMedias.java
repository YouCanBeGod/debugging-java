import java.util.Scanner;

public class CalculadoraDeMedias {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculaMediaTurma(alunos, entrada);

        System.out.printf("Média da turma %.2f ", media);
    }

    public static double calculaMediaTurma(String[] alunos, Scanner scanner) {

        double soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s ", aluno);
            double nota = scanner.nextInt();
            soma += nota;
        }

        return soma / alunos.length;
    }

}