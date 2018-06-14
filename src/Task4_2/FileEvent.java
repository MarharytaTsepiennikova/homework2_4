package Task4_2;

import java.io.File;
import java.util.Date;

public class FileEvent implements IFileEvent {
    @Override
    public void onFileAdded(String s) {
        System.out.println("File added: " + s);
        File file = new File(s);
        long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println(date.toString());
    }
}
