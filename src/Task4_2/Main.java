/**
 * Добавить в проект ф-ю мониторинга более одного файла.
 */

package Task4_2;

public class Main {
    public static void main(String[] args) {
        Monitor m = new Monitor("c:\\1.txt", "c:\\2.txt", new FileEvent());
        m.start();
    }
}
