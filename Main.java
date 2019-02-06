/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner; 
public class Main {

    public static void main(String[] args){
       
       Scanner in = new Scanner(System.in);
       System.out.println("Enter an integer");
       int n;
       n = in.nextInt();
       
       int sum = 0;
       
       for (int i=0; i<n; i++)
       {
           sum = sum+i;

    }
    System.out.println("Sum is "+sum);
}
}
