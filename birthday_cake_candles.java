import java.util.Scanner;

public class birthday_cake_candles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter candles size:");
        int candles[]=new int[5];
        int count=0;
        int max=0;
        for(int i=0; i<5; i++){
            candles[i]= sc.nextInt();
        }
        for(int i=0; i< candles.length; i++){
            if(candles[i]>max)
                max=candles[i];
        }
        for(int i=0; i< candles.length; i++){
            if(candles[i]==max)
                count++;
        }
        System.out.println(count);
    }
}
