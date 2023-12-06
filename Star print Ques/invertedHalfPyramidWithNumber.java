import java.util.*;

public class invertedHalfPyramidWithNumber{
    public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Emter number of rows:");
    int n=sc.nextInt();
    System.out.print("Enter number of cols:");
    int m=sc.nextInt();
    
    for(int i=1;i<=n;i++){
        int num=1;
        for(int j=1;j<=m+1-i;j++){
        
            System.out.print(num);
            num++;           
        }
        System.out.println();
    }
    }
    
}
