package question3;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        float cd,val,real;
        cd = sc1.nextFloat();
        val = sc1.nextFloat();
        real = val / cd;


        System.out.printf("%.2f", real);
        sc1.close();
    }
}


