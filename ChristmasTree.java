import java.io.*;
import java.util.*;

public class BoxInBox {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),space,k=0,s;
        if(n == 1) {
            System.out.println("You cannot generate christmas tree");
        }
        else if(n>20){
            System.out.println("Tree is no more");
        }
        else {
            
        for(int i = 1;i <= n+1;i++) {
            for(space = n-i;space >= 0;space--  ) {
                System.out.print("  ");
            }
            for(int j = 1 ;j <= (2*i-1);j++) {
                System.out.print("* ");
               // k = j;
            }   
            System.out.println();
        }
        s = n;
        for(int i = 0,a=2; i < n-1;i++,a++) {
            
            for(space = s-1;space > 0;space--  ) {
                System.out.print("  ");
            }
            s--;
            for(int j = 1;j <= (2*a-1);j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        s = n;
        int r = n-2;
        for(int i = 0;i < n - 3; i++) {
            for(int j = 0,a=2; j < r;j++,a++) {
                for(space = s-1;space > 0;space--  ) {
                    System.out.print("  ");
                }
                s--;
                for(int l = 0;l < (2*a-1);l++) {
                    System.out.print("* ");
                }
                System.out.println();
                
            }
            r--;
            s=n;
        }
        for(int i = 0;i < 2;i++) {
            for(space = n;space > 0;space--  ) {
                    System.out.print("  ");
                
            }
            System.out.print("*\n");
        }
        }
    } 
}