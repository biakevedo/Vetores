import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// vetores (ARRAY)

        // 5 idades
       // int idade1 = 5;
       // int idade2 = 8;
       // int idade3 = 7;
        // int idade4 = 10;
       // int idade5 = 50;

        // array - guarda uma lista* de coisas
        // variavel que guarda uma lista de idades

       // int[] idades = new int[5];

      //  String[] nomes = new String[10];

        // endereços: 0 - 1 - 2 - 3 - 4
      //  idades[0] = 12;
        // idades[1] = 20;
      //  idades[2] = 32;
      //  idades[3] = 15;
       // idades[4] = 56;
        //    System.out.println(idades[1]);

            // 0, 1, 2, 3, 4
       // for (int i = 0; i < 5 ; i++) {

      //  }

        // preencha o vetor de nomes e liste todos os nomes com o for

        String[] nomes = new String[4];
        nomes[0] = "Beatriz";
        nomes[1] = "Camila";
        nomes[2] = "Lucy";
        nomes[3] = "Carlos";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);

        }

     // Crie e imprima um vetor de 5 posições do tipo int e imprima usando os laços for

        int[] quantidades = new int[5];
        quantidades[0] = 1;
        quantidades[1] = 2;
        quantidades[2] = 3;
        quantidades[3] = 4;
        quantidades[4] = 5;

        for (int i = 0; i < quantidades.length; i++) {
            System.out.println(quantidades[i]);

        }

    // Preencher e listar 10 elementos

        int[] posicoes = new int[3];
        posicoes[0] = sc.nextInt();
        for (int i = 0; i <posicoes.length; i++) {
            // ou i < 10
            posicoes[i] = sc.nextInt();
            System.out.println("Digite 1 número");
        }
        for (int i = 0; i < posicoes.length; i++) {
            System.out.println(posicoes[i]);

        }

        int[] vamosContar = new int[4];
        vamosContar[0] = 1;
        vamosContar[1] = 548;
        vamosContar[2] = 489;
        vamosContar[3] = 9;

        int soma = 0;
        for (int i = 0; i < vamosContar.length; i++) {
            soma += vamosContar[i];
        }
        System.out.println("A soma total é: " + soma);

        int[] numeroMaior = new int[2];
        numeroMaior[0] = 1;
        numeroMaior[1] = 8;
        if (numeroMaior[1] > numeroMaior[0]) {
            System.out.println("O número " + numeroMaior[1] + " é maior que " + numeroMaior[0]);
        } else {
            System.out.println("O número " + numeroMaior[0] + " é maior que " + numeroMaior[1]);
        }










    }
}









