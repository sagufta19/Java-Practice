import java.util.Scanner;

public class diagonal_Difference {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Matrix Element:");
        int m[][]=new int[3][3];
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m.length; j++){
                m[i][j]=sc.nextInt();
            }
        }
        int leftSum=0;
        int rightSum=0;

        for(int i=0; i<m.length; i++){
            for(int j=0; j<m.length; j++){
               if(i==j)
                   leftSum+=m[i].[j]
            }
        }
    }
}
