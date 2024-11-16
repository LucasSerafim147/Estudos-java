import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x;
        double y;
        double z;

        System.out.println("iNSIRA O VALOR DO LADO X: ");
        x = entrada.nextDouble();
        System.out.println("Insira o valor do lado y: ");
        y = entrada.nextDouble();

        z = Math.sqrt((x*x) + (y*y));

        System.out.println("O valor da Hipotenusa é " + z);
        entrada.close();
    }
}