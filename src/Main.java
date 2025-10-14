import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti giri vuoi fare? ");
        int count = scanner.nextInt();

        CorsaCavalli thr1 = new CorsaCavalli(count, "Oca", 100);
        CorsaCavalli thr2 = new CorsaCavalli(count, "Tartuca", 150);
        CorsaCavalli thr3 = new CorsaCavalli(count, "Onda", 90);
        CorsaCavalli thr4 = new CorsaCavalli(count, "Aquila", 110);
        CorsaCavalli thr5 = new CorsaCavalli(count, "Istrice", 123);


        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
        thr5.start();
    }
}