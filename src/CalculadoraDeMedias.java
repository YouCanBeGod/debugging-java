import java.util.Scanner;

public class CalculadoraDeMedias {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        int media = calculaMediaTurma(alunos, entrada);

        System.out.printf("Média da turma %d ", media);
    }

    public static int calculaMediaTurma(String[] alunos, Scanner scanner) {

        int soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s ", aluno);
            int nota = scanner.nextInt();
            soma += nota;
        }

        return soma / alunos.length;
    }

}