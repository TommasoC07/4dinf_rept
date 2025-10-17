import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static String primo = "";
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti giri vuoi fare? ");
        int count = scanner.nextInt();

        ArrayList<CorsaCavalli> cavalli = new ArrayList<CorsaCavalli>();

        do {
            System.out.println("Inserisci la lentezza del cavallo: ");
            int lentezza = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Inserisci il nome del cavallo: ");
            String name = scanner.nextLine();
            CorsaCavalli thr = new CorsaCavalli(count, name, lentezza);
            cavalli.add(thr);
            System.out.println("Inserisci 1 per inserire un altro cavallo ");

        }while(scanner.nextInt()==1);

        System.out.println("Gara iniziata");
        for(CorsaCavalli cavallo: cavalli) {
            cavallo.start();
        }

        System.out.println("Il vincitore è " + primo);

    }

    public static String getPrimo(){
        return primo;
    }

    public static void setPrimo(String vincitore){
        primo=vincitore;
    }
}