public class CorsaCavalli extends Thread {
    private final int num_cavalli;
    protected String name;

    public CorsaCavalli(int num_cavalli, String name){
        super();
        this.num_cavalli = num_cavalli;
        this.name = name;
    }

    @Override
    public void run(){
        setName(name);
        System.out.println(Thread.currentThread().getName());
        for(int i=1; i<num_cavalli; i++){
            try{
                sleep(200);
            }catch(InterruptedException e){
                throw new RuntimeException();
            }
            System.out.println((i) + " " + name);
        }
    }
}
