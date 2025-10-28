public class CorsaCavalli extends Thread {
    private final int num_giri;
    protected String name;
    protected int lentezza;

    public CorsaCavalli(int num_giri, String name, int lentezza){
        super();
        this.num_giri = num_giri;
        this.name = name;
        this.lentezza = lentezza;
    }

    @Override
    public void run(){
        setName(name);
        System.out.println("Cavallo " + name + " comincia la sua partenza!");
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
