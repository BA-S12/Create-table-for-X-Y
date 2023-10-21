import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] xy = new int[6][2];

        for (int i = 0; i <xy.length ; i++) {
            System.out.print("Enter a value for (x,y): ");
            int x= in.nextInt(), y= in.nextInt();
            int j= 0;
            xy[i][j] = x;
            j++;
            xy[i][j] = y;
            j=0;
        }
        System.out.println("-".repeat(10));
        System.out.println("x\ty");

        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.print(xy[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

    }
}
