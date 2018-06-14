/**
 * Добавить в проект ф-ю мониторинга более одного файла.
 */

package Task4_1;

public class Main {
    public static void main(String[] args) {
        String[] listOfFiles = {"c:\\1.txt", "c:\\2.txt", "c:\\3.txt"};
        Monitor m = new Monitor(listOfFiles, new FileEvent());
        m.start();
    }
}
