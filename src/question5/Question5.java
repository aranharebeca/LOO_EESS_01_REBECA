package question5;
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String nome;
        float numH, numD;
        double salario, desconto = 0;
        nome = sc1.nextLine();
        numH = sc1.nextFloat();
        numD = sc1.nextFloat();
        salario = numH * 3.00;
        salario += (numD * 100);
        desconto = (13.5 * salario) / 100;
        salario = salario - desconto;

        System.out.println("Nome:" + nome);
        System.out.printf("Salário Liquido:%f2", salario);

        sc1.close();

    }
}