package brainacad;

/**
 * переполнения мантиссы числа в java
 * 1.Создать переменную типа byte и проинициализировать ее максимальным значением
 * 2.Выполнить операцию "инкремент" для этой переменной
 * 3.Вывести значение на экран
 */
public class ItemFour {
    public static void main(String[] args) {
        byte maxByte = 127;
        maxByte++;
        System.out.println("maxByte = " + maxByte);
    }

}
