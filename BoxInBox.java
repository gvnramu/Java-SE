import java.io.*;
import java.util.*;

public class BoxInBox {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //for(int i = 0;i < n;i++) {
           // if(i%2 == 0)
                printBox(n);
       // }
        
        
    }
    static void printBox(int n){
        
         int len ;
     
       len = n*2+1;
       int star[][] = new int[len][len];
       
        for(int i = 0;i < len;i++) {
            for(int j = 0;j < len;j++){
                star[i][j] = 1;
            }
        }
        
        for(int i = 1;i < len-1;i++) {
            for(int j = 1;j < len-1;j++){
                    star[i][j] = 0;
                
            }
            //System.out.println();
        }
        
        for(int i = 2;i < len;i+=2) {
            for(int j = 0;j <= i;j++)
                star[i][j] = 1;
        }
        for(int i = 2;i < len;i+=2) {
            for(int j = 0;j <= i;j++)
                star[j][i] = 1;
        }
        for(int i = 0;i < len;i++) {
            for(int j = 0;j < len;j++){
                if(star[i][j] == 1) 
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
      
}