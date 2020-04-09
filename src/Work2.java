

import java.util.Scanner;

public class Work2 extends W2048{

    int size;
    int[][] tab;

    public Work2(int size) {
        this.size = size;

    }

    public static void main(String[] args) {
        int combinadas=0;
        int size;
        String p;

        Scanner s = new Scanner(System.in);
        System.out.println("Introduzir o tamanho do jogo entre 4 e 10");
        size = s.nextInt();
        int[][] tab = new int[size][size];
        Work2 you = new Work2(size);
        while (size < 4 || size > 10) {
            System.out.println("Introduzir um tamanho valido");
            size = s.nextInt();
        }
        you.Criar(tab,size);

        System.out.println("inserir J para jogar e F para nao jogar a qualquer momento");
        p = s.next();
        if (p.equalsIgnoreCase("J")) {
            you.sort(tab,size);
            you.Monstrar(tab,size);
            System.out.println("Inserir a jogada pretendida");
            p = s.next();
            while (!(p.equalsIgnoreCase("F"))) {
                you.jogada(p,size,tab,combinadas);
                you.ran(tab,size);
                you.Monstrar(tab,size);
                System.out.println("Inserir a jogada pretendida");
                p = s.next();

            }
        } else {
            System.out.println("Agradeço por exprimentar");
        }

        if(!(p.equalsIgnoreCase("F"))) {
            System.out.println("Agradeço por exprimentar");
        }
    }
}
