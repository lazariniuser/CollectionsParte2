import java.util.Scanner;
import java.util.Arrays;

public class MascFem {
    public static void main(String[] args) {
        Boolean play = true;
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        String[][] cadastrados = new String[10][2];

        System.out.println(
                "Olá! Boas vindas ao centro de inscrição para a candidatura às vagas para alunos da escola Caltech.");

        while (play) {

            System.out.println("Por favor, insira o nome do candidato.");
            String nome = scanner.nextLine();
            System.out.println("Por favor, insira o gênero do candidato. 'f' para feminino e 'm' para masculino.");
            String gen = scanner.nextLine();

            cadastrados[contador][0] = nome;
            cadastrados[contador][1] = gen.equalsIgnoreCase("f") ? "Feminino" : "Masculino";

            contador++;

            System.out.println(
                    "Deseja inscrever mais alguém? Digite 's' para sim, e 'n' para não.");
            String decide = scanner.nextLine();

            if (decide.equalsIgnoreCase("n")) {
                play = false;
            }

        }

        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + ": " + cadastrados[i][0] + "; Gênero: " + cadastrados[i][1]);

        }
        System.out.println("Total de " + contador + " candidatos inscritos para estudar na escola.");
    }
}
