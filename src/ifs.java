
import java.util.Scanner;

public class ifs {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int age;
        System.out.println("Insira sua idade: ");
        age = entrada.nextInt();
        if(age >= 75) {
            System.out.println("Você é um velpho");
        }
        else if(age >=18){
            System.out.println("Você é um adulto");


            }
        else if (age >=13){
            System.out.println("Você é um adolescente");
        }
        else{
            System.out.println("Você é uma criança: ");
        }
    }
}
