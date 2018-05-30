/**
 * Создать список фигур. Реализовать сортировку списка по возрастанию площади фигуры.
 */

package Task2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Figure [] list = {
             new Circle(53),
             new Circle(32.7),
             new Rectangle(41,22),
             new Rectangle(33, 52),
             new Square(44),
             new Square(64),
             new Square(312)
        };

        Arrays.sort(list, new FigureComparator());

        for (Figure f : list){
            System.out.println(f.getSquare());
        }
    }
}
