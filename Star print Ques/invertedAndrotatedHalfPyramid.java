
    import java.util.*;

public class invertedAndrotatedHalfPyramid {
    public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Emter number of rows:");
    int n=sc.nextInt();
    System.out.print("Enter number of cols:");
    int m=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=m-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
    
}

