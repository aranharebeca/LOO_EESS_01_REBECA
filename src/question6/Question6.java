package question6;
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        int A,B,C;
        float R,S,D;
        A = sc1.nextInt();
        B = sc1.nextInt();
        C = sc1.nextInt();
        R=A+B;
        R*=R;
        S=B+C;
        S*=S;
        D=(R+S)/2;
        System.out.printf("D = %.2f", D);
        sc1.close();
    }
}