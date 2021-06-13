import java.io.File;
import java.nio.charset.StandardCharsets;


/**
 * Created by ajay on 13/6/21.
 */
public class Util {
    public static String getFileContent(String file) throws Exception {
        String content = FileUtils.readFileToString(new File(file), StandardCharsets.UTF_8);
    }
}
