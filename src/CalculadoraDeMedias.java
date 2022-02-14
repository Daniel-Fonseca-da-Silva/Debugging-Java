import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraDeMedias {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Daniel", "Nikolai", "Marie", "jhony", "Takamoto"};

        double media =  calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %.2f", media);
    }

    public static double calculaMediaDaTurma(String[] listaDeAlunos, Scanner scan) {
        int somaDasNotas = 0;
        double media = 0;
        int nota = 0;

        for(int i = 0; i < listaDeAlunos.length; i++) {
            try{
                System.out.printf("Nota do aluno %s: ", listaDeAlunos[i]);
                nota = scan.nextInt();
                somaDasNotas += nota;
            } catch (InputMismatchException e) {
                System.out.println("Insira uma nota válida!");
            }
        }
        return media =  (double) somaDasNotas / listaDeAlunos.length;

    }

}
