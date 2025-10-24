import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static String primo = "";
    public static void main(String[] args) {

        Random rand = new Random();
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
            CorsaCavalli cavallo = new CorsaCavalli(count, name, lentezza);
            cavalli.add(cavallo);
            System.out.println("Inserisci 1 per inserire un altro cavallo ");

        }while(scanner.nextInt()==1);

        System.out.println("Gara iniziata");


        int zoppo = rand.nextInt(count);
        //CorsaCavalli horse = cavalli.get(zoppo);
        Gara gara = new Gara();
        gara.start(cavalli, zoppo);

        //System.out.println(zoppo + " " + horse.getName());




    }

    public static void printWinner(){
        System.out.println("Il vincitore è " + primo);
    }

    public static String getPrimo(){
        return primo;
    }

    public static void setPrimo(String vincitore){
        primo=vincitore;
    }
}