package Task4_1;

import java.io.File;
import java.util.Arrays;

public class Monitor {
    String[] files;

    IFileEvent event;

    public Monitor(String[] files, IFileEvent event) {
        this.files = Arrays.copyOf(files, files.length);
        this.event = event;
    }

    public void start() {
        int counter = 0;
        File file;

        while (true) {
            for (int index = 0; index < files.length; index++) {
                if (files[index] != null){
                    file = new File(files[index]);
                    if (file.exists() && file.isFile()) {
                        files[index] = null;
                        counter++;
                    }
                }
            }

            if (counter == files.length){
                event.onFileAdded();
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            
            System.out.println("Waiting...");
        }
    }
}