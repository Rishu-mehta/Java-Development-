public class MaxSubArrayPrefix {
    public static void MaxSumOfSubArray(int number[]){
        int prefixArray[]= new int[number.length];
        for(int i=0;i<number.length;i++){
            
            if(i==0){
              prefixArray[i]=number[i];}
              else{
                prefixArray[i]=prefixArray[i-1]+number[i];
              }
              System.out.print(prefixArray[i]);
            
        }
    }
    public static void main(String args[]){
        int number[]={1,2,3,4,5};
        MaxSumOfSubArray(number);
        
    }
    
}
