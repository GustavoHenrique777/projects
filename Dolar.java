import java.util.Scanner;

public class Dolar {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        // ler a cotação do Dolar
        System.out.println("Qual a cotação do Dolar? ");
        double cotacao = sc.nextDouble( );
        // ler a quantidade de Dolares
        System.out.println ("Quantos dolares? ");
        double dolares = sc.nextDouble( );
        double real = dolares * cotacao;
        // mostrar o resultado
        System.out.printf("Você tem o equivalente a R$ %.2f\n", real);
        sc.close ( );
    }
}