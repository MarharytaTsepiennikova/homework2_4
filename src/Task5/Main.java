/**
 * Написать код для мониторинга каталога.
 * Выводить на экран предупреждение если в каталог добавляется текстовый файл (*.txt)
 */

package Task5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        try {
            findFiles("c:\\", ".txt", list);
        } catch (IOException e){}

        for (String element : list){
            System.out.println(element);
        }
    }

    static void findFiles(String path, String ext, ArrayList<String> list) throws IOException {
        File dir = new File(path);
        File[] files = dir.listFiles(new MyFileFilter(ext));
        for (int index = 0; index < files.length; index++) {
            list.add(files[index].getCanonicalPath());
        }

    }
}
