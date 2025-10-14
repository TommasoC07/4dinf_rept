import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti giri vuoi fare? ");
        int count = scanner.nextInt();

        System.out.println("Inserisci la lentezza del cavallo dell'Oca: ");
        int lentezza = scanner.nextInt();
        CorsaCavalli thr1 = new CorsaCavalli(count, "Oca", lentezza);

        System.out.println("Inserisci la lentezza del cavallo della Tartuca: ");
        lentezza = scanner.nextInt();
        CorsaCavalli thr2 = new CorsaCavalli(count, "Tartuca", lentezza);

        System.out.println("Inserisci la lentezza del cavallo della Onda: ");
        lentezza = scanner.nextInt();
        CorsaCavalli thr3 = new CorsaCavalli(count, "Onda", lentezza);

        System.out.println("Inserisci la lentezza del cavallo della Aquila: ");
        lentezza = scanner.nextInt();
        CorsaCavalli thr4 = new CorsaCavalli(count, "Aquila", lentezza);

        System.out.println("Inserisci la lentezza del cavallo della Istrice: ");
        lentezza = scanner.nextInt();
        CorsaCavalli thr5 = new CorsaCavalli(count, "Istrice", lentezza);


        thr1.start();
        thr2.start();
        thr3.start();
        thr4.start();
        thr5.start();
    }
}