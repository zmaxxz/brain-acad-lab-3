package brainacad;

/**
 * Тернарная операция, которая определяет четность числа и формирует
 * соответствующую строку, которая выводится на экран
 */
public class ItemFive {
    public static void main(String[] args) {
        int num1=15;
        int num2=76;
        System.out.println("num1 = "+num1+(num1%2==0?" - четное":" - нечетное"));
        System.out.println("num1 = "+num2+(num2%2==0?" - четное":" - нечетное"));
    }
}
