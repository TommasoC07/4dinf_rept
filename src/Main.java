import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti giri vuoi fare? ");
        int count = scanner.nextInt();

        CorsaCavalli thr1 = new CorsaCavalli(count, "Oca");
        CorsaCavalli thr2 = new CorsaCavalli(count, "Tartuca");
        CorsaCavalli thr3 = new CorsaCavalli(count, "Onda");
        CorsaCavalli thr4 = new CorsaCavalli(count, "Aquila");
        CorsaCavalli thr5 = new CorsaCavalli(count, "Istrice");
        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
        thr5.start();
    }
}