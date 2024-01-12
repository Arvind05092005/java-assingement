import java.util.Scanner;
public class questions {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int y=0;
        for(int i=1;i<=n;i++){
            y+=i;
        }
        System.out.print("Sum = "+y);
    }
    
}
