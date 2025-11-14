/**
 * Questa classe rappresenta il cavallo.
 * @author Tommaso Consalvi
 * @version 0.7
 */

public class CorsaCavalli extends Thread {
    private final int num_giri;
    protected String name;
    protected int lentezza;
    protected FileManager manager;

    public CorsaCavalli(int num_giri, String name, int lentezza, FileManager manager){
        super();
        this.num_giri = num_giri;
        this.name = name;
        this.lentezza = lentezza;
        this.manager = manager;
    }

    /**
     * Questa metodo sovrascrive il metodo run della classe thread.
     */

    @Override
    public void run(){
        String message;
        setName(name);
        message = "Cavallo " + name + " comincia la sua partenza!";
        System.out.println(message);
        manager.writeOnFile(message);

        for(int i=1; i<num_giri; i++){
            try{
                sleep(lentezza);
            }catch(InterruptedException e){
                throw new RuntimeException();
            }
            System.out.println("Giro: " + (i) + " " + name);
            try{
            if(Main.getPrimo().equals("")){
                Main.setPrimo(this.name);
            }
            }catch(Exception e){
                System.out.println("Errore qui!");
            }
        }
    }
}
