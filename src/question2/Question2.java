package question2;
import java.util.Scanner;
class Question2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String[] dados, dadosDoProfessor;
        dados = new String[]{"Nome:", "Endereço:", "Cidade:", "UF:", "CEP:", "Telefone:", "CPF:", "RG:", "Data de nascimento:", "Grau de escolaridade:", "Curso de leciona:"};
        dadosDoProfessor = new String[dados.length];




        for (int i = 0; i < dados.length; i++) {
            System.out.print(dados[i]);
            dadosDoProfessor[i] = sc1.next();
        }
        for (int i = 0; i < dados.length; i++) {
            System.out.println(dados[i] + " " + dadosDoProfessor[i]);
            sc1.close();        }
    }
}
