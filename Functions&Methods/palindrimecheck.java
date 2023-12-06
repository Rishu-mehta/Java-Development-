import java.util.*;
public class palindrimecheck {
    public static void palindrome_check(int a){
        int rev=0;
        int n=a;
       
        while(n>0){
          int  rem=n%10;
            rev=rem+(rev*10);
            
            n=n/10;
        }
        if(a==rev){
            System.out.println("the number is palimdrome");
        }
        else{
            System.out.println("number is nort plaimdrome");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        palindrome_check(a);
    }
}
