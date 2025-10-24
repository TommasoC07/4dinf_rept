import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Gara {

    public void start(ArrayList<CorsaCavalli> cavalli, int zoppo){
        for(CorsaCavalli cavallo: cavalli) {
            cavallo.start();
            cavalli.get(zoppo).interrupt();
        }
        Main.printWinner();
    }


}
