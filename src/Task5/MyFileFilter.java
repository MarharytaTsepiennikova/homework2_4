package Task5;

import java.io.File;
import java.io.FilenameFilter;

public class MyFileFilter implements FilenameFilter {
    private String ext;

    public MyFileFilter(String ext){
        this.ext = ext;
    }

    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
