import java.io.*;

/**
 * Questa classe serve a gestire la scrittura nei file.
 * @author Tommaso Consalvi
 * @version 1.0
 */
public class FileManager {
    private String path;

    public void setPath(String path){
        this.path = path;
    }

    public void writeOnFile(String string){
        try{
            FileWriter fileWriter = new FileWriter(path, true);
            fileWriter.write(string);
        } catch(Exception e){
            System.out.println("Errore in fase di scrittura: " + e.getMessage());
        }
    }
}
