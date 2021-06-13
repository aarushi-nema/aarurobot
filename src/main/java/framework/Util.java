package framework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * Created by ajay on 13/6/21.
 */
public class Util {
    public static String getFileContent(String file) throws Exception {

        String content = "";
        Scanner myReader = null;
        try {
            ClassLoader loader = Util.class.getClassLoader();
            File myObj = new File(loader.getResource(file).getFile());
            myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                content += data+"\n";
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } finally {
            if (myReader != null)
                myReader.close();
        }
        return content;
    }
}
