package ru.top.javacource.basic.topic4.controls;

/**
 * Управляющие конструкции
 */
public class Conditionals {

    public static void main(String[] args) {

        int argument = 10;

        //Если выражение в условии примет значение true, то тело условия будет выполнено,
        //а если false, то тело не будет выполнено.
        if (argument > 5) {
            System.out.println("Аргумент больше 5");
        }

        //Если выражение в условии примет значение true, то выполняется блок if, а если false, то блок else.
        if (argument % 2 == 0) {
            System.out.println("Аргумент является четным числом");
        } else {
            System.out.println("Аргумент не является четным числом");
        }

        //Выполнится единственный блок, у которого первым при проверке условия, результат будет true.
        //Если во всех блоках выражение будет false, то не выполнится ни один блок.
        if (argument == 15) {
            System.out.println("Аргумент равен 15");
        } else if (argument == 20) {
            System.out.println("Аргумент равен 20");
        }

        //Выполнится единственный блок, у которого первым при проверке условия, результат будет true.
        //Если во всех блоках выражение будет false, то выполнится блок else.
        if (argument < 12) {
            System.out.println("Меньше 12");
        } else if (argument < 18) {
            System.out.println("Меньше 18, но больше 11");
        } else {
            System.out.println("Больше 17");
        }


        final String dayOfWeek = "MONDAY";
        final String SUNDAY = "SUNDAY";

        //Допустимыми типами switch могут быть byte, short, char, int и их обертки, а также тип String и enum.
        switch(dayOfWeek) {
            case "MONDAY": { //Фигурные скобки не являются обязательными.
                System.out.println("Понедельник");
                break;
            }
            case "SATUR" + "DAY": //Выражение после case должно быть константным.
                System.out.println("Суббота");
                break;
            case SUNDAY: //После case можно использовать константу (final переменную).
                System.out.println("Воскресенье");
                break;
            default: //Если не будет совпадения ни с одним case условием, то выполнится блок default.
                System.out.println("Не понедельник и не выходной день");
                break; //break не является обязательным.
        }

        //Не выполнится ни один блок, если ни одно условие case не будет истинным.
        //Блок default не является обязательным.
        switch (dayOfWeek.length()) {
            case 9:
                System.out.println("Wednesday");
                break;
            case 7:
                System.out.println("Tuesday");
                break;
        }

        int number = 1;
        //Если в конце выполненного блока нет оператора break, то будут выполняться нижележащие блоки,
        //пока не встретится оператор break. В данном примере будет выведено в консоль "Один" и "Два".
        switch (number) {
            case 1:
                System.out.println("Один");
            case 2:
                System.out.println("Два");
            case 3:
                System.out.println("Три");
                break;
            default:
                System.out.println("Не один, два или три");
        }

        //Блок default может находиться в любом месте, даже в начале switch. Проверка условий в case
        //всегда происходит раньше, чем выполнение default блока. Если не будет найдено ни одного совпадения,
        //то выполнится default блок.
        switch ("D") {
            case "A": {
                System.out.println("Letter A");
                break;
            }
            default: {
                System.out.println("Default");
//                break; //Если break не указан, то выполняться будут нижележащие блоки до первого оператора break.
                         //В данном пример будет напечатано "Default" и "Letter B". Если в switch передать "B", то
                         //в консоль будет выведено "Letter B".
            }
            case "B": {
                System.out.println("Letter B");
                break;
            }
            case "C": {
                System.out.println("Letter C");
                break;
            }
        }
    }
}
