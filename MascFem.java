import java.util.Scanner;

public class MascFem {
    public static void main(String[] args) {
        Boolean play = true;
        Scanner scanner = new Scanner(System.in);
        int contadorElas = 0;
        int contadorEles = 0;
        String[] listaElas = new String[10];
        String[] listaEles = new String[10];

        System.out.println(
                "Olá! Boas vindas ao centro de inscrição para a candidatura às vagas para alunos da escola Calltech.");

        while (play) {

            System.out.println("Por favor, insira o nome do candidato.");
            String nome = scanner.nextLine();

            System.out.println("Por favor, insira o gênero do candidato. 'f' para feminino e 'm' para masculino.");
            String gen = scanner.nextLine();

            if (gen.equalsIgnoreCase("f")) {

                listaElas[contadorElas] = ("Nome: " + nome + "; Gênero: Feminino");
                contadorElas++;

            }

            if (gen.equalsIgnoreCase("m")) {
                listaEles[contadorEles] = ("Nome: " + nome + "; Gênero: Masculino");
                contadorEles++;

            }

            System.out.println(
                    "Deseja inscrever mais alguém? Digite 's' para sim, e 'n' para não.");
            String decide = scanner.nextLine();

            if (decide.equalsIgnoreCase("n")) {
                play = false;
            }

            System.out.println("Segue as listas de alunos e alunas inscritas:");

            for (int i = 0; i < contadorEles; i++) {
                System.out.println((i + 1) + "º Aluno: " + listaEles[i] + ". ");
            }

            for (int i = 0; i < contadorElas; i++) {
                System.out.println((i + 1) + "ª Aluna: " + listaElas[i] + ". ");
            }

            System.out.println(
                    "Temos um total de " + contadorElas + " alunas e " + contadorEles + " alunos, contabilizando "
                            + (contadorElas + contadorEles) + " candidatos inscritos para estudar na escola.");

        }
    }
}