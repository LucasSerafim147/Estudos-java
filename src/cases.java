import javax.swing.*;
import java.util.Scanner;

public class cases {
    public static void main(String[] args){
        String dias = null;
        Scanner dia = new Scanner(System.in);
        System.out.println("Insira um dia da semana: ");
        dias = dia.next();

        switch (dias){
            case "Domingo":
                System.out.println("é domingo");
                break;
            case "segunda":
                System.out.println("é segunda");
                break;
            case "terça":
                System.out.println("é terça");
                break;

            case "quarta":
                System.out.println("é quarta");
                break;
            case "quinta":
                System.out.println("é quinta");
                break;
            case "sexta":
                System.out.println("é sexta");
                break;
            case "sábado":
                System.out.println("é sabado");
                break;
            default:
                System.out.println("Não é um dia da semana");
        }
        dia.close();



    }
}
