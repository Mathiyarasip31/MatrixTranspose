import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n=scanner.nextInt();
        System.out.println("Enter number of columns");
        int m=scanner.nextInt();
        System.out.println("Enter elements");
        int array[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                array[i][j]=scanner.nextInt();
            }
        }
        Transpose(array,n,m);
    }

    static void Transpose(int array[][],int n,int m)
    {
        int res[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++){
                res[i][j]=array[j][i];
            }
            System.out.println();
        }
        for(int i=0;i<res.length;i++)
        {
            for (int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}

