package brainacad;

/**
 * автоматическое преобразование, с потерей точности: int -> float.
 * 1. Проинициализировать переменную типа int максимальным значением
 * 2. Присвоить ее значение переменной типа float
 * 3. Вывести оба числа на экран
 */
public class ItemThree {
    public static void main(String[] args) {
        int intMax = 2_147_483_647;
        float intMaxToFloat = intMax;
        System.out.println("intMax = " + intMax);
        System.out.println("intMaxToFloat = " + intMaxToFloat);
    }
}
