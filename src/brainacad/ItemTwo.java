package brainacad;

/**
 * Применить на практике возможные преобразования без потери точности.
 * 1. byte -> short -> int -> long
 * 2. int -> double
 * 3. short -> float -> double
 * 4. char -> int
 */
public class ItemTwo {
    public static void main(String[] args) {
        byte myByte = 123;
        short myByteShort = myByte;
        int myByteShortInt = myByteShort;
        long myByteShortIntLong = myByteShortInt;
        System.out.println("1. byte -> short -> int -> long");
        System.out.println("\t" + myByte + " -> " + myByteShort + " -> " + myByteShortInt + " -> " + myByteShortIntLong);

        int myInt = 1_000_000_000;
        double myIntDouble = myInt;
        System.out.println("\n2. int -> double");
        System.out.println("\t" + myInt + " -> " + myIntDouble);

        short myShort = 20_000;
        float myShortFloat = myShort;
        double myShortFloatDouble = myShortFloat;
        System.out.println("\n3. short -> float -> double");
        System.out.println("\t" + myShort + " -> " + myShortFloat + " -> " + myShortFloatDouble);

        char myChar = '@';
        int myCharInt = myChar;
        System.out.println("\n4. char -> int");
        System.out.println("\t" + myChar + " -> " + myCharInt);
    }
}
