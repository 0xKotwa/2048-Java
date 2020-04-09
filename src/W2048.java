
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;


public class W2048 {

    public void Monstrar(int[][] tab, int size) {
        Formatter form = new Formatter(System.out);
        for (int l = size - 1; l >= 0; l--) {
            for (int c = size - 1; c >= 0; c--) {

                form.format("%4d" ,tab[l][c]);
                System.out.printf("");

            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }

    public void Criar(int[][] tab, int size) {

        for (int l = size - 1; l >= 0; l--) {
            for (int c = size - 1; c >= 0; c--) {
                tab[l][c] = 0;

            }
        }
    }

    public void sort(int[][] tab, int size) {
        Random r = new Random();
        double x, y, x2, y2, k, j;
        int high = 5;
        int low = 1;
        x = Math.random() * 100;
        y = Math.random() * 100;
        x2 = Math.random() * 100;
        y2 = Math.random() * 100;
        x = Math.round(x);
        y = Math.round(y);
        x2 = Math.round(x2);
        y2 = Math.round(y2);

        while (x > size - 1 || y > size - 1 || y2 > size - 1 || x2 > size - 1) {
            x = Math.random() * 100;
            y = Math.random() * 100;
            y2 = Math.random() * 100;
            x2 = Math.random() * 100.;

            x = Math.round(x);
            y = Math.round(y);
            x2 = Math.round(x2);
            y2 = Math.round(y2);

        }
        k = r.nextInt(high - low) + low;
        j = r.nextInt(high - low) + low;
        while (k == 3 || j == 3) {
            k = r.nextInt(high - low) + low;
            j = r.nextInt(high - low) + low;
        }
        tab[(int) x][(int) y] = (int) k;
        tab[(int) x2][(int) y2] = (int) j;

    }


    public void ran(int[][] tab, int size) {
        Random r = new Random();
        double x, y, k;
        int high = 5;
        int low = 1;
        int g=0;
        x = Math.random() * 100;
        y = Math.random() * 100;
        k = r.nextInt(high - low) + low;
        x = Math.round(x);
        y = Math.round(y);
        while (k == 3 || k == 0) {
            k = r.nextInt(high - low) + low;
        }
        while (x > size - 1 || y > size - 1) {
            x = Math.random() * 100;
            y = Math.random() * 100;
            x = Math.round(x);
            y = Math.round(y);


        }
        for(int l =0;l<size;l++){
            for(int c =0;c<size;c++){
                if(tab[(int)x][(int)y]!=0){
                    g++;
                }
            }
        }
        if((g!=(size*size))){
            while (tab[(int) x][(int) y] != 0) {
                x = Math.random() * 100;
                y = Math.random() * 100;
                x = Math.round(x);
                y = Math.round(y);
                while (x > size - 1 || y > size - 1) {
                    x = Math.random() * 100;
                    y = Math.random() * 100;
                    x = Math.round(x);
                    y = Math.round(y);
                     }
                }
            tab[(int) x][(int) y] = (int) k;
            }else {
        }
        }








    public void jogada(String p, int size, int[][] tab,int combinadas) {
        int h, k;
        k = 1;
        h = 5;
        while (k == 0) ;
        {

            if (p.equalsIgnoreCase("b")) {
                h = 1;
                k++;
            } else if (p.equalsIgnoreCase("c")) {
                h = 2;
                k++;
            } else if (p.equalsIgnoreCase("e")) {
                h = 3;
                k++;
            } else if (p.equalsIgnoreCase("d")) {
                h = 4;
                k++;
            } else if (p.equalsIgnoreCase("f")) {
                h = 0;
                k++;
            }
            switch (h) {
                case 1:
                    //baixo
                    baixo(tab, size,combinadas);
                    break;
                case 2:
                    //cima
                    cima(tab, size,combinadas);
                    break;
                case 3:
                    //esquerda
                    esquerda(tab, size,combinadas);
                    break;
                case 4:
                    //direita
                    direita(tab, size,combinadas);
                    break;
                case 0:
                    break;
                default:
                    k = 0;
                    System.out.println("Inserir jogada valida");
                    Scanner s = new Scanner(System.in);
                    p = s.next();
            }
        }


    }


    public int direita(int[][] tab, int size,int combinadas) {
        int a = 0;
        int h = 0;
        for (int l = 0; l <= size - 1; l++) {
            for (int c = 0; c < size - 1; c++) {
               // while(h!=0) {
                if (tab[l][c] == tab[l][c + 1]) {
                    tab[l][c + 1] = tab[l][c] + tab[l][c];
                    tab[l][c] = 0;
                    combinadas++;
                }
                }

            }


        while (a != size) {
            for (int l = 0; l < size; l++) {
                for (int c = size - 1; c >= 1; c--) {
                    if (tab[l][c - 1] == 0) {
                        tab[l][c - 1] = tab[l][c];
                        tab[l][c] = 0;
                    }


                }
            }
            a++;
        }
        return combinadas;
    }

    public int esquerda(int[][] tab, int size,int combinadas) {
        int a = 0;
        int h = 0;
        for (int l = 0; l <= size - 1; l++) {
            for (int c = size - 1; c > 0; c--) {
             //   while(h!=0) {
                if (tab[l][c - 1] == tab[l][c]) {
                    tab[l][c - 1] = tab[l][c] + tab[l][c];
                    tab[l][c] = 0;
                    combinadas++;
                }
                }

            }


        while (a != size) {
            for (int l = 0; l < size; l++) {
                for (int c = size - 1; c >= 1; c--) {
                    if (tab[l][c] == 0) {
                        tab[l][c] = tab[l][c - 1];
                        tab[l][c - 1] = 0;
                    }


                }
            }
            a++;
        }
        return combinadas;
    }

    public int cima(int[][] tab, int size,int combinadas) {
        int a = 0;
        int h=0;
        for (int c = size - 1; c >= 0; c--) {
            for (int l = size - 1; l > 0; l--) {
                if (tab[l][c] == tab[l - 1][c]) {
                   // while(h!=0) {
                        tab[l - 1][c] = tab[l][c] + tab[l][c];
                        tab[l][c] = 0;
                        combinadas++;
                   // }
                }
            }
        }

        while (a != size) {
            for (int l = 0; l < size - 1; l++) {
                for (int c = size - 1; c >= 0; c--) {

                    if (tab[l + 1][c] == 0) {
                        tab[l + 1][c] = tab[l][c];
                        tab[l][c] = 0;
                    }
                }
            }
            a++;
        }
        return combinadas;
    }

    public int baixo(int[][] tab, int size,int combinadas) {
        int a = 0;
        int h = 0;
        for (int c = size - 1; c >= 0; c--) {
            for (int l = 0; l < size - 1; l++) {
                //while(h!=1){
                if (tab[l][c] == tab[l + 1][c]) {
                    tab[l + 1][c] = tab[l][c] + tab[l][c];
                    tab[l][c] = 0;
                    combinadas++;
                //}
                }
            }
        }

        while (a != size) {
            for (int l = size - 1; l > 0; l--) {
                for (int c = size - 1; c >= 0; c--) {
                    if (tab[l - 1][c] == 0) {
                        tab[l - 1][c] = tab[l][c];
                        tab[l][c] = 0;

                    }
                }
            }
            a++;
        }
        return combinadas;
    }


}


















