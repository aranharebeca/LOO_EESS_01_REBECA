package question1;


import java.util.Scanner;
class Question1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        float num1 = 1, num2 = 1, cont;
        num1 = sc1.nextFloat();
        num2 = sc1.nextFloat();
        cont = num1 * num2;


        System.out.println(cont);
        sc1.close();
    }
}
