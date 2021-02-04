import java.util.Scanner;

public class MagicSquares {


    public static void main(String[] args) {
        int[][] sq = new int[4][4];

        Scanner sc = new Scanner(System.in);
        for(int r = 1; r <= 4; r++) {
            for(int c = 1; c <= 4; c++) {
                System.out.println("Enter in the value for number "+r*c +" (enter in 1-16, each number only once)");
                sq[r-1][c-1] = sc.nextInt();
            }
        }

        for(int r = 0; r<4;r++) {
            for(int c = 0; c<4; c++) {
                System.out.print(sq[r][c] + "\t");
            }
            System.out.println();
        }
        if(MagicCheck(sq)) {
            System.out.println("This is a Magic Square");
        }
        else {
            System.out.println("This is not a Magic Square");
        }

    }

    public static boolean MagicCheck(int[][] sq) {
        boolean check = false;
        boolean t = true;
        int tcheck = 0;
        int lr = 0;
        int rl = 0;
        for(int r = 0; r < 4; r++) {
            for(int c = 0; c < 4; c++) {
                tcheck+=sq[r][c];
                if((r == 1 && c == 1) || (r == 2 && c == 2)) {
                    lr+=sq[r][c];
                    rl+=sq[r][c];
                }
                else if(r==c) {
                    lr+=sq[r][c];
                }
                else if(Math.abs(r-c) == 3) {
                    rl+=sq[r][c];
                }
            }
            if(tcheck == 34 && t) {

            }
            else {
                t = false;
            }
            tcheck = 0;
        }
        if(lr == 34 &&  rl == 34 && t) {
            check = true;
        }
        else {
            t = false;
        }
        
        System.out.println(t);
        return check;
    }
}
