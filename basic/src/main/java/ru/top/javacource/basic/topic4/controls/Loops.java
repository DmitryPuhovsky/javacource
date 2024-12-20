package ru.top.javacource.basic.topic4.controls;

import java.util.Iterator;

public class Loops {

    public static void main(String[] args) {
        String[] strings = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        //Перебор элементов массива в цикле и вывод значений в консоль.
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        //В первой секции цикла for можно инициализировать несколько переменных одного типа,
        //а в третьей секции можно использовать несколько выражений.
        for (int i = 0, j = 0; i < 10; i++, j++) {
            //Тело цикла.
        }

        //Все три секции цикла for не являются обязательными. Так как в таком случае не будет условия для выхода из цикла,
        //то такой цикл будет выполняться бесконечно. Чтобы прервать любой вид цикла (for, while и др.), нужно использовать break.
        int i = 0;
        for (; ; ) {
            if (i == 10) {
                break; //Break прерывает цикл, когда значение переменной i равно 10.
                       //Если убрать break, то компилятор выдаст ошибку для кода, который расположен ниже данного цикла
                       //так как в таком случае код ниже нельзя будет выполнить.
            }

            i++;
        }


        //Разновидность цикла for, который называется forEach. Данный цикл позволяет перебрать по очереди все элементы массива,
        //сразу получая элемент без необходимости использовать индексы.
        for (String string : strings) {
            System.out.println(string);
        }

        //Цикл forEach можно использовать с любым объектом, который имплементирует интерфейс Iterable.
        IntNumberGenerator intNumberGenerator = new IntNumberGenerator(0, 10);
        for (int number : intNumberGenerator) {
            System.out.println(number);
        }

        //Цикл while, который является аналогом первого цикла for и выводит в консоль все элементы массива.
        int j = 0;
        while (j < strings.length) {
            System.out.println(strings[j++]);
        }

        //Бесконечный цикл while, который является аналогом бесконечного цикла for.
        while (true) {
            break;
        }

        //Данный цикл выведет в консоль цифры от 0 до 9, кроме 5.
        int k = 0;
        while (k < 10) {
            if (k == 5) {
                continue; //continue позволяет прервать текущую итерацию цикла и перейти на следующую.
            }

            System.out.println(k++);
        }


        //Особенностью цикла do-while является то, что тело цикла всегда выполнится минимум один раз.
        int m = 1;
        do {
            System.out.println("Do while цикл " + m++);
        } while (m <= 1);


        //С циклами можно использовать метки. Они позволяют из внутреннего цикла управлять выполнением внешнего цикла.
        //Между меткой и циклом не могут использовать никакие другие инструкции Java.
        Outer: //Outer - Метка внешнего цикла.
        for (int n = 0; n < 10; n++) {
            Inner: while (true) { //Inner - метка внутреннего цикла. В данном примере не имеет никакого значения, указана для примера.
                if (n == 5) {
                    continue Outer; //Если n равно 5, то прерывает выполнение внутреннего цикла
                                    //и переходит на следующую итерация внешнего цикла.
                } else if (n == 7) {
                    break Outer; //Если n = 7, то прерывает выполнение внутреннего и внешнего цикла.
                }

                n++;
            }
        }
    }
}

class IntNumberGenerator implements Iterable<Integer> {

    private int from;
    private int to;

    public IntNumberGenerator(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return from <= to;
            }

            @Override
            public Integer next() {
                return from++;
            }
        };
    }
}
