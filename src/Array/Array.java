package Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
         for(int i = 0; i< a.length; i++){
             System.out.print(a[i]);
         }

         int[] b = new int[3];
         b[0] = 1;
         b[1] = 1;
         b[2] = 1;
         for(int bb : b){
             System.out.println(bb);
         }

         int c[] = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array of numbers");
        int cc = sc.nextInt();
        System.out.println("enter the numbers");

        for(int i = 0; i< cc; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i< cc; i++){
            System.out.println(a[i]);
        }

    }
}
