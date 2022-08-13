import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
        int idade = sc.nextInt();
        int maxIdade = 18;
        int tempo = maxIdade - idade;

        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else if (tempo == 1) {
            System.out.println("Você é ainda menor de idade. Falta " + tempo + " ano para você ser de maior!");
        } else {
            System.out.println("Você é ainda menor de idade. Falta " + tempo + " anos para você ser de maior!");
        }
        
        sc.close();
    }
}
