package ru.top.javacource.basic.topic2.operators;

public class Operators {

    public static void main(String[] args) {

        //Оператор присваивания позволяет записать значение в переменную
        int number = 12;
        //------------------------------------------------------------


        //Арифметические операторы
        int sumRes = 1 + 2;
        sumRes += 3; //Сокращенная форма записи sumRes = sumRes + 3;

        int subRes = 4 - 3;
        subRes -= 2; //Сокращенная форма записи subRes = subRes - 2;

        int mulRes = 6 * 5;
        mulRes *= 4; //Сокращенная форма записи mulRes = mulRes * 4;

        int divRes = 14 / 7;
        divRes /= 6; //Сокращенная форма записи divRes = divRes / 6;

        int modRes = 9 % 8;
        modRes %= 7; //Сокращенная форма записи modRes = modRes % 7;


        ++sumRes; //Префиксный инкремент, увеличивает значение sumRes на 1
        sumRes++; //Постфиксный инкремент, увеличивает значение sumRes на 1
        --sumRes; //Префиксный декремент, уменьшает значение sumRes на 1
        sumRes--; //Постфиксный декремент, уменьшает значение sumRes на 1

        number = 10;
        sumRes = number++; //Сначала присваивается значение, а потом выполняется инкремент
        System.out.println(sumRes + " " + number); //Значение sumRes будет 10, а значение number будет 11

        sumRes = ++number; //Сначала выполняется инкремент, а потом присваивается значение
        System.out.println(sumRes + " " + number);//Значение sumRes и number будет 12
        //------------------------------------------------------------


        //Операторы сравнения
        boolean greaterRes = 10 > 5; //Результат true
        boolean lessRes = 10 < 5; //Результат false
        boolean lessOrEqualRes = 10 <= 10; //Результат true
        boolean greaterOrEqualRes = 9 >= 10; //Результат false
        boolean equalRes = 10 == 10; //Результат true
        boolean notEqualRes = 10 != 10; //Результат false
        //------------------------------------------------------------


        //Логические операторы
        boolean trueRes1 = returnTrue() || returnFalse(); //Метод в правой части не будет вызван т.к. слева true
        boolean falseRes1 = returnFalse() && returnTrue(); //Метод в правой части не будет вызван т.к. слева false
        boolean trueRes2 = returnTrue() | returnFalse(); //Будут вызваны оба метода, несмотря на то, что слева true
        trueRes2 |= true; //Сокращенная запись, равная trueRes2 = trueRes2 | true;
        boolean falseRes2 = returnFalse() & returnTrue(); //Будут вызваны оба метода, несмотря на то, что слева false
        falseRes2 &= true; //Сокращенная запись, равная falseRes2 = falseRes2 & true;
        boolean equalsRes1 = 10 == 10; //Результат true
        boolean equalsRes2 = 10 == 11; //Результат false
        boolean notEqualsRes1 = 10 != 10; //Результат false
        boolean notEqualsRes2 = 10 != 9; //Результат true
        boolean notRes = !true; //Результат false
        //------------------------------------------------------------


        //Приоритет операторов
        int priorityRes1 = 2 + 2 * 2; //Оператор умножения имеет более высокий приоритет, а значит выполняется вначале
        System.out.println(priorityRes1); //Значение выражения 6
        int priorityRes2 = (2 + 2) * 2; //Скобки имеют приоритет выше чем у оператора умножения.
                                        //Сперва вычисляется выражение внутри скобок
        System.out.println(priorityRes2); //Значение выражения 8
        //------------------------------------------------------------


        //Применение операторов ==, != с объектами
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = object2;
        System.out.println(object1 == object2); //false т.к. ссылки указывают на разные объекты
        System.out.println(object2 == object3); //true т.к. ссылки указывают на один и тот же объект
        System.out.println(object1 != object3); //true т.к. ссылки не равны, потому что указывают на разные объекты
        //------------------------------------------------------------


        //Операция конкатенации
        String str1 = "Hello";
        String str2 = " World!";
        String strRes = str1 + str2; //Результат - Hello World!

        Object object = new Object();
        strRes += object; //При конкатенации строки и объекта, у объекта будет неявно вызван метод toString()
        System.out.println(strRes);
        //------------------------------------------------------------


        //Применение тернарного оператора
        int numIfFalse = 0;
        int numIfTrue = 1;
        int result = sumRes % 2 == 0 ? numIfTrue : numIfFalse; //Если sumRes чётное число, тогда result будет равен
                                                               //numIfTrue, иначе result будет равен numIfFalse
        //------------------------------------------------------------
    }

    /**
     * Метод, который выводит в консоль True и возвращает true
     */
    public static boolean returnTrue() {
        System.out.println("True");
        return true;
    }

    /**
     * Метод, который выводит в консоль False и возвращает false
     */
    public static boolean returnFalse() {
        System.out.println("False");
        return false;
    }
}
