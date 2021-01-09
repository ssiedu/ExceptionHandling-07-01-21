
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ExEight {

    public static void show() throws IOException{
        FileReader fr=null;
        fr.read();
    }
    
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        //suppose we are taking a file name from command prompt
        //opening that file using FileReader
        String filename=args[0];                    //ArrayIndexOutOfBoundsException    (unchecked)
        
        FileReader fr=new FileReader(filename);     //FileNotFoundException             (checked)
        
        Class.forName("abc");
        
        
    }
}
