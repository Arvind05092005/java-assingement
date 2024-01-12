import java.util.Scanner;
public class fibonacciseries {
    public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
         System.out.print("Enter a number: ");
         int n=sc.nextInt();
         int x=0;
         int y=1;
         
         for(int i=0;i<n;i++){
            System.out.println(x);
           int sum=x+y;
            x=y;
            y=sum;
            
         }
         
    }

    
}
