import java.util.*;

public class SubArray {
    public static void subarray(int number[]){
        for(int i=0;i<number.length;i++){
            for(int j=i;j<number.length;j++){
                for(int k=i;k<j;k++){
                    System.out.print(number[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        

    }
    public static void main (String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter number of elements:");
     int n=sc.nextInt();
     System.out.print("Enter elements:");
     int arr[]=new int[n];
     for(int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
     }
     subarray(arr);
    }
    
}
