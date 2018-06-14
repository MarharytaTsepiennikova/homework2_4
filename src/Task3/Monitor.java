package Task3;

import java.io.File;

public class Monitor {
    String file;

    IFileEvent event;

    public Monitor(String file, IFileEvent event) {
        this.file = file;
        this.event = event;
    }

    public void start() {
        while (true) {
            File f = new File(file);
            if (f.exists() && f.isFile()) {
                if (event != null)
                    event.onFileAdded(file); // Вызов события «файл появился» break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("Waiting...");
        }
    }
}