package brainacad;

/**
 * Написать программу, где объявлены и проинициализированы все примитивные типы данных.
 * (byte, short, int, long, float, double, char, boolean)
 * Необходимо вывести на экран все значения этих переменных.
 */
public class ItemOne {
    public static void main(String[] args) {
        byte myByte = 100;
        short myShort = 20_000;
        int myInt = 1_000_000_000;
        long myLong = 3_000_000_000_000_000_000L;
        float myFloat = 114.245f;
        double myDouble = 123.111_422;
        char myChar = '@';
        boolean myBoolean = false;

        System.out.println("byte myByte = " + myByte);
        System.out.println("short myShort = " + myShort);
        System.out.println("int myInt = " + myInt);
        System.out.println("long myLong = " + myLong);
        System.out.println("float myFloat = " + myFloat);
        System.out.println("double myDouble = " + myDouble);
        System.out.println("char myChar = " + myChar);
        System.out.println("boolean myBoolean = " + myBoolean);
    }
}
