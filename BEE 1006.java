import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        double a = 0.2 * sc.nextDouble();
        double b = 0.3 * sc.nextDouble();
        double c = 0.5 * sc.nextDouble();
        double media = a+b+c;
        
        System.out.printf("MEDIA = %.1f%n", media);

        sc.close();
 
    }
 
}
