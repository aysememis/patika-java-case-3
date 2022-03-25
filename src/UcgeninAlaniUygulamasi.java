import java.util.Scanner;

/**
 * @author Ayşe Memiş
 * @since 1.0.0
 */
public class UcgeninAlaniUygulamasi {

    public static void main(String[] args) {


        Scanner girdi = new Scanner(System.in);
        System.out.println("1.kenarı giriniz: ");
        int a = girdi.nextInt();

        System.out.println("2. kenarı giriniz: ");
        int b = girdi.nextInt();

        System.out.println("3.kenarı giriniz: ");
        int c = girdi.nextInt();

        float u = (a+b+c)/2 ;

        float cevre = 2*u;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c)) ;
        System.out.println("Alan");

        System.out.println(alan);

        System.out.println("çevre");
        System.out.println(cevre);
    }
}
