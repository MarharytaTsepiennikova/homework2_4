package Task4_2;

import java.io.File;

public class Monitor {
    String firstFile;
    String secondFile;

    IFileEvent event;

    public Monitor(String firstFile, String secondFile, IFileEvent event) {
        this.firstFile = firstFile;
        this.secondFile = secondFile;
        this.event = event;
    }

    public void start() {
        while (true) {
            File f1 = new File(firstFile);
            File f2 = new File(secondFile);

            if (f1.exists() && f1.isFile()) {
                if (event != null)
                    event.onFileAdded(firstFile);
            }

            if (f2.exists() && f2.isFile()) {
                if (event != null)
                    event.onFileAdded(secondFile);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("Waiting...");
        }
    }
}