import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        List<Integer> result=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enters Size:");
        //int size=sc.nextInt();
        //System.out.println("Enter alice points:");
        int a[]={12,4,5,8};
        //System.out.println("Enter Bob points:");
        int b[]={12,3,6,7};
     int alice=0;
     int Bob=0;
     for(int i=0; i<a.length; i++){
         if (a[i]<b[i])
             Bob++;
         if(a[i]>b[i])
             alice++;
     }
     result.add(alice);
     result.add(Bob);
        System.out.println("Alice points="+alice);
        System.out.println("Bob points="+Bob);
    }
}
