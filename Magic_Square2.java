
import java.util.Scanner;

public class Magic_Square2{
    static  Scanner inp=new Scanner(System.in);
    public static void magic_square(int n, int arr[][]){
         int sum=(n*((n*n)+1))/2;
       // System.out.println(sum);
       
       int i,j, num;
       i=n/2;
       j=n-1;
       for(num=1;num<=(n*n);){
           if(i==-1&&j==n){
               i=0;
               j=n-2;
           }
           else {
               if(j==n){
                   j=0;
               }
               if(i<0){
                   i=n-1;
               }
           }
           if(arr[i][j]!=0){
               i++;
               j=j-2;
               continue;
           }
           else{
               arr[i][j]=num++;
           }
           i--;
           j++;
       }
    }
    public static void display(int n, int arr[][]){
        int k,m;
       for(k=0;k<n;k++){
           for(m=0;m<n;m++){
               System.out.print(arr[k][m]+" ");
           }
           System.out.println();
       }
    
}
    public static void swap(int arr[][]){
        int n=arr.length;
        int t;
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(j%2==0){
                    t=arr[i][0];
                    arr[i][0]=arr[i][j];
                    arr[i][j]=t;
                }
            }
        }
    }
     public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Enter the size of magic square");
        int n=inp.nextInt();
       int [][]arr=new int[n][n];
       int i,j;
       System.out.println(arr.length);
       System.out.println("Enter the position of 1");
       int pos=inp.nextInt();
       if(pos>=1 && pos<=9){
           i=(pos-1)/3;
           j=(pos-1)%3;
       }
       magic_square(n,arr);
       display(n,arr);
}
}
    