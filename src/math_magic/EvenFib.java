package math_magic;
import java.util.Scanner;

/**
 * Created by Dhaval on 2/18/2016.
 * This program finds the sum of even fibonnachi terms till 40 Million
 */
public class EvenFib {



    public static long calcEvenFibSum(long tar){

        long prev1=1;
        long prev2=2;
        long current;
        long sum=prev2;
        while(prev2<tar){
            if(((prev1+ prev2)%2==0) &&((prev1+ prev2)<tar)){

                sum=sum+prev1+prev2;
            }
            current=prev1+prev2;
            prev1=prev2;
            prev2=current;
        }
        return sum;
    }

    public static void main(String[] args) {

       /* Scanner k= new Scanner(System.in);
        long noTest=k.nextLong();
        for(long i=0;i<noTest;i++){
            System.out.println(calcEvenFibSum(k.nextLong()));
        }
*/

}
