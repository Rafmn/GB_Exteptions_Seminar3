import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void writeFile(String name, String line) {
        try(FileWriter writer = new FileWriter(name, true))
        {
           // запись всей строки
            writer.write(line);
            // запись символа
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        } 
    }
}
