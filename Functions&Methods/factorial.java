import java.util.*;
public class factorial {
public static int factorial(int n){
    int fact=1;
     for(int i=1;i<=n;i++){
         fact=(fact*i);
     }
     return fact;
}    
public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter number to find factorial:");
   int n=sc.nextInt();
   System.out.println("Factorial of " +n +" is " + factorial(n));

}
}
