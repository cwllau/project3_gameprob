//Kelsey McDonough and Colleen Lau
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameProblem
{
    public static void main(String[] args)
    {
        //prompt the user to enter the input file name, input file & set up scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input file name: ");
        String filename = scan.nextLine();

        File f = new File(filename);

        Scanner file = null;
        try
        {
            file = new Scanner(f);

            //scanning for n and m
            int n = file.nextInt();
            int m = file.nextInt();

            System.out.println("n: " + n + " m: " + m);

//            int ACol = file.nextInt();
//            int ARow = file.nextInt();
//
//            int [][] A = new int[ACol][ARow];
//
//            for (int i = 0;  i < A.length; i++)
//            {
//                for (int j = 0; j < A[0].length; j++)
//                {
//                    A[i][j] = file.nextInt();
//                }
//            }
//            file.close();
//            System.out.println("Matrix is : \n");
//            for (int i = 0; i < A.length; i++)
//            {
//                for (int j = 0; j< A[0].length; j++)
//                {
//                    System.out.println(A[i][j] + " ");
//                }
//                System.out.println();
//            }
        }
        catch (FileNotFoundException e)
        {
            System.err.println("File not found: " + filename);
        }

        //just to test if the function works
        int[][] m = new int[4][4];
        m[0][0] = 1;
        m[0][1] = 2;
        m[0][2] = 3;
        m[0][3] = 4;

        m[1][0] = 5;
        m[1][1] = 6;
        m[1][2] = 7;
        m[1][3] = 8;

        m[2][0] = 9;
        m[2][1] = 10;
        m[2][2] = 11;
        m[2][3] = 12;

        m[3][0] = 13;
        m[3][1] = 14;
        m[3][2] = 15;
        m[3][3] = 16;

    }

    public static void game(int n, int m, int[][] A)
    {

    }
}
