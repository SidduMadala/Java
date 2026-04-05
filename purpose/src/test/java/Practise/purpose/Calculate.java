package Practise.purpose;

public class Calculate {

    public static void main(String[] args) {
        calculator();
    }

    static void calculator() {
        for (int i = 0; i < 5; i++) {
            if (i != 2) {
                int j = i / (i - 2);
                System.out.println(j);
            } else {
                System.out.println("Division by zero is not allowed");
            }
        }
    }
}
