package question4;
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        float x = 2, y = 3, z = 5, nota1, nota2, nota3, media;
        nota1 = sc1.nextFloat();
        nota2 = sc1.nextFloat();
        nota3 = sc1.nextFloat();
        media = (x * nota1 + y * nota2 + z * nota3) / (x + y + z);

        System.out.println(media);
        sc1.close();

    }
}
