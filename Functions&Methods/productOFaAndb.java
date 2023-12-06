import java.util.Scanner;

public class productOFaAndb {
   static  int product(int a ,int b){
        return a*b;
    }

public static void main(String args[]){

   System.out.print("Enter the value of a:");
      Scanner sc = new Scanner(System.in); 
   int a=sc.nextInt();
      System.out.print("Enter the value of b:");
   int b=sc.nextInt();
   
   int productvalue=product(a,b);
   System.out.println("product of given two nubers is: "+productvalue );
}    
}
