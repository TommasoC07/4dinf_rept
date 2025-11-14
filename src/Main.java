import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;


/**
 * Questa classe rappresenta la classe principale in cui viene gestita la gara.
 * @author Tommaso Consalvi
 * @version 0.5
 */
public class Main {
    public static String primo = "";
    public static String percorsoFile = "";
    public static void main(String[] args) {


        JFrame frame = new JFrame("FileChooser nella mia app");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FileChooserDemo chooserPanel = new FileChooserDemo();
        frame.add(chooserPanel);

        frame.pack();
        frame.setVisible(true);

        JOptionPane.showMessageDialog(null,
                "Scegli un file con il pulsante OPEN.\n" +
                        "Dopo aver scelto il file, premi OK per continuare.");
        while(percorsoFile.equals("")) {
            try {
                Thread.sleep(100);  // attesa breve, non blocca la GUI
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Percorso selezionato: " + percorsoFile);

        FileManager manager = new FileManager();
        manager.setPath(percorsoFile);

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        FileManager fileManager = new FileManager();
        System.out.println("Quanti giri vuoi fare? ");
        int count = scanner.nextInt();

        ArrayList<CorsaCavalli> cavalli = new ArrayList<CorsaCavalli>();

        do {
            System.out.println("Inserisci la lentezza del cavallo: ");
            int lentezza = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Inserisci il nome del cavallo: ");
            String name = scanner.nextLine();
            CorsaCavalli cavallo = new CorsaCavalli(count, name, lentezza, manager);
            cavalli.add(cavallo);
            System.out.println("Inserisci 1 per inserire un altro cavallo ");

        }while(scanner.nextInt()==1);

        System.out.println("Gara iniziata");


        int zoppo = rand.nextInt(cavalli.size()-1);
        CorsaCavalli horse = cavalli.get(zoppo);

        for(CorsaCavalli cavallo: cavalli) {
            cavallo.start();
            //cavalli.get(zoppo).interrupt();
        }

        try {
            horse.interrupt();
        }catch(Exception e){
            throw new RuntimeException();
        }
        //System.out.println(zoppo + " " + horse.getName());

        for(CorsaCavalli cavallo : cavalli){
            try {
                cavallo.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
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