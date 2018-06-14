/**
 * Добавить в проект «монитор» функцию вывода даты создания файла на экран (см. java.io.File).
 */

package Task3;

public class Main {
    public static void main(String[] args) {
        Monitor m = new Monitor("c:\\1.txt", new FileEvent());
        m.start();
    }
}
